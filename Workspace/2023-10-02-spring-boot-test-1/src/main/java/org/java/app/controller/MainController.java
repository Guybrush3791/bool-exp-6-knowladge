package org.java.app.controller;

import java.util.Arrays;
import java.util.List;

import org.java.app.pojo.TestObj;
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
	
	@GetMapping("/test3")
	public String test3(Model model) {
		
		TestObj to = new TestObj(10, "my name");
		List<TestObj> objs = Arrays.asList(new TestObj[] {
				new TestObj(1, "my name 1"),
				new TestObj(2, "my name 2"),
				new TestObj(3, "my name 3"),
				new TestObj(4, "my name 4"),
				new TestObj(5, "my name 5")
		});
		
		model.addAttribute("to", to);
		model.addAttribute("objs", objs);
		
		return "test-3";
	}
}
