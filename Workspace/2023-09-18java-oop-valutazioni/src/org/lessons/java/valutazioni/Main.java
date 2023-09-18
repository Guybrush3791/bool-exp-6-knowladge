package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		final int LNG = 20;
		Studente[] studenti = new Studente[LNG];
		
		int promossiCounter = 0;
		Random rnd = new Random();
		for (int x=0;x<LNG;x++) {
			
			Studente s = new Studente(
					x + 1, 
					rnd.nextInt(0, 101),
					rnd.nextFloat(0, 5.1f)
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
			
			if (!s.isBocciato()) 
				promossiCounter++;
		}
		
		System.out.println("Numero promossi: " + promossiCounter);
		
		int promossoIndex = 0;
		int bocciatoIndex = 0;
		Studente[] promossi = new Studente[promossiCounter];
		Studente[] bocciati = new Studente[LNG - promossiCounter];
		for (int x=0;x<LNG;x++) {
		
			Studente s = studenti[x];
			
			if (s.isBocciato()) {
				bocciati[bocciatoIndex++] = s;
			} else {
				promossi[promossoIndex++] = s;
			}
		}
		
		Studente bocciatoMinVoto = null;
		float minVoto = Float.MAX_VALUE;
		for (int x=0;x<bocciatoIndex;x++) {
			
			Studente s = bocciati[x];
			
			if (minVoto > s.mediaVoti) {
				
				bocciatoMinVoto = bocciati[x];
				minVoto = s.mediaVoti;
			}
		}
		
		Studente promossoMaxVoto = null;
		float maxVoto = Float.MIN_VALUE;
		for (int x=0;x<promossoIndex;x++) {
			
			Studente s = promossi[x];
			
			if (maxVoto < s.mediaVoti) {
				
				promossoMaxVoto = promossi[x];
				maxVoto = s.mediaVoti;
			}
		}
		
		System.out.println("Voto minimo per bocciati: " 
				+ String.format("%.02f", minVoto) + "/5"
				+ " (id: " + bocciatoMinVoto.id + ")"
		);
		System.out.println("Voto massimo per promossi: " 
				+ String.format("%.02f", maxVoto) + "/5"
				+ " (id: " + promossoMaxVoto.id + ")"
		);
	}
}
