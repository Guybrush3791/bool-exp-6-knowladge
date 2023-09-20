package org.java;

import org.java.shapes.Rectangle;
import org.java.shapes.Square;
import org.java.shapes.inter.PolygonInterface;

public class Main {

	public static interface iNuota { /*...*/ }
	public static interface iVola { /*...*/ }
	
	public static void main(String[] args) {
		
		Square s1 = new Square(5);
		System.out.println(s1);
		
		System.out.println("\n-----------------------\n");
		
		Rectangle r1 = new Rectangle(3, 5);
		System.out.println(r1);
		
		System.out.println("\n-----------------------\n");
		
		PolygonInterface[] shapes = new PolygonInterface[2];
		shapes[0] = s1;
		shapes[1] = r1;
		
		int avgPer = 0;
		int avgArea = 0;
		for (int x=0;x<shapes.length;x++) {
			
			PolygonInterface shape = shapes[x];
			
			avgPer += shape.calcolaPerimetro();
			avgArea += shape.calcolaArea();
						
			System.out.println(shape);
			System.out.println("\n-----------------------\n");
		}
		
		avgPer /= shapes.length;
		avgArea /= shapes.length;
		
		System.out.println("media perimetro: " + avgPer);
		System.out.println("media area: " + avgArea);
	}

	public static void faiVolare(iVola variabile) {
		
		
	}
}
