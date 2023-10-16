package org.java.app.db.pojo;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	private String description;
	
	@ManyToMany(mappedBy = "categories")
	@JsonBackReference
	private List<Book> books;
	
	public Category() { }
	public Category(String name, String description, Book... books) {
		
		setName(name);
		setDescription(description);
		setBooks(Arrays.asList(books));
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
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public boolean hasBook(Book book) {
		
		if (getBooks() == null) return false;
		
		for (Book b : getBooks()) 
			if (b.getId() == book.getId())
				return true;
		
		return false;
	}
	public void addBooks(Book... books) {
		
		getBooks().addAll(Arrays.asList(books));
	}
	public void removeBooks(Book... books) {
		
		getBooks().removeAll(Arrays.asList(books));
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getName() + "\n" + getDescription();
	}
}
