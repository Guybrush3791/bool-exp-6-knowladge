package org.java.app.api.dto;

import java.time.LocalDate;

public class BookDTO {

	private int id;
	
	private String title;		
	private String subtitle;
	
	private LocalDate releaseDate;
	private String isbn;
	
	public BookDTO() { }
	public BookDTO(String title) {
		
		setTitle(title);
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
	
	@Override
	public String toString() {
		
		return  "id: " + getId()
				+ "\ntitle: " + getTitle() 
				+ "\nsub-title: " + getSubtitle()
				+ "\nrelease date: " + getReleaseDate() 
				+ "\nisbn: " + getIsbn();
	}
}
