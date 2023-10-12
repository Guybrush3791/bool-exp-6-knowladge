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
}
