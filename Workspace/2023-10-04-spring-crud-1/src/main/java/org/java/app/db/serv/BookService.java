package org.java.app.db.serv;

import org.java.app.db.pojo.Book;
import org.java.app.db.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	public void insertBook(Book book) {
		
		
	}
}
