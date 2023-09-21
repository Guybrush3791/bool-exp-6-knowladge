package org.java.animals;

import org.java.animals.abs.Animale;

public class Passerotto extends Animale {

	@Override
	public void verso() {
		
		System.out.println("Cip cip");
	}

	@Override
	public void mangia() {

		System.out.println("Semi e vermi");
	}
}
