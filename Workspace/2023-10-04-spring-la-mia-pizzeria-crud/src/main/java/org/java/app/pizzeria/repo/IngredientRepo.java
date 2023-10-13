package org.java.app.pizzeria.repo;

import org.java.app.pizzeria.pojo.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepo extends JpaRepository<Ingredient, Integer> {

}
