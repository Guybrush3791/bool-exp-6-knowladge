package org.java.app.pizzeria.mvc.controller;

import java.util.List;

import org.java.app.pizzeria.pojo.Ingredient;
import org.java.app.pizzeria.serv.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {

	@Autowired
	private IngredientService ingredientService;
	
	@GetMapping
	public String getIndex(Model model) {
		
		List<Ingredient> ingredients = ingredientService.findAll();
		model.addAttribute("ingredients", ingredients);
		
		return "ingredient-index";
	}
	
	@GetMapping("/create")
	public String getCreateForm(Model model) {
		
		model.addAttribute("ingredient", new Ingredient());
		
		return "ingredient-form";
	}
	@PostMapping("/create")
	public String storeNewIngredient(
			@Valid @ModelAttribute Ingredient ingredient,
			BindingResult bindingResult,
			Model model
		) {
		
		if (bindingResult.hasErrors()) {
			
			return "ingredient-form";
		}
		
		ingredientService.save(ingredient);
		
		return "redirect:/ingredients";
	}
	
	@PostMapping("/delete/{id}")
	public String deleteIngredient(
			@PathVariable int id
		) {
		
		Ingredient ingredient = ingredientService.findById(id);
		ingredientService.delete(ingredient);
		
		return "redirect:/ingredients";
	}
}
