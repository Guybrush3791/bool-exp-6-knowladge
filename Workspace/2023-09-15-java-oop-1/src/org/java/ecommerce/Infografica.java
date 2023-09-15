package org.java.ecommerce;

public class Infografica {

	public String titolo;
	public String category;
	public int nImmagini;

	public String getString() {
		
		return titolo + " - " + category + " - " + nImmagini;
	}
	public void printMe() {
		
		printMe(-1);
	}
	public void printMe(int index) {
		
		System.out.println("info " + index + " all: " + getString());
	}
}





