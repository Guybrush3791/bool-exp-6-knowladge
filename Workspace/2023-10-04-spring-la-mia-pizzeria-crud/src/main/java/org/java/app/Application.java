package org.java.app;

import org.java.app.pizzeria.pojo.Pizza;
import org.java.app.pizzeria.serv.PizzaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PizzaServ pizzaServ;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Pizza pizza1 = new Pizza("pizza 1", "desc pizza 1", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fit.wikipedia.org%2Fwiki%2FPizza_napoletana&psig=AOvVaw1XtZhspNkgHeHJuy1umRvU&ust=1696577642654000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJD62K-y3oEDFQAAAAAdAAAAABAE", 10);
//		Pizza pizza2 = new Pizza("pizza 2", "desc pizza 2", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fit.wikipedia.org%2Fwiki%2FPizza_napoletana&psig=AOvVaw1XtZhspNkgHeHJuy1umRvU&ust=1696577642654000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJD62K-y3oEDFQAAAAAdAAAAABAE", 12);
//		Pizza pizza3 = new Pizza("pizza 3", "desc pizza 3", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fit.wikipedia.org%2Fwiki%2FPizza_napoletana&psig=AOvVaw1XtZhspNkgHeHJuy1umRvU&ust=1696577642654000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJD62K-y3oEDFQAAAAAdAAAAABAE", 14);
//		Pizza pizza4 = new Pizza("pizza 4", "desc pizza 4", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fit.wikipedia.org%2Fwiki%2FPizza_napoletana&psig=AOvVaw1XtZhspNkgHeHJuy1umRvU&ust=1696577642654000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJD62K-y3oEDFQAAAAAdAAAAABAE", 16);
//		
//		pizzaServ.save(pizza1);
//		pizzaServ.save(pizza2);
//		pizzaServ.save(pizza3);
//		pizzaServ.save(pizza4);
//		
//		System.out.println("Insert OK");
	}
}
