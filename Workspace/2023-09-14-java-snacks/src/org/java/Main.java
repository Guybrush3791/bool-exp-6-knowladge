package org.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		// ES1
//		System.out.print("Numero 1: ");
//		int val1 = sc.nextInt();
//		
//		System.out.print("Numero 2: ");
//		int val2 = sc.nextInt();
//		
//		System.out.print("Maggiore: ");
//		if (val1 > val2) {
//			
//			System.out.println(val1);
//		} else if (val2 > val1) {
//			
//			System.out.println(val2);
//		} else {
//			
//			System.out.println(val1 + " ~ " + val2);
//		}
		
//		// ES2
//		System.out.print("Parola 1: ");
//		String word1 = sc.nextLine();
//		
//		System.out.print("Parola 2: ");
//		String word2 = sc.nextLine();
//		
//		int lng1 = word1.length();
//		int lng2 = word2.length();
//		
//		if (lng1 > lng2) {
//			
//			System.out.println(word2 + " ~ " + word1);
//		} else {
//			
//			System.out.println(word1 + " ~ " + word2);
//		}
		
//		// ES3
//		int sum = 0;
//		for (int x=0;x<10;x++) {
//			
//			System.out.print("Numero: ");
//			int value = sc.nextInt();
//			
//			sum += value;
//		}
//		System.out.println("Sommatoria: " + sum);
		
		// ES4
		String[] goodNames = {
			"Marco", "Giorgia", "Filippo"
		};
		System.out.print("Nome utente: ");
		String name = sc.nextLine();
		
		for (int x=0;x<goodNames.length;x++) {
			
			String goodName = goodNames[x];
			
			if (name.toLowerCase().equals(goodName.toLowerCase())) {
				
				System.out.println("Puoi entrare!!");
				return;
			}
		}
		
		System.out.println("NON PUOI ENTRARE! VATTENE!");
		
		// END ES
		
		sc.close();
	}
}












