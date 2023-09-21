package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.inter.INuotante;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		
		System.out.println("Clic clic");
	}

	@Override
	public void mangia() {
		
		System.out.println("Pesci");
	}

	@Override
	public void nuota() {
		
		System.out.println("Sto nuotando!!!");
	}
}
