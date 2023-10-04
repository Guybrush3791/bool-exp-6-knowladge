package org.java.app;

import java.time.LocalDate;

import org.java.app.db.pojo.Book;
import org.java.app.db.serv.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book book1 = new Book("mio titolo 1", "mio sottotitolo 1", LocalDate.now(), "1234234");
		Book book2 = new Book("mio titolo 2", "mio sottotitolo 2", LocalDate.now(), "1234235");
		Book book3 = new Book("mio titolo 3", "mio sottotitolo 3", LocalDate.now(), "1234236");
		
		bookService.save(book1);
		bookService.save(book2);
		bookService.save(book3);
	}
}