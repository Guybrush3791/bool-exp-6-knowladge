package org.ecommerce;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Prodotto p1 = new Prodotto("12345", "Super-monitor", "Dell", 399, 22);
//		
//		Smartphone s1 = new Smartphone("34567", "Galaxy Note 20", "Samsung", 
//									   400, 22, "23847293472938", 32);
//		Televisore t1 = new Televisore("67890", "Super-televisore", "Lg", 
//									   600, 22, 32, false);
//		Cuffie c1 = new Cuffie("22334", "WH-1000", "Sony", 
//							   400, 22, "grey/black", true);
//		
//		System.out.println(p1);
//		System.out.println("\n-----------------------------\n");
//		System.out.println(s1);
//		System.out.println("\n-----------------------------\n");
//		System.out.println(t1);
//		System.out.println("\n-----------------------------\n");
//		System.out.println(c1);
		
		Scanner sc = new Scanner(System.in);
		
		String userValue = "";
		while (!userValue.equals("0")) {
			
			System.out.println("Cosa vuoi fare:");
			System.out.println("---------------");
			System.out.println("1) Smartphone");
			System.out.println("2) Televisore");
			System.out.println("3) Cuffie");
			System.out.println("---------------");
			System.out.println("0) terminare e uscire");
		
			userValue = sc.nextLine();
			
			int intUserValue = Integer.valueOf(userValue);
		}
	}
}
