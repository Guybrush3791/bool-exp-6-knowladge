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

		people = new People();
	}
	
	@Test
	@DisplayName("Test add person to people")	
	public void addPersonToPeople() {
		
//		int beforeSize = people.getSize();
		
		people.addPerson(50, "Tulio");
		
		int afterSize = people.getSize();
		
		assertEquals(5, afterSize);
	}
}
