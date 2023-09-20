package org.java;

public class Main {

	public static abstract class Person {
		
		private String name;
		private String lastname;
		private String dateOfBirth;
		
		public Person(String name, String lastname, String dateOfBirth) {
			
			setName(name);
			setLastname(lastname);
			setDateOfBirth(dateOfBirth);
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
		public String getFullName() {
			
			return getName() + " " + getLastname();
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
	
		@Override
		public String toString() {
			
			return getFullName() + ": " + getDateOfBirth();
		}
	}
	public static class Employee extends Person {

		private int salary;
		
		public Employee(String name, String lastname, String dateOfBirth,
						int salary) {
			
			super(name, lastname, dateOfBirth);

			setSalary(salary);
		}

		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			
			return super.toString() + " | " + getSalary() + " euro";
		}
	}
//	public static class Boss extends Person {}
	
	public static void main(String[] args) {
		
//		Person p1 = new Person("Marco", "Rossi", "10/01/2000");
//		System.out.println(p1);
//		
//		System.out.println("\n---------------------------------\n");
		
		Employee e1 = new Employee("Guybrush", "Threepwood", "30/10/1989", 3000);
		System.out.println(e1);
	}
}
