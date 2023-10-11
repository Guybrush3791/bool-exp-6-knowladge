package org.java.app.db.repo;

import java.util.List;

import org.java.app.db.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

	public List<Book> findByTitle(String title);
}
