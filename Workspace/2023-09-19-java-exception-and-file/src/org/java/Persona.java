package org.java;

public class Persona {

	String name;
	String lastname;
	int age;
	
	public Persona(String name, String lastname, int age) throws Exception {
	
		setName(name);
		setLastname(lastname);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		
		if (name.isBlank())
			throw new Exception("Name can't be empty");
		
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) throws Exception {
		
		if (lastname.isBlank())
			throw new Exception("Lastname can't be empty");
		
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		
		if (age <= 0)
			throw new Exception("Age can't be 0 or less");
		
		this.age = age;
	}

	@Override
	public String toString() {
		
		return getName() + " " + getLastname() + ": " + getAge();
	}
}
