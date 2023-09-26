package org.java;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		try {
			Evento e1 = new Evento("Mio evento", LocalDate.of(2023, 9, 29), 100);
			System.out.println(e1);
			
			System.out.println("Posti totali: " + e1.getPostiTotali());
			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
			System.out.println("\n----------------------------------------------\n");
			
			e1.prenota();
			
			System.out.println("Posti totali: " + e1.getPostiTotali());
			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
			System.out.println("\n----------------------------------------------\n");
			
			e1.disdici();
			
			System.out.println("Posti totali: " + e1.getPostiTotali());
			System.out.println("Posti prenotati: " + e1.getPostiPrenotati());
			System.out.println("\n----------------------------------------------\n");
			
			e1.disdici();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
