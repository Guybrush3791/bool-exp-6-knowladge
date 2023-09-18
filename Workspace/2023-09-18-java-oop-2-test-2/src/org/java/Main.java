package org.java;

public class Main {

	public static class Person {
		
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
		
		public String getDateOfBirth() {
			
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			
			this.dateOfBirth = dateOfBirth;
		}
		
		public String getFullname() {
			
			return getName() + " " + getLastname();
		}
		
		@Override
		public String toString() {

			return getFullname() + " | date of birth: " + getDateOfBirth();
		}
	}
	public static class Employee extends Person {
		
		private String title;
		private int salary;
		
		public Employee(
				String name, String lastname, String dateOfBirth,
				String title, int salary
			) { 
			
			super(name, lastname, dateOfBirth);
			
			setTitle(title);
			setSalary(salary);
		}
		
		public String getTitle() {
			
			return title;
		}
		public void setTitle(String title) {
			
			this.title = title;
		}
		public int getSalary() {
			
			return salary;
		}
		public void setSalary(int salary) {
			
			this.salary = salary;
		}
		
		public int getYearSalary() {
			
			return getSalary() * 14;
		}
		
		@Override
		public String toString() {
			
			return super.toString() + " | year salary: " + getYearSalary(); 
		}
	}
	public static class Boss extends Employee {

		private int bonus;
		
		public Boss(String name, String lastname, String dateOfBirth, 
					String title, int salary,
					int bonus) {
			super(name, lastname, dateOfBirth, title, salary);
			
			setBonus(bonus);
		}
		
		public int getBonus() {
			
			return bonus;
		}
		public void setBonus(int bonus) {
			
			this.bonus = bonus;
		}
		
		@Override
		public int getYearSalary() {
			
			return super.getYearSalary() + bonus;
		}
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Guybrush", "Threepwood", "15/10/1989");
		System.out.println(p1);
		
		Employee e1 = new Employee("Marco", "Rossi", "10/07/2000",
					"Java Programmer", 2800);
		System.out.println(e1);
		
		Boss b1 = new Boss("Francesca", "Bianchi", "10/01/1999",
						   "Megadirettore", 4500,
						   10000);
		System.out.println(b1.toString());
	}
}
