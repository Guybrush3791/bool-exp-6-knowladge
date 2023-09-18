package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		final int LNG = 20;
		Studente[] studenti = new Studente[LNG];
		
		Random rnd = new Random();
		for (int x=0;x<LNG;x++) {
			
			Studente s = new Studente(
					x + 1, 
					rnd.nextInt(0, 101),
					rnd.nextFloat(0, 5)
			);
			
			studenti[x] = s;
			
			System.out.println("Studente " + s.id);
			System.out.println("----------------");
			System.out.println("assenze: " + s.assenze + "%");
			System.out.println("media voti: " + 
					String.format("%.02f", s.mediaVoti)
					+ "/5");
			System.out.println("\nbocciato: " + (s.isBocciato() ? "YES" : "NO"));
			
			System.out.println("\n\n");
		}
	}
}
