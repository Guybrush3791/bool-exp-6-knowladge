package org.java.app;

import java.time.LocalDate;

import org.java.app.db.pojo.Book;
import org.java.app.db.pojo.Borrowing;
import org.java.app.db.pojo.Category;
import org.java.app.db.serv.BookService;
import org.java.app.db.serv.BorrowingService;
import org.java.app.db.serv.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BorrowingService borrowingService;
	
	@Autowired
	private CategoryService categoryService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LocalDate pastDate = LocalDate.parse("2023-01-01");

		Book book1 = new Book("mio titolo 1", "mio sottotitolo 1", pastDate, "1234231234567894");
		Book book2 = new Book("mio titolo 2", "mio sottotitolo 2", pastDate, "1234238473843835");
		Book book3 = new Book("mio titolo 3", "mio sottotitolo 3", pastDate, "1234233948793486");

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
		
		Book[] books = new Book[] {book1, book2};
		
		Category c1 = new Category("cat 1", "desc cat 1");
	}
}
