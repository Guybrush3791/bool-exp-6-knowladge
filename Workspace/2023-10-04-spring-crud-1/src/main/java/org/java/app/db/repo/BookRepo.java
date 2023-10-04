package org.java.app.db.repo;

import org.java.app.db.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
