package org.java.app.db.serv;

import java.util.List;

import org.java.app.db.pojo.Borrowing;
import org.java.app.db.repo.BorrowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowingService {

	@Autowired
	private BorrowingRepo borrowingRepo;
	
	public List<Borrowing> findAll() {
		
		return borrowingRepo.findAll();
	}
	public Borrowing findById(int id) {
		
		return borrowingRepo.findById(id).get();
	}
	public void save(Borrowing borrowing) {
		
		borrowingRepo.save(borrowing);
	}
	public void delete(Borrowing borrowing) {
		
		borrowingRepo.delete(borrowing);
	}
}
