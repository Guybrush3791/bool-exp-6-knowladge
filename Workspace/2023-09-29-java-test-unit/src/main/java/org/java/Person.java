package org.java;

public class Person {

	private int age;
	private String name;
	
	public Person(int age, String name) {
		
		setAge(age);
		setName(name);
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return getName() + ": " + getAge();
	}
}
