package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("\nCognome: ");
		String lastname = sc.nextLine();

		System.out.print("\nColore preferito: ");
		String color = sc.nextLine();
		
		System.out.print("\nGiorno di nascita: ");
		int birthDay = sc.nextInt();

		System.out.print("\nMese di nascita: ");
		int birthMonth = sc.nextInt();
		
		System.out.print("\nAnno di nascita: ");
		int birthYear = sc.nextInt();		
		
		sc.close();
		
		String password = name + "-" + lastname + "-" 
							+ color + "-" + (birthDay + birthMonth + birthYear);
		
		System.out.println("Password: " + password);
	}
}





