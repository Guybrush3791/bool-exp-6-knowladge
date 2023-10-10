package org.java.app.db.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.hibernate.validator.constraints.Length;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 128, nullable = false)
	@Length(
		min = 3, 
		max = 128, 
		message = "il titolo deve essere composto da 3~128 caratteri"
	)
	private String title;
	
	@Nullable
	private String subtitle;

	@Past
	private LocalDate releaseDate;

	@Column(unique = true, columnDefinition = "text")
	@Length(
		min = 16,
		max = 16,
		message = "isbn deve essere di 16 caratteri"
	)
	private String isbn;

	public Book() { }
	public Book(String title, String subtitle, LocalDate releaseDate, String isbn) {

		setTitle(title);
		setSubtitle(subtitle);
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
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subTitle) {
		this.subtitle = subTitle;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getHtmlDate() {
		
		return getReleaseDate().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
	}
	public void setHtmlDate(String date) {
		
		setReleaseDate(LocalDate.parse(date));
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
					+ "title: " + getTitle() + "\n"
					+ "sub-title: " + getSubtitle() + "\n"
					+ "release date: " + getReleaseDate() + "\n"
					+ "ISBN: " + getIsbn();
	}
}
