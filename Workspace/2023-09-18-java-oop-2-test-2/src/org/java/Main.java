package org.java;

public class Main {

	public static class Person {
		
		private String name;
		private String lastname;
		
		private String dateOfBirth;
		
		public Person(String name, String lastname, String dateOfBirth) {
			
			
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
		
		public String getDateOfBirth() {
			
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			
			this.dateOfBirth = dateOfBirth;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
	}
}
