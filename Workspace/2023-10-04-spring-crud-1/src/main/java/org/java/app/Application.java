package org.java.app;

import java.time.LocalDate;

import org.java.app.db.pojo.Book;
import org.java.app.db.serv.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
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
	}
}
