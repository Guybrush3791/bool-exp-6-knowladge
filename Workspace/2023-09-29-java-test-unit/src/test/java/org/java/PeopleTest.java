package org.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PeopleTest {

	private People people;
	
	@BeforeEach
	public void beforeEach() {

		try {
			
			people = new People();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test add person to people")	
	public void addPersonToPeople() {
		
		try {
		
			people.addPerson(50, "Tulio");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		int afterSize = people.getSize();
		assertEquals(5, afterSize);
	}
	
	@Test
	@DisplayName("Test add 0 age exception")	
	public void checkWrongAgeParameters() {
		
		assertThrows(Exception.class,
				() -> people.addPerson(0, "Marco"),
				"0 age must throws an Exception");
	}
	
	@Test
	@DisplayName("Test add 0 age exception")	
	public void checkWrongNameParameters() {
		
		assertThrows(Exception.class,
				() -> people.addPerson(0, ""),
				"0 age must throws an Exception");
		assertThrows(Exception.class,
				() -> people.addPerson(0, null),
				"0 age must throws an Exception");
	}
	
	@Test
	@DisplayName("Test add valid age not exception")	
	public void checkValidPersonParameters() {
		
		assertDoesNotThrow(() -> people.addPerson(10, "Marco"),
				"0 age must throws an Exception");
	}
	
	@Test
	@DisplayName("Test search function")
	public void checkSearchFunction() {
		
		List<Person> searchPeople = people.searchPeople("a");
		int lng = searchPeople.size();
		
		assertEquals(3, lng);
	}
}
