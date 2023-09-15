package org.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Snack 1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("value: ");
		int value = sc.nextInt();
		
		sc.close();
		
//		if (value % 2 == 0) {
//			
//			System.out.println("value: " + value);
//		} else {
//			
//			System.out.println("value: " + (value + 1));
//		}
		
		System.out.println("value: " + (value + (
				value % 2 == 0
				? 0
				: 1
			))
		);
	}
}
