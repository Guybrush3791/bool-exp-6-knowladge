package org.java.app;

import java.time.LocalDate;

import org.java.app.pizzeria.auth.pojo.Role;
import org.java.app.pizzeria.auth.pojo.User;
import org.java.app.pizzeria.auth.service.RoleService;
import org.java.app.pizzeria.auth.service.UserService;
import org.java.app.pizzeria.pojo.Ingredient;
import org.java.app.pizzeria.pojo.Pizza;
import org.java.app.pizzeria.pojo.SpecialOffert;
import org.java.app.pizzeria.serv.IngredientService;
import org.java.app.pizzeria.serv.PizzaServ;
import org.java.app.pizzeria.serv.SpecialOffertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PizzaServ pizzaServ;
	
	@Autowired
	private SpecialOffertService specialOffertService;
	
	@Autowired
	private IngredientService ingredientService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ingredient ing1 = new Ingredient("ing 1");
		Ingredient ing2 = new Ingredient("ing 2");
		Ingredient ing3 = new Ingredient("ing 3");
		Ingredient ing4 = new Ingredient("ing 4");
		
		ingredientService.save(ing1);
		ingredientService.save(ing2);
		ingredientService.save(ing3);
		ingredientService.save(ing4);
		
		String photo = "https://upload.wikimedia.org/wikipedia/commons/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg";

		Pizza pizza1 = new Pizza("pizza 1", "desc pizza 1", photo, 10, ing1, ing2, ing3);
		Pizza pizza2 = new Pizza("pizza 2", "desc pizza 2", photo, 12, ing1);
		Pizza pizza3 = new Pizza("pizza 3", "desc pizza 3", photo, 14, ing2, ing4);
		Pizza pizza4 = new Pizza("pizza 4", "desc pizza 4", photo, 16, ing3, ing4);
		Pizza pizza5 = new Pizza("pizza 14", "desc pizza 5", photo, 18, ing3);

		pizzaServ.save(pizza1);
		pizzaServ.save(pizza2);
		pizzaServ.save(pizza3);
		pizzaServ.save(pizza4);
		pizzaServ.save(pizza5);

		System.out.println("Insert OK");
		
		SpecialOffert so1 = new SpecialOffert("so 1", LocalDate.now(), 
				LocalDate.parse("2023-10-30"), pizza1);
		SpecialOffert so2 = new SpecialOffert("so 2", LocalDate.now(), 
				LocalDate.parse("2023-11-05"), pizza2);
		SpecialOffert so3 = new SpecialOffert("so 3", LocalDate.now(), 
				LocalDate.parse("2023-11-13"), pizza2);
		
		specialOffertService.save(so1);
		specialOffertService.save(so2);
		specialOffertService.save(so3);
		
		Role userRole = new Role("USER");
		Role adminRole = new Role("ADMIN");
		
		roleService.save(userRole);
		roleService.save(adminRole);
		
		final String pwsUser = new BCryptPasswordEncoder().encode("pws");
		final String pwsAdmin = new BCryptPasswordEncoder().encode("pws");
		
		User guybrushUser = new User("guybrushUser", pwsUser, userRole);
		User guybrushAdmin = new User("guybrushAdmin", pwsAdmin, adminRole);
		
		userService.save(guybrushUser);
		userService.save(guybrushAdmin);
	}
}
