package org.java.app.pizzeria.serv;

import java.util.List;

import org.java.app.pizzeria.pojo.Pizza;
import org.java.app.pizzeria.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServ {

	@Autowired
	private PizzaRepo pizzaRepo;
	
	public void save(Pizza pizza) {
		
		pizzaRepo.save(pizza);
	}
	
	public List<Pizza> findAll() {
		
		return pizzaRepo.findAll();
	}
	public List<Pizza> findByName(String name) {
		
		return pizzaRepo.findByNameContaining(name);
	}
	
	public Pizza findById(int id) {
		
		return pizzaRepo.findById(id).get();
	}
}
