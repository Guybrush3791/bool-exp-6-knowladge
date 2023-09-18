package org.lessons.java.geometria;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo r1 = new Rettangolo(3, 4);
		Rettangolo r2 = new Rettangolo(5, 10);
		Rettangolo r3 = new Rettangolo(4, 3);
		Rettangolo r4 = new Rettangolo(7, 8);
		
//		r3.setBase(-7);
		System.out.println("Numero rettangoli istanziati: " 
					+ r4.getInstanceCounter()
		);
		
		System.out.println("R1:\n-------------------");
		System.out.println("area: " + r1.getArea());
		System.out.println("perimetro: " + r1.getPerimetro());
		
		System.out.println("\n" + r1.getDrawing() + "\n"); 
		
		System.out.println("\n\nR2:\n-------------------");
		System.out.println("area: " + r2.getArea());
		System.out.println("perimetro: " + r2.getPerimetro());
		
		System.out.println("\n" + r2.getDrawing() + "\n"); 
		
		System.out.println("\n\nR3:\n-------------------");
		System.out.println("area: " + r3.getArea());
		System.out.println("perimetro: " + r3.getPerimetro());
		
		System.out.println("\n" + r3.getDrawing() + "\n"); 
	}
}
