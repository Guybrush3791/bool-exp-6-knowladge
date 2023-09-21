package org.java.animals;

import org.java.animals.abs.Animale;

public class Aquila extends Animale {

	@Override
	public void verso() {
		
		System.out.println("Scric");
	}

	@Override
	public void mangia() {

		System.out.println("Piccoli roditori");
	}
}
