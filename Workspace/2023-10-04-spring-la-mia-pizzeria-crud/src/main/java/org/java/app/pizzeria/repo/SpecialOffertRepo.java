package org.java.app.pizzeria.repo;

import org.java.app.pizzeria.pojo.SpecialOffert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialOffertRepo extends JpaRepository<SpecialOffert, Integer> {

}
