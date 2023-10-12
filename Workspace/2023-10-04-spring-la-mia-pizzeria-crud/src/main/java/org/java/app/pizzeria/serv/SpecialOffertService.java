package org.java.app.pizzeria.serv;

import java.util.List;

import org.java.app.pizzeria.pojo.SpecialOffert;
import org.java.app.pizzeria.repo.SpecialOffertRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialOffertService {

	@Autowired
	private SpecialOffertRepo specialOffertRepo;
	
	public List<SpecialOffert> findAll() {
		
		return specialOffertRepo.findAll();
	}
	public SpecialOffert findById(int id) {
		
		return specialOffertRepo.findById(id).get();
	}
	public void save(SpecialOffert specialOffert) {
		
		specialOffertRepo.save(specialOffert);
	}
}
