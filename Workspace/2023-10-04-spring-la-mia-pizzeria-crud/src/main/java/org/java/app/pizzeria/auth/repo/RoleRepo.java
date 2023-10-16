package org.java.app.pizzeria.auth.repo;

import org.java.app.pizzeria.auth.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {

}
