package org.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PeopleTest {

	private People people;
	
	@BeforeEach
	public void beforeEach() {

		people = new People();
	}
	
	@Test
	public void addPersonToPeople() {
		
		
		people.addPerson(50, "Tulio");
	}
}
