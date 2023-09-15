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
		Random rnd = new Random();
		
		String[] names = { "name1", "name2", "name3" };
		String[] lastnames = { "lastname1", "lastname2", "lastname3", "lastname4"};
		
		for (int x=0;x<5;x++) {
			
			int rndNameIndex = rnd.nextInt(names.length);
			int rndLastnameIndex = rnd.nextInt(lastnames.length);
			
			String name = names[rndNameIndex];
			String lastname = lastnames[rndLastnameIndex];
			
			System.out.println("fullname: " + name + " " + lastname);
		}
	}
}


















