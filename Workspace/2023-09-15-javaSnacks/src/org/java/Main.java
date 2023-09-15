package org.java;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Snack 1
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("value: ");
//		int value = sc.nextInt();
//		
//		sc.close();
//		
////		if (value % 2 == 0) {
////			
////			System.out.println("value: " + value);
////		} else {
////			
////			System.out.println("value: " + (value + 1));
////		}
//		
//		System.out.println("value: " + (value + (
//				value % 2 == 0
//				? 0
//				: 1
//			))
//		);
		
		// Snack 2
//		Random rnd = new Random();
//		
//		String[] names = { "name1", "name2", "name3" };
//		String[] lastnames = { "lastname1", "lastname2", "lastname3", "lastname4"};
//		
//		for (int x=0;x<5;x++) {
//			
//			int rndNameIndex = rnd.nextInt(names.length);
//			int rndLastnameIndex = rnd.nextInt(lastnames.length);
//			
//			String name = names[rndNameIndex];
//			String lastname = lastnames[rndLastnameIndex];
//			
//			System.out.println("fullname: " + name + " " + lastname);
//		}
		
		// Snack 3
//		Random rnd = new Random();
//		
//		final int lng = 10;
//		int[] arr = new int[lng];
//		
//		for (int x=0;x<lng;x++) {
//			
//			arr[x] = rnd.nextInt(10);
//		}
//		
//		int sum = 0;
//		for (int x=1;x<lng;x+=2) {
//			
//			System.out.println("[" + x + "] " + arr[x]);
//			sum += arr[x];
//		}
//		
//		System.out.println("sum: " + sum);
		
		// Snack 4
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Stringa: ");
//		String str = sc.nextLine().toLowerCase(); // anna : lng = 4
//		
//		System.out.println("\n---------------------\n");
//		
//		// OPZIONE 2
//		boolean palindrom = true;
//		for (int x=0;x<str.length()/2;x++) {
//			
//			int revX = str.length() - 1 - x;
//			
//			System.out.println("x: " + x);
//			System.out.println("revX: " + revX);
//			
//			char charX = str.charAt(x);
//			char charRevX = str.charAt(revX);
//			
//			System.out.println("charX: " + charX );
//			System.out.println("charRevX: " + charRevX);
//			
//			if (charX != charRevX) {
//				
//				palindrom = false;
//				break;
//			}
//			
//			System.out.println("\n---------------------\n");
//		}
//		
//		System.out.println("Palindoma: " + palindrom);
//		
////		OPZIONE 1
////		String revStr = "";
////		for (int x=str.length()-1;x>=0;x--) {
////			
////			revStr += str.charAt(x);
////		}
////		
////		if (str.equals(revStr)) {
////			
////			System.out.println("La stringa e' palindroma");
////		} else {
////			
////			System.out.println("La stringa NON e' palindroma");
////		}
		
		// Snack 5
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Stringa: ");
		String str = sc.nextLine();
		
		int alphaCount = 0;
		int numberCount = 0;
		int symbolCount = 0;
		
		for (int x=0;x<str.length();x++) {
			
			char c = str.charAt(x);
			
			if (Character.isDigit(c)) {
				
				numberCount++;
			} else if (Character.isLetter(c)) {
				
				alphaCount++;
			} else {
				
				symbolCount++;
			}
		}
	}
}


















