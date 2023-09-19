package org.java;

public class Persona {

	String name;
	String lastname;
	int age;
	
	public Persona(String name, String lastname, int age) {
	
		setName(name);
		setLastname(lastname);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		
		return getName() + " " + getLastname() + ": " + getAge();
	}
}
