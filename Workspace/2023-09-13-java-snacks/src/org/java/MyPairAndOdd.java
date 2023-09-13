package org.java;

import java.util.Random;
import java.util.Scanner;

public class MyPairAndOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Pari o dispari: ");
		String word = sc.nextLine();
		
		boolean pair = false;
		if (word.trim().toLowerCase().equals("pari")) { // word == "pari"
			pair = true;
		}
		
		System.out.print("Dammi il tuo numero: ");
		int userValue = sc.nextInt();
		
		sc.close();
		
		Random rnd = new Random();
		int pcValue = rnd.nextInt(100);
		System.out.println("pc value: " + pcValue);
		
		boolean isSumPair = ((userValue + pcValue) % 2) == 0;

		System.out.println("\n----------------------------------------\n");
		
		if (pair == isSumPair) {
			
			System.out.println("L'utente ha vinto!! Yheeee!!!");
		} else {
			
			System.out.println("You loose!!");
		}
	}
}
