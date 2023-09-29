package org.java;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class People {

	private List<Person> people;
	
	public People() throws Exception {
		
		people = new ArrayList<>();
		
		Person p1 = new Person(10, "Guybrush");
		Person p2 = new Person(20, "Marco");
		Person p3 = new Person(30, "Francesca");
		Person p4 = new Person(40, "Chiara");
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
	}
	
	public void addPerson(int age, String name) throws Exception {
		
		Person p = new Person(age, name);
		people.add(p);
	}
	public List<Person> searchPeople(String name) {
		
		return people.stream().filter(p -> p.getName().contains(name)).collect(Collectors.toList());
	}
	public int getSize() {
		
		return people.size();
	}
}
