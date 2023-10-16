package org.java.app.db.serv;

import java.util.List;
import java.util.Optional;

import org.java.app.db.pojo.Book;
import org.java.app.db.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	public Book save(Book book) {

		return bookRepo.save(book);
	}
	public List<Book> findAll() {

		return bookRepo.findAll();
	}
	public Optional<Book> findById(int id) {

		return bookRepo.findById(id);
	}

	public List<Book> findByTitle(String title) {

		return bookRepo.findByTitleOrSubtitleContaining(title, title);
	}

	public void deleteBook(Book book) {

		bookRepo.delete(book);
	}
}
