package org.java;

import java.util.List;

public class People {

	private List<Person> people;
	
	public People() {
		
		Person p1 = new Person(10, "Guybrush");
		Person p2 = new Person(20, "Marco");
		Person p3 = new Person(30, "Francesca");
		Person p4 = new Person(40, "Chiara");
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
	}
}
