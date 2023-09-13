package org.java;

import java.util.Scanner;

public class MyPairAndOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Pari o dispari: ");
		String word = sc.nextLine();
		
		boolean pair = false;
		if (word.toLowerCase().equals("pari")) { // word == "pari"
			pair = true;
		}
		
		sc.close();
	}
}
