package org.java.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/")
	@ResponseBody
	public String test() {
		
		return "<html><body><h1>Hello, World!</h1></body></html>";
	}
	
	@GetMapping("/test1")
	public String test1(Model model) {
	
		final String name = "Pluto";
		
		model.addAttribute("name", name);
		
		return "test-1";
	}
	
	@GetMapping("/test2/{id}")
	public String test2(@PathVariable int id, Model model) {
		
		model.addAttribute("id", id);
		
		return "test-2";
	}
}
