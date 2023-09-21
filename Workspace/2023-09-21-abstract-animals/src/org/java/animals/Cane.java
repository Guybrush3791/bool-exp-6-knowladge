package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.inter.INuotante;

public class Cane extends Animale implements INuotante {

	@Override
	public void verso() {
		
		System.out.println("Bau bau");
	}
	
	@Override
	public void mangia() {

		System.out.println("Croccantini e crocchette (cane)");
	}
	
	@Override
	public void nuota() {
		
		System.out.println("Sto nuotando!!!");
	}
}
