package org.java.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String getIndex(Model model) {
		
		final String name = "Guybrush";
		model.addAttribute("name", name);
		
		return "index";
	}
}
