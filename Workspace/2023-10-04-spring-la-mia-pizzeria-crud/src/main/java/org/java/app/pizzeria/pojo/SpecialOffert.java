package org.java.app.pizzeria.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SpecialOffert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	@Length(min = 3, max = 255)
	private String title;
	
	@Column(nullable = false)
	private LocalDate startDate;
	
	@Column(nullable = false)
	private LocalDate endDate;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	@JsonBackReference
	private Pizza pizza;
	
	public SpecialOffert() { }
	public SpecialOffert(String title, LocalDate startDate, LocalDate endDate, Pizza pizza) {
		
		setTitle(title);
		setStartDate(startDate);
		setEndDate(endDate);
		setPizza(pizza);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getHtmlStartDate() {
		
		return getStartDate() == null
				? null
				: getStartDate().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
	}
	public void setHtmlStartDate(String startDate) {
		
		setStartDate(LocalDate.parse(startDate));
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getHtmlEndDate() {
		
		return getEndDate() == null
				? null
				: getEndDate().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
	}
	public void setHtmlEndDate(String endDate) {
		
		setEndDate(LocalDate.parse(endDate));
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getTitle() + ": " 
				+ getStartDate() + " ~ " + getEndDate();
	}
}
