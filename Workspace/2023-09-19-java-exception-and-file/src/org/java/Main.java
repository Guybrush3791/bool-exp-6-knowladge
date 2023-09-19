package org.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero persone: ");
		int persCount = Integer.valueOf(sc.nextLine());
		
		for (int x=0;x<persCount;x++) {
			
			try {
		
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Lastname: ");
				String lastname = sc.nextLine();
				
				System.out.print("Age: ");
				int age = Integer.valueOf(sc.nextLine());
				
				Persona p = new Persona(name, lastname, age);
			} catch (Exception e) {
				
				x--;
			}
		}
		
		sc.close();
	}
}
