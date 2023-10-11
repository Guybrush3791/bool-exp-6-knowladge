package org.java.app.mvc.controller;

import org.hibernate.mapping.List;
import org.java.app.db.pojo.Book;
import org.java.app.db.serv.BookService;
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

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

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

		Book book = bookService.findById(id);
		model.addAttribute("book", book);

		return "book-show";
	}

	@GetMapping("/create")
	public String getCreateForm(Model model) {

		model.addAttribute("book", new Book());

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

		Book book = bookService.findById(id);
		model.addAttribute("book", book);

		return "book-create";
	}
	@PostMapping("/update/{id}")
	public String updateBook(
			@Valid @ModelAttribute Book book,
			BindingResult bindingResult,
			Model model
		) {

		System.out.println("Update book:\n" + book);

		return saveBook(book, bindingResult, model);
	}

	@PostMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {

		Book book = bookService.findById(id);
		bookService.deleteBook(book);

		return "redirect:/books";
	}

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
