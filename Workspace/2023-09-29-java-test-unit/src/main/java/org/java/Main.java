package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		List<Person> people = new ArrayList<>();
		
		String userRes = "";
		while (!userRes.equals("0")) {
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Eta': ");
			int age = Integer.valueOf(sc.nextLine());
			
			Person p = new Person(age, name);
			people.add(p);
		}
	}
}
