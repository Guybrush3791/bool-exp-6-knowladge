package org.java.app.pizzeria.mvc.controller;

import java.util.List;

import org.java.app.pizzeria.pojo.Ingredient;
import org.java.app.pizzeria.pojo.Pizza;
import org.java.app.pizzeria.pojo.SpecialOffert;
import org.java.app.pizzeria.serv.IngredientService;
import org.java.app.pizzeria.serv.PizzaServ;
import org.java.app.pizzeria.serv.SpecialOffertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class PizzaController {

	@Autowired
	private PizzaServ pizzaServ;
	
	@Autowired
	private SpecialOffertService specialOffertService;
	
	@Autowired 
	private IngredientService ingredientService;
	
	@GetMapping
	public String getIndex(@RequestParam(required = false, name = "search") String searchTitle, Model model) {

		System.out.println("search: " + searchTitle);

//		List<Pizza> pizze = pizzaServ.findAll();
		List<Pizza> pizze = searchTitle == null
								? pizzaServ.findAll()
								: pizzaServ.findByName(searchTitle);

		model.addAttribute("pizze", pizze);
		model.addAttribute("searchTitle", searchTitle);

		return "pizza-index";
	}

	@GetMapping("/pizzas/{id}")
	public String getShow(@PathVariable int id, Model model) {

		Pizza pizza = pizzaServ.findById(id).get();
		model.addAttribute("pizza", pizza);

		return "pizza-show";
	}

	@GetMapping("/pizzas/create")
	public String getCreateForm(Model model) {

		List<Ingredient> ingredients = ingredientService.findAll();
		
		model.addAttribute("pizza", new Pizza());
		model.addAttribute("ingredients", ingredients);

		return "pizza-form";
	}
	@PostMapping("/pizzas/create")
	public String storeNewPizza(
			@Valid @ModelAttribute Pizza pizza,
			BindingResult bindingResult,
			Model model
		) {

		return storePizza(pizza, bindingResult);
	}
	
	@GetMapping("/pizzas/edit/{id}")
	public String getEditForm(
			@PathVariable int id,
			Model model
		) {
		
		List<Ingredient> ingredients = ingredientService.findAll();
		Pizza pizza = pizzaServ.findById(id).get();
		
		model.addAttribute("pizza", pizza);
		model.addAttribute("ingredients", ingredients);
		
		return "pizza-form";
	}
	@PostMapping("/pizzas/edit/{id}")
	public String updatePizza(
			@Valid @ModelAttribute Pizza pizza,
			BindingResult bindingResult
		) {
		
		return storePizza(pizza, bindingResult);
	}
	
	@PostMapping("/pizzas/delete/{id}")
	public String deletePizza(
			@PathVariable int id
		) {
		
		Pizza pizza = pizzaServ.findById(id).get();
		pizzaServ.deletePizza(pizza);
		
		return "redirect:/";
	}
	
	@GetMapping("/pizzas/specialoffert/{pizza_id}")
	public String getSpecialOffertCreateForm(
			@PathVariable("pizza_id") int id,
			Model model
		) {
		
		Pizza pizza = pizzaServ.findById(id).get();
		
		model.addAttribute("pizza", pizza);
		model.addAttribute("specialOffert", new SpecialOffert());
		
		return "special-offert-form";
	}
	@PostMapping("/pizzas/specialoffert/{pizza_id}")
	public String storeSpecialOffert(
			@Valid @ModelAttribute SpecialOffert specialOffert,
			BindingResult bindingResult,
			@PathVariable("pizza_id") int id,
			Model model
		) {
		
		if (bindingResult.hasErrors()) {
			
			return "special-offert-form"; 
		}
		
		Pizza pizza = pizzaServ.findById(id).get();
		specialOffert.setPizza(pizza);
		
		specialOffertService.save(specialOffert);
		
		return "redirect:/";
	}
	
	@GetMapping("/pizzas/specialoffert/edit/{so_id}")
	public String editSpecialOffert(
			@PathVariable("so_id") int id,
			Model model
		) {
		
		SpecialOffert so = specialOffertService.findById(id);
		Pizza pizza = so.getPizza();
		
		model.addAttribute("pizza", pizza);
		model.addAttribute("specialOffert", so);
		
		return "special-offert-form";
	}
	@PostMapping("/pizzas/specialoffert/edit/{so_id}")
	public String updateSpecialOffert(
			@Valid @ModelAttribute SpecialOffert specialOffert,
			BindingResult bindingResult,
			@PathVariable("so_id") int id,
			Model model
		) {
		
		if (bindingResult.hasErrors()) {
			
			return "special-offert-form"; 
		}
		
		SpecialOffert oldOffert = specialOffertService.findById(id);
		Pizza pizza = oldOffert.getPizza();
		specialOffert.setPizza(pizza);
		
		specialOffertService.save(specialOffert);
		
		return "redirect:/pizzas/" + pizza.getId();
	}
	
	private String storePizza(Pizza pizza, BindingResult bindingResult) {
		
		System.out.println("pizza:\n" + pizza);

		if (bindingResult.hasErrors()) {

			System.out.println("Errors");
			bindingResult.getAllErrors().stream()
					.map(e -> e.getDefaultMessage())
				.forEach(System.out::println);

			return "pizza-form";
		}

		pizzaServ.save(pizza);

		return "redirect:/";
	}
}
