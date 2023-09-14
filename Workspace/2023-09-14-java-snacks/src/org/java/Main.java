package org.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ES1
		System.out.print("Numero 1: ");
		int val1 = sc.nextInt();
		
		System.out.print("Numero 2: ");
		int val2 = sc.nextInt();
		
		System.out.print("Maggiore: ");
		if (val1 > val2) {
			
			System.out.println(val1);
		} else if (val2 > val1) {
			
			System.out.println(val2);
		} else {
			
			System.out.println(val1 + " ~ " + val2);
		}
			
		
		// END ES
		
		sc.close();
	}
}
