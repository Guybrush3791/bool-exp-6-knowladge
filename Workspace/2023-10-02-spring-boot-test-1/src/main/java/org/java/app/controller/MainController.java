package org.java.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/")
	@ResponseBody
	public String test() {
		
		return "<html><body><h1>Hello, World!</h1></body></html>";
	}
	
	@GetMapping("/test1")
	public String test1() {
		
		return "test-1";
	}
}
