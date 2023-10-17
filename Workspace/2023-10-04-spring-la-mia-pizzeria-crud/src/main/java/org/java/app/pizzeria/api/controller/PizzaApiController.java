package org.java.app.pizzeria.api.controller;

import java.util.List;

import org.java.app.pizzeria.pojo.Pizza;
import org.java.app.pizzeria.serv.PizzaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1.0/pizzas")
public class PizzaApiController {

	@Autowired
	private PizzaServ pizzaServ;
	
	@GetMapping
	public ResponseEntity<List<Pizza>> getAllPizzas(
			@RequestParam(required = false, name = "q") String query
		) {
		
		List<Pizza> pizzas = null;
		
		if (query == null) 
			pizzas = pizzaServ.findAll();
		else 
			pizzas = pizzaServ.findByName(query);
		
		return new ResponseEntity<>(pizzas, HttpStatus.OK);
	}
}
