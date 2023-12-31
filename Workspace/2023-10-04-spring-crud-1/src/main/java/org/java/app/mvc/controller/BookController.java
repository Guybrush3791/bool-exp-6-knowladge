package org.java.app.mvc.controller;

import java.time.LocalDate;
import java.util.List;

import org.java.app.db.pojo.Book;
import org.java.app.db.pojo.Borrowing;
import org.java.app.db.pojo.Category;
import org.java.app.db.serv.BookService;
import org.java.app.db.serv.BorrowingService;
import org.java.app.db.serv.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BorrowingService borrowingService; 
	
	@Autowired
	private CategoryService categoryService;

	// BOOK
	@GetMapping
	public String getIndex(
			Model model,
			@RequestParam(required = false) String title
		) {

		List<Book> books = title == null
					? bookService.findAll()
					: bookService.findByTitle(title);

		model.addAttribute("books", books);
		model.addAttribute("title", title);

		return "book-index";
	}

	@GetMapping("/{id}")
	public String getShow(@PathVariable int id, Model model) {

		Book book = bookService.findById(id).get();
		model.addAttribute("book", book);

		return "book-show";
	}

	@GetMapping("/create")
	public String getCreateForm(Model model) {

		List<Category> categories = categoryService.findAll();
		
		model.addAttribute("book", new Book());
		model.addAttribute("categories", categories);
		
		return "book-create";
	}
	@PostMapping("/create")
	public String storeBook(
			@Valid @ModelAttribute Book book,
			BindingResult bindingResult,
			Model model
			) {

		System.out.println("New book: " + book);

		return saveBook(book, bindingResult, model);
	}

	@GetMapping("/update/{id}")
	public String getBookUpdate(
			@PathVariable int id,
			Model model
		) {

		List<Category> categories = categoryService.findAll();
		Book book = bookService.findById(id).get();
		
		model.addAttribute("book", book);
		model.addAttribute("categories", categories);

		return "book-create";
	}
	@PostMapping("/update/{id}")
	public String updateBook(
			@Valid @ModelAttribute Book book,
			BindingResult bindingResult,
			Model model
		) {

		System.out.println("Update book:\n" + book);
		System.out.println("Categories:\n" + book.getCategories());

		return saveBook(book, bindingResult, model);
	}

	@PostMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {

		Book book = bookService.findById(id).get();
		bookService.deleteBook(book);

		return "redirect:/books";
	}

	// BORROW
	@GetMapping("/borrow/{book_id}")
	public String borrow(
			@PathVariable("book_id") int id,
			Model model
		) {
		
		Book book = bookService.findById(id).get();
		Borrowing borrowing = new Borrowing();
		
		model.addAttribute("book", book);		
		model.addAttribute("borrowing", borrowing);
		
		return "borrow-create";
	}
	@PostMapping("/borrow/{book_id}")
	public String storeBorrowing(
			@Valid @ModelAttribute Borrowing borrowing,
			BindingResult bindingResult,			
			@PathVariable("book_id") int id,
			Model model
		) {
		
		Book book = bookService.findById(id).get();
		
		borrowing.setBorrowingDate(LocalDate.now());
		borrowing.setBook(book);
		
		borrowingService.save(borrowing);
		
		return "redirect:/books/" + id;
	}
	
	@PostMapping("/borrow/delete/{borrow_id}")
	public String deleteBorrowing(
			@PathVariable("borrow_id") int id
		) {
		
		Borrowing borrowing = borrowingService.findById(id);
		Book book = borrowing.getBook();
		borrowingService.delete(borrowing);
		
		return "redirect:/books/" + book.getId();
	}
	
	@GetMapping("/borrow/edit/{borrow_id}")
	public String getBorrowEditForm(
			@PathVariable("borrow_id") int id,
			Model model
		) {
		
		Borrowing borrowing = borrowingService.findById(id);
		List<Book> books = bookService.findAll();
		
		model.addAttribute("borrowing", borrowing);
		model.addAttribute("books", books);
		
		return "borrow-edit";
	}
	@PostMapping("/borrow/edit/{borrow_id}")
	public String updateBorrow(
			@Valid @ModelAttribute Borrowing borrowing,
			BindingResult bindingResult,
			Model model
		) {
		
		borrowingService.save(borrowing);
		
		Book borrowedBook = borrowing.getBook();
		
		return "redirect:/books/" + borrowedBook.getId();
	}
	
	// PRIVATE METHODS
	private String saveBook(
			Book book,
			BindingResult bindingResult,
			Model model
		) {

		if (bindingResult.hasErrors()) {

			System.out.println("Error:");
			bindingResult.getAllErrors().stream()
					.map(e -> e.getDefaultMessage())
				.forEach(System.out::println);

			return "book-create";
		}

		try {
			bookService.save(book);
		} catch (DataIntegrityViolationException e) {

			// CONSTRAIN VALIDATION (unique)
			System.out.println("Errore constrain: " + e.getClass().getSimpleName());

			model.addAttribute("isbn_unique", "isbn deve essere unique");

			return "book-create";
		}

		return "redirect:/books";
	}
}
