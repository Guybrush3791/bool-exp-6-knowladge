package org.java;

import java.util.concurrent.DelayQueue;

import org.java.animals.Aquila;
import org.java.animals.Cane;
import org.java.animals.Delfino;
import org.java.animals.Passerotto;
import org.java.animals.abs.Animale;

public class Main {

	public static void main(String[] args) {
		
		Cane c1 = new Cane();
		Passerotto p1 = new Passerotto();
		Aquila a1 = new Aquila();
		Delfino d1 = new Delfino();
		
		System.out.println("Cane:");
		System.out.println("--------------------");
		
		c1.dormi();
		c1.verso();
		c1.mangia();
		
		System.out.println("--------------------");
		
		System.out.println("Passerotto:");
		System.out.println("--------------------");
		
		p1.dormi();
		p1.verso();
		p1.mangia();
		
		System.out.println("--------------------");
		
		System.out.println("Aquila:");
		System.out.println("--------------------");
		
		a1.dormi();
		a1.verso();
		a1.mangia();
		
		System.out.println("--------------------");
		
		System.out.println("Delfino:");
		System.out.println("--------------------");
		
		d1.dormi();
		d1.verso();
		d1.mangia();
		
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		Animale[] animali = new Animale[4];
		animali[0] = c1;
		animali[1] = p1;
		animali[2] = a1;
		animali[3] = d1;
		
		for (int x=0;x<animali.length;x++) {
			
			Animale a = animali[x];
			
			System.out.println(a.getClass().getSimpleName() + ":");
			System.out.println("--------------------");
			
			d1.dormi();
			d1.verso();
			d1.mangia();
			
			System.out.println("--------------------");
		}
	}
}
