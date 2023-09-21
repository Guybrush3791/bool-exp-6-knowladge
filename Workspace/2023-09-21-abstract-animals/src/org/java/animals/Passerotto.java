package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.inter.IVolante;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verso() {
		
		System.out.println("Cip cip");
	}

	@Override
	public void mangia() {

		System.out.println("Semi e vermi");
	}
	
	@Override
	public void vola() {
		
		System.out.println("Sto volando!!!");
	}
}
