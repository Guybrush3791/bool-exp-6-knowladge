package org.java.app.mvc.controller;

import java.util.List;

import org.java.app.db.pojo.Book;
import org.java.app.db.pojo.Category;
import org.java.app.db.serv.BookService;
import org.java.app.db.serv.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public String getIndex(Model model) {
		
		List<Category> categories = categoryService.findAll();
		model.addAttribute("categories", categories);
		
		return "category-index";
	}
	
	@GetMapping("/create")
	public String getCreate(Model model) {
		
		List<Book> books = bookService.findAll();
		Category category = new Category();
		
		model.addAttribute("category", category);
		model.addAttribute("books", books);
		
		return "category-create";
	}
}
