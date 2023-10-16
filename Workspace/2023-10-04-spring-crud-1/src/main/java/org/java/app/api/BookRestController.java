package org.java.app.api;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.java.app.db.pojo.Book;
import org.java.app.db.serv.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Past;

@RestController
@CrossOrigin
@RequestMapping("/api/v1.0")
public class BookRestController {

	public static class BookDTO {
		
		private int id;
		@Length(
				min = 3,
				max = 128,
				message = "il titolo deve essere composto da 3~128 caratteri"
			)
		private String title;
		@Nullable
		private String subtitle;
		@Past
		private LocalDate releaseDate;
		@Length(
				min = 16,
				max = 16,
				message = "isbn deve essere di 16 caratteri"
			)
		private String isbn;
		
		public BookDTO() { }
		public BookDTO(String title) {
			
			setTitle(title);
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public LocalDate getReleaseDate() {
			return releaseDate;
		}
		public void setReleaseDate(LocalDate releaseDate) {
			this.releaseDate = releaseDate;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		
		@Override
		public String toString() {
			
			return  "id: " + getId()
					+ "\ntitle: " + getTitle() 
					+ "\nrelease date: " + getReleaseDate() 
					+ "\nisbn: " + getIsbn();
		}
	}
	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public ResponseEntity<List<Book>> getAll() {
		
		List<Book> books = bookService.findAll();
		
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<String> save(
			@RequestBody Book bookDto
		) {
		
//		System.out.println("Api book:\n" + book);
//		System.out.println("Api value: " + value);
		
		System.out.println("Api book DTO:\n" + bookDto);
		
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
}
