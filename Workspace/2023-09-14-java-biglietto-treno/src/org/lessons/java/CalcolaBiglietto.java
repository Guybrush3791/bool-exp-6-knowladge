package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		float pricePerKm = .21F;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kilometri: ");
		int km = sc.nextInt();
		
		System.out.print("\nEta': ");
		int age = sc.nextInt();
		
		sc.close();
		
		float price = km * pricePerKm; // prezzo intero senza sconti
		
		if (age < 18) {
			
			price = price / 100 * 80;
		} else if (age > 65) {
			
			price = price / 100 * 60;
		}
		
		System.out.println("Prezzo finale: " + price);		
	}
}
