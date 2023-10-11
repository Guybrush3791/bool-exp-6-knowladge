package org.java.app.pizzeria.mvc.controller;

import org.hibernate.mapping.List;
import org.java.app.pizzeria.pojo.Pizza;
import org.java.app.pizzeria.serv.PizzaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import jakarta.validation.Valid;

@Controller
public class PizzaController {

	@Autowired
	private PizzaServ pizzaServ;

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

		Pizza pizza = pizzaServ.findById(id);
		model.addAttribute("pizza", pizza);

		return "pizza-show";
	}

	@GetMapping("/pizzas/create")
	public String getCreateFormt(Model model) {

		model.addAttribute("pizza", new Pizza());

		return "pizza-create";
	}
	@PostMapping("/pizzas/create")
	public String storeNewPizza(
			@Valid @ModelAttribute Pizza pizza,
			BindingResult bindingResult,
			Model model
		) {

		System.out.println("pizza:\n" + pizza);

		if (bindingResult.hasErrors()) {

			System.out.println("Errors");
			bindingResult.getAllErrors().stream()
					.map(e -> e.getDefaultMessage())
				.forEach(System.out::println);

			return "pizza-create";
		}

		pizzaServ.save(pizza);

		return "redirect:/";
	}
}
