package org.java.app.pizzeria.api.dto;

public class PizzaDTO {

	private String name;
	private String description;
	private int price;
	
	public PizzaDTO() { }
	public PizzaDTO(String name, String description, int price) {
		
		setName(name);
		setDescription(description);
		setPrice(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "name: " + getName()
			+ "\ndescription: " + getDescription()
			+ "\nprice: " + getPrice();
	}
}
