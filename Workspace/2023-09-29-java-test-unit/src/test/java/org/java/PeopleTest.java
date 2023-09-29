package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
}
