package org.java.app.api;

import java.util.List;
import java.util.Optional;

import org.java.app.api.dto.BookDTO;
import org.java.app.db.pojo.Book;
import org.java.app.db.serv.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1.0")
public class BookRestController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public ResponseEntity<List<Book>> getAll() {
		
		List<Book> books = bookService.findAll();
		
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Integer> save(
			@RequestBody BookDTO bookDto
		) {
		
		Book book = new Book(bookDto);
		
		System.out.println("Api book SAVE:\n" + book);
		book = bookService.save(book);
		
		return new ResponseEntity<>(book.getId(), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Book> getBook(
			@PathVariable int id
		) {
		
		Optional<Book> optBook = bookService.findById(id);
		
		if (optBook.isEmpty()) {
			
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(optBook.get(), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Book> updateBook(
			@PathVariable int id,
			@RequestBody BookDTO bookDto
		) {
		
		Optional<Book> optBook = bookService.findById(id);
		
		if (optBook.isEmpty()) {
			
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		Book book = optBook.get();
		book.fillFromBookDto(bookDto);
	
		try {
			
			book = bookService.save(book);
			
			return new ResponseEntity<>(book, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Boolean> deleteBook(
			@PathVariable int id
		) {
		
		Optional<Book> optBook = bookService.findById(id);
		
		if (optBook.isEmpty()) {
			
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		Book book = optBook.get();
		bookService.deleteBook(book);
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}		
}
