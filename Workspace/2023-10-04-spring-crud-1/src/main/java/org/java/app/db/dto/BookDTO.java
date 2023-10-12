package org.java.app.db.dto;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.java.app.db.pojo.Borrowing;
import org.java.app.db.pojo.Category;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;

public class BookDTO {

	private int id;

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

	@Length(
		min = 16,
		max = 16,
		message = "isbn deve essere di 16 caratteri"
	)
	private String isbn;
	
	private List<Borrowing> borrowings;
	private List<String> categories;
	
	public BookDTO() { }

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

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
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

	public List<Borrowing> getBorrowings() {
		return borrowings;
	}

	public void setBorrowings(List<Borrowing> borrowings) {
		this.borrowings = borrowings;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
}
