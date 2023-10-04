package org.java.app.db.pojo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 128, nullable = false)
	private String title;
	private String subTitle;
	
	private LocalDate releaseDate;
	@Column(unique = true)
	private String isbn;
	
	public Book() { }
	public Book(String title, String subTitle, LocalDate releaseDate, String isbn) {
	
		setTitle(title);
		setSubTitle(subTitle);
		setReleaseDate(releaseDate);
		setIsbn(isbn);
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
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] Book:\n"
					+ "title: " + getTitle()
					+ "sub-title: " + getSubTitle()
					+ "release date: " + getReleaseDate()
					+ "ISBN: " + getIsbn();
	}
}
