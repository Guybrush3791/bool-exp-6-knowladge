package org.java;

import org.java.ecommerce.Infografica;

public class Main {

	public static void main(String[] args) {
		
		Infografica infoG1 = new Infografica();
		
		infoG1.titolo = "My best infographic";
		infoG1.category = "Programming infographic";
		infoG1.nImmagini = 100;
		
		System.out.println("infog titolo: " + infoG1.titolo);
		System.out.println("infog category: " + infoG1.category);
		System.out.println("infog numero immagini: " + infoG1.nImmagini);
	}
}
