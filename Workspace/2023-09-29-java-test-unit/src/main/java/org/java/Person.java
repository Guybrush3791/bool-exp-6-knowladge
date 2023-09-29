package org.java;

public class Person {

	private int age;
	private String name;
	
	public Person(int age, String name) throws Exception {
		
		setAge(age);
		setName(name);
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		
		if (age <= 0)
			throw new Exception("Age must be greater then 0");
		
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		
		if (name == null || name.isEmpty())
			throw new Exception("Name can't be empty");
		
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return getName() + ": " + getAge();
	}
}
