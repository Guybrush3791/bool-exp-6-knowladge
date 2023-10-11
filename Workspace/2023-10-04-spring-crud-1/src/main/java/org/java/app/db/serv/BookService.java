package org.java.app.db.serv;

import org.hibernate.mapping.List;
import org.java.app.db.pojo.Book;
import org.java.app.db.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public void save(Book book) {

		bookRepo.save(book);
	}
	public List<Book> findAll() {

		return bookRepo.findAll();
	}
	public Book findById(int id) {

		return bookRepo.findById(id).get();
	}

	public List<Book> findByTitle(String title) {

		return bookRepo.findByTitleOrSubtitleContaining(title, title);
	}

	public void deleteBook(Book book) {

		bookRepo.delete(book);
	}
}
