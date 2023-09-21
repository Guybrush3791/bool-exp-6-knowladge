package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.inter.INuotante;

public class Aquila extends Animale implements INuotante {

	@Override
	public void verso() {
		
		System.out.println("Scric");
	}

	@Override
	public void mangia() {

		System.out.println("Piccoli roditori");
	}
	
	@Override
	public void nuota() {
		
		System.out.println("Sto nuotando!!!");
	}
}
