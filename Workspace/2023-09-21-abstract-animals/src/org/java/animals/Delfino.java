package org.java.animals;

import org.java.animals.abs.Animale;

public class Delfino extends Animale {

	@Override
	public void verso() {
		
		System.out.println("Clic clic");
	}

	@Override
	public void mangia() {
		
		System.out.println("Pesci");
	}

	
}
