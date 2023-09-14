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
		
//		// ES4
//		String[] goodNames = {
//			"Marco", "Giorgia", "Filippo"
//		};
//		System.out.print("Nome utente: ");
//		String name = sc.nextLine();
//		
//		for (int x=0;x<goodNames.length;x++) {
//			
//			String goodName = goodNames[x];
//			
//			if (name.toLowerCase().equals(goodName.toLowerCase())) {
//				
//				System.out.println("Puoi entrare!!");
//				return;
//			}
//		}
//		
//		System.out.println("NON PUOI ENTRARE! VATTENE!");
		
//		// ES5
//		for (int x=0;x<6;x++) {
//			
//			System.out.println("Dimmi un valore: ");
//			int value = sc.nextInt();
//			
////			if (value % 2 == 0) {
////				System.out.println("Il valore e' pari");
////			} else {
////				System.out.println("Il valore e' dispari");
////			}
//			
//			System.out.println(
//					value % 2 == 0
//					? "Il valore e' pari"
//					: "Il valore e' dispari"
//				);
//		}
		
//		// ES6 
//		
//		System.out.print("Quanti cubi vuoi?");
//		int count = sc.nextInt();
//		
//		for (int x=1;x<=count;x++) {
//			
//			int cube = x * x * x;
//			System.out.println("Cube: " + cube);
//		}
		
		// ES7
//		int value = 1;
//		while (value < 1000) {
//		
//			System.out.println(value);
//			value *= 2;
//		}
		
		// ES8
		
		char c = 'A';
		int intC = Integer.valueOf(c);
		System.out.println(intC);
		
//		System.out.print("Numero di 4 cifre: ");
//		String value = sc.nextLine();
//		
//		if (value.length() != 4) {
//			System.out.println("Numero errato!");
//			return;
//		}
//		
//		int sum = 0;
//		for (int x=0;x<value.length();x++) {
//			
//			char c = value.charAt(x);
//			int intC = Integer.valueOf(c);
//			
//			sum += intC;
//		}
//		System.out.println("Somma delle cifre: " + sum);
		
		// END ES
		
		sc.close();
	}
}












