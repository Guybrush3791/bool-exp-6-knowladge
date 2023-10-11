package org.java.app.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingRepo extends JpaRepository<BorrowingRepo, Integer> {

}
