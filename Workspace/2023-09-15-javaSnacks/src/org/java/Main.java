package org.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Snack 1
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		if (value % 2 == 0) {
			
			System.out.println("value: " + value);
		} else {
			
			System.out.println("value: " + (value + 1));
		}
	}
}
