package org.java.app.pizzeria.api.controller;

import java.util.List;
import java.util.Optional;

import org.java.app.pizzeria.api.dto.PizzaDTO;
import org.java.app.pizzeria.pojo.Pizza;
import org.java.app.pizzeria.serv.PizzaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("{id}")
	public ResponseEntity<Pizza> getPizzaById(
			@PathVariable int id
		) {
		
		Optional<Pizza> optPizza = pizzaServ.findById(id);
		
		if (optPizza.isEmpty()) {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(optPizza.get(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Pizza> createPizza(
			@RequestBody PizzaDTO pizzaDto
		) {
		
		Pizza pizza = new Pizza(pizzaDto);
		pizza = pizzaServ.save(pizza);
		
		return new ResponseEntity<>(pizza, HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Pizza> updatePizza(
			@PathVariable int id,
			@RequestBody PizzaDTO pizzaDto
		) {
		
		Optional<Pizza> optPizza = pizzaServ.findById(id);
		
		if (optPizza.isEmpty())
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		Pizza pizza = optPizza.get();
		pizza.fillFromDto(pizzaDto);
		
		pizza = pizzaServ.save(pizza);
		
		return new ResponseEntity<>(pizza, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Boolean> deletePizza(
			@PathVariable int id
		) {
		
		Optional<Pizza> optPizza = pizzaServ.findById(id);
		
		if (optPizza.isEmpty())
			return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
		
		Pizza pizza = optPizza.get();
		
		pizzaServ.deletePizza(pizza);
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
}
