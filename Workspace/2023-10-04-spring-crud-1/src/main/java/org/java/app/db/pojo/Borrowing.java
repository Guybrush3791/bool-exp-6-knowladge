package org.java.app.db.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Borrowing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private LocalDate borrowingDate;
	
	@Column(nullable = false)
	private LocalDate returnDate;
	
	private String note;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Book book;
	
	public Borrowing() { }
	public Borrowing(LocalDate borrowingDate, LocalDate returnDate, 
					 String note, Book book) {
		
		setBorrowingDate(borrowingDate);
		setReturnDate(returnDate);
		setNote(note);
		setBook(book);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getBorrowingDate() {
		return borrowingDate;
	}
	public void setBorrowingDate(LocalDate borrowingDate) {
		this.borrowingDate = borrowingDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public String getHtmlReturnDate() {

		return getReturnDate() == null
				? null
				: getReturnDate().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
	}
	public void setHtmlReturnDate(String date) {

		setReturnDate(LocalDate.parse(date));
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getBorrowingDate() + " ~ " + getReturnDate() 
			+ "\nNote:\n" + getNote();
	}
}
