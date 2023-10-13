package org.java.app;

import java.time.LocalDate;

import org.java.app.db.pojo.Book;
import org.java.app.db.pojo.Borrowing;
import org.java.app.db.pojo.Category;
import org.java.app.db.serv.BookService;
import org.java.app.db.serv.BorrowingService;
import org.java.app.db.serv.CategoryService;
import org.java.app.mvc.auth.pojo.Role;
import org.java.app.mvc.auth.pojo.User;
import org.java.app.mvc.auth.service.RoleService;
import org.java.app.mvc.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BorrowingService borrowingService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category c1 = new Category("cat 1", "desc cat 1");
		Category c2 = new Category("cat 2", "desc cat 2");
		Category c3 = new Category("cat 3", "desc cat 3");
		
		categoryService.save(c1);
		categoryService.save(c2);
		categoryService.save(c3);
		
		LocalDate pastDate = LocalDate.parse("2023-01-01");

		Book book1 = new Book("mio titolo 1", "mio sottotitolo 1", 
							  pastDate, "1234231234567894",
							  c1, c3);
		Book book2 = new Book("mio titolo 2", "mio sottotitolo 2", 
							  pastDate, "1234238473843835",
							  c1, c2);
		Book book3 = new Book("mio titolo 3", "mio sottotitolo 3", 
							  pastDate, "1234233948793486",
							  c2, c3);

		bookService.save(book1);
		bookService.save(book2);
		bookService.save(book3);

		System.out.println("Insert OK!");
		
		Borrowing borrowing1 = new Borrowing(
				LocalDate.now(), 
				LocalDate.parse("2023-02-01"), 
				null, book1);
		Borrowing borrowing2 = new Borrowing(
				LocalDate.now(), 
				LocalDate.parse("2023-01-15"), 
				"Cliente da attenzionare!", book2);
		Borrowing borrowing3 = new Borrowing(
				LocalDate.parse("2023-01-16"), 
				LocalDate.parse("2023-02-20"), 
				null, book2);
		
		borrowingService.save(borrowing1);
		borrowingService.save(borrowing2);
		borrowingService.save(borrowing3);
		
		Role admin = new Role("ADMIN");
		Role user = new Role("USER");
		
		roleService.save(admin);
		roleService.save(user);
		
		final String pwsAdmin = new BCryptPasswordEncoder().encode("pws");
		final String pwsUser = new BCryptPasswordEncoder().encode("pws");
		
		User guybrushAdmin = new User("guybrushAdmin", pwsAdmin, admin);
		User guybrushUser = new User("guybrushUser", pwsUser, user);
		
		userService.save(guybrushAdmin);
		userService.save(guybrushUser);
	}
}
