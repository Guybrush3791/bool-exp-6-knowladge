package org.java.app.pizzeria.repo;

import org.hibernate.mapping.List;
import org.java.app.pizzeria.pojo.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Integer> {

	public List findByNameContaining(String name);
}
