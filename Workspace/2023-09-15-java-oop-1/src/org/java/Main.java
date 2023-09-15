package org.java;

import org.java.ecommerce.Infografica;

public class Main {

	public static void main(String[] args) {
		
		Infografica infoG1 = new Infografica();
		
		infoG1.titolo = "My best infographic";
		infoG1.category = "Programming infographic";
		infoG1.nImmagini = 100;
		
		Infografica infoG2 = new Infografica();
		
		infoG2.titolo = "My best info V2.0";
		infoG2.category = "Coding";
		infoG2.nImmagini = 7;
		
//		System.out.println("infog 1 titolo: " + infoG1.titolo);
//		System.out.println("infog 1 category: " + infoG1.category);
//		System.out.println("infog 1 numero immagini: " + infoG1.nImmagini);
		
		System.out.println("infog 1 all: " + infoG1.getString());
		
		System.out.println("\n-------------------------------------\n");
		
//		System.out.println("infog 2 titolo: " + infoG2.titolo);
//		System.out.println("infog 2 category: " + infoG2.category);
//		System.out.println("infog 2 numero immagini: " + infoG2.nImmagini);
		
		System.out.println("infog 2 all: " + infoG2.getString());
	}
}
