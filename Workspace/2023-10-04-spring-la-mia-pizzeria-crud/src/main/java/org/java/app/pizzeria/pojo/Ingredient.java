package org.java.app.pizzeria.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany(mappedBy = "ingredients")
	private List<Pizza> pizzas;
	
	private String name;
	
	public Ingredient() { }
	public Ingredient(String name) {
		
		setName(name);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Pizza> getPizzas() {
		return pizzas;
	}
	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getName();
	}
	@Override
	public int hashCode() {
		
		return getId();
	}
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Ingredient)) return false;
		
		Ingredient objIng = (Ingredient) obj;
		
		return getId() == objIng.getId();
	}
	
	
}
