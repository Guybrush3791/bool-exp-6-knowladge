package org.java.app.db.serv;

import java.util.List;

import org.java.app.db.pojo.Book;
import org.java.app.db.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
