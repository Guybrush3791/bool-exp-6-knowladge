package org.java.app;



@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PizzaServ pizzaServ;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		String photo = "https://upload.wikimedia.org/wikipedia/commons/a/a3/Eq_it-na_pizza-margherita_sep2005_sml.jpg";
//
//		Pizza pizza1 = new Pizza("pizza 1", "desc pizza 1", photo, 10);
//		Pizza pizza2 = new Pizza("pizza 2", "desc pizza 2", photo, 12);
//		Pizza pizza3 = new Pizza("pizza 3", "desc pizza 3", photo, 14);
//		Pizza pizza4 = new Pizza("pizza 4", "desc pizza 4", photo, 16);
//		Pizza pizza5 = new Pizza("pizza 14", "desc pizza 5", photo, 18);
//
//		pizzaServ.save(pizza1);
//		pizzaServ.save(pizza2);
//		pizzaServ.save(pizza3);
//		pizzaServ.save(pizza4);
//		pizzaServ.save(pizza5);
//
//		System.out.println("Insert OK");
//	}
}
