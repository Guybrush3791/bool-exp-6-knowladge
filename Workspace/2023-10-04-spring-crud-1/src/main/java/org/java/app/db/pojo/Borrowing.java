package org.java.app.db.pojo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	
	public Borrowing() { }
	public Borrowing(LocalDate borrowingDate, LocalDate returnDate, String note) {
		
		setBorrowingDate(borrowingDate);
		setReturnDate(returnDate);
		setNote(note);
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getBorrowingDate() + " ~ " + getReturnDate() 
			+ "\nNote:\n" + getNote();
	}
}
