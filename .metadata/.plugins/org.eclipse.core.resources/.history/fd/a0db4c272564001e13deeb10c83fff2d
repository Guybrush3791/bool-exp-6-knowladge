package org.java.app.mvc.controller;

import java.util.List;

import org.java.app.db.pojo.Book;
import org.java.app.db.serv.BookService;
import org.springframework.beans.factory.annotation.Autowired;
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
			BindingResult bindingResult
			) {
		
		System.out.println("New book: " + book);
		
		if (bindingResult.hasErrors()) {
			System.out.println("Error:");
			bindingResult.getAllErrors().forEach(System.out::println);
			
			return "book-create";
		} else 
			System.out.println("No error");
		
		return "redirect:/books";
	}
}
