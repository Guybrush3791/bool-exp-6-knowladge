package org.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			System.out.println("Nuovo evento:");
			
			System.out.print("titolo: ");
			String title = sc.nextLine();
			
			System.out.print("date: ");
			String date = sc.nextLine();
			
			System.out.print("numero posti totali: ");
			int numeroPosti = Integer.valueOf(sc.nextLine());
			
			Evento e1 = new Evento(title, date, numeroPosti);
			
			System.out.println(e1);
			System.out.println("\n----------------------------------------------\n");
			
//			Evento e1 = new Evento("Mio evento", "2023-09-29", 100);
//			System.out.println(e1);
//			System.out.println("\n----------------------------------------------\n");
//			
//			System.out.println("Posti totali: " + e1.getPostiTotali());
//			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
//			System.out.println("\n----------------------------------------------\n");
//			
//			e1.prenota();
//			
//			System.out.println("Posti totali: " + e1.getPostiTotali());
//			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
//			System.out.println("\n----------------------------------------------\n");
//			
//			e1.disdici();
//			
//			System.out.println("Posti totali: " + e1.getPostiTotali());
//			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
//			System.out.println("\n----------------------------------------------\n");
//			
//			e1.disdici();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} finally {
			
			if (sc != null) 
				sc.close();
		}
	}
}
