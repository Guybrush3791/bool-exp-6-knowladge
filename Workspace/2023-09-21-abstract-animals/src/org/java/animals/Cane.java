package org.java.animals;

import org.java.animals.abs.Animale;

public class Cane extends Animale {

	@Override
	public void verso() {
		
		System.out.println("Bau bau");
	}
	
	@Override
	public void mangia() {

		System.out.println("Croccantini e crocchette (cane)");
	}
}
