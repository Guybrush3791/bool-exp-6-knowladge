package org.java.app.db.repo;

import org.hibernate.mapping.List;
import org.java.app.db.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

	public List<Book> findByTitle(String title);
	public List<Book> findByTitleContaining(String title);
	public List<Book> findByTitleOrSubtitleContaining(String title, String subtitle);
}
