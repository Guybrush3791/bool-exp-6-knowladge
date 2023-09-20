package org.java;

import java.awt.Point;

public class Main {

	public static interface SelfPrinter {
		
		public void printMe();
	}
	public static abstract class Person implements SelfPrinter {
		
		private String name;
		private String lastname;
		private String dateOfBirth;
		
		public Person(String name, String lastname, String dateOfBirth) {
			
			setName(name);
			setLastname(lastname);
			setDateOfBirth(dateOfBirth);
		}

		public abstract int getYearSalary();
		
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
		@Override
		public void printMe() {
			
			System.out.println(toString());
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

		@Override
		public int getYearSalary() {
			
			return getSalary() * 14;
		}
	}
	public static class Boss extends Person {
		
		int dividend;
		
		public Boss(String name, String lastname, String dateOfBirth, int dividend) {
			
			super(name, lastname, dateOfBirth);
			
			setDividend(dividend);
		}

		public int getDividend() {
			return dividend;
		}
		public void setDividend(int dividend) {
			this.dividend = dividend;
		}
		
		@Override
		public String toString() {
			
			return super.toString() + " | " + getDividend() + " euro";
		}

		@Override
		public int getYearSalary() {
			
			return getDividend();
		}
	}
	
	public static void main(String[] args) {
		
//		Person p1 = new Person("Marco", "Rossi", "10/01/2000");
//		System.out.println(p1);
//		
//		System.out.println("\n---------------------------------\n");
		
		Person p1 = new Employee("Guybrush", "Threepwood", "30/10/1989", 3000);
		Person p2 = new Boss("Marco", "Rossi", "10/01/2000", 20000);
		
		Person[] people = new Person[2];
		people[0] = p1;
		people[1] = p2;
		
		for (int x=0;x<people.length;x++) {
			
			Person p = people[x];
			System.out.println(p.getYearSalary());
			p.printMe();
		}
	}
}
