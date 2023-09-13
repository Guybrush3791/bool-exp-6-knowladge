package org.java;

import java.util.Scanner;

public class MyEta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eta' persona 1: ");
		int eta1 = sc.nextInt();
		
		System.out.print("Eta' persona 2: ");
		int eta2 = sc.nextInt();
		
		sc.close();
		
		if (eta1 > eta2) {
			
			System.out.println("Persona 1 e' piu' grande");
		} else if (eta2 > eta1) {
			
			System.out.println("Persona 2 e' piu' grande");
		} else {
			
			System.out.println("Persona 1 e 2 hanno la stessa eta'");
		}
	}
}
