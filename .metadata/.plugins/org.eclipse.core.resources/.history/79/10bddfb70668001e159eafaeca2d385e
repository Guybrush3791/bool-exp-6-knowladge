package org.java.app.pizzeria.pojo;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, unique = true, length = 64)
	@Length(min = 3, max = 64, message = "Il nome deve essere compreso tra 3 e 64 caratteri")
	private String name;
	
	@Length(max = 255)
	private String description;
	
	@Length(max = 255)
	private String photo;
	
	@Min(0)
	@Max(100)
	private int price;
	
	public Pizza() { }
	public Pizza(String name, String description, String photo, int price) {
		
		setName(name);
		setDescription(description);
		setPhoto(photo);
		setPrice(price);
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "["+ getId() + "] " + getName() + ": " + getPrice() + "\n"
				+ getDescription() + "\n" 
				+ getPhoto();
				
	}
}
