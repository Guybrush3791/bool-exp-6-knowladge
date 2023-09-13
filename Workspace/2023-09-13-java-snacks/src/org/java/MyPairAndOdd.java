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
		
		Random rnd = new Random();
		
		int pcValue = rnd.nextInt(Integer.MAX_VALUE);
		
		sc.close();
	}
}
