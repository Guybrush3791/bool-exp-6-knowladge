package org.ecommerce;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import org.ecommerce.products.Cuffie;
import org.ecommerce.products.Smartphone;
import org.ecommerce.products.Televisore;

public class Carrello {

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
		
		int smartphoneIndex = 0;
		int televisoriIndex = 0;
		int cuffieIndex = 0;
		
		Smartphone[] smartphones = new Smartphone[10];
		Televisore[] televisori = new Televisore[10];
		Cuffie[] cuffie = new Cuffie[10];
		
		String userValue = "";
		while (true) {
			
			System.out.println("Cosa vuoi fare:");
			System.out.println("---------------");
			System.out.println("1) Smartphone");
			System.out.println("2) Televisore");
			System.out.println("3) Cuffie");
			System.out.println("---------------");
			System.out.println("0) terminare e uscire");
		
			userValue = sc.nextLine();
			
			
			
			if (!Arrays
					.asList(new String[] {"1", "2", "3"})
					.contains(userValue)) {
				
				if (userValue.equals("0")) break;
				
				System.err.println("Comando non compreso");
				continue;
			}
				
			
			System.out.print("codice: ");
			String codice = sc.nextLine();
			
			System.out.print("nome: ");
			String nome = sc.nextLine();
			
			System.out.print("marca: ");
			String marca = sc.nextLine();
			
			System.out.print("prezzo: ");
			int prezzo = Integer.valueOf(sc.nextLine());
			
			System.out.print("iva: ");
			int iva = Integer.valueOf(sc.nextLine());
			
			switch(userValue) {
			
				case "1": 
					
					System.out.print("imei: ");
					String imei = sc.nextLine();
					
					System.out.print("memoria: ");
					int memoria = Integer.valueOf(sc.nextLine());
					 
					smartphones[smartphoneIndex++] = 
							new Smartphone(codice, nome, marca, 
										   prezzo, iva, imei, memoria);
				break;
				case "2":
					
					System.out.print("dimensione: ");
					int dimensione = Integer.valueOf(sc.nextLine());
					
					System.out.print("smart [Y/n]: ");
					boolean smart = sc.nextLine().equalsIgnoreCase("y");
					 
					televisori[televisoriIndex++] = 
							new Televisore(codice, nome, marca, 
										   prezzo, iva, dimensione, smart);
					
				break;
				case "3": 
				
					System.out.print("colore: ");
					String colore = sc.nextLine();
					
					System.out.print("wireless [Y/n]: ");
					boolean wireless = sc.nextLine().equalsIgnoreCase("y");
					 
					cuffie[cuffieIndex++] = 
							new Cuffie(codice, nome, marca, 
										   prezzo, iva, colore, wireless);
					
				break;
			}
		}
		
		System.out.println("\n-----------------------------\n");
		
		System.out.println("Carrello:");
		System.out.println("---------------");
		for (int x=0;x<smartphoneIndex;x++) {
			
			System.out.println("Smartphone " + (x + 1) + ":");
			System.out.println(smartphones[x] + "\n");
		}
		
		System.out.println("The End");
	}
}
