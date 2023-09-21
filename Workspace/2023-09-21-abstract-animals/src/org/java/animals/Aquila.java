package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.inter.INuotante;
import org.java.animals.inter.IVolante;

public class Aquila extends Animale implements INuotante, IVolante {

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
	@Override
	public void vola() {
		
		System.out.println("Sto volando!!!");
	}
}
