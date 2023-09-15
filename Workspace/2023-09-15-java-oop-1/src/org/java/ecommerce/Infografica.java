package org.java.ecommerce;

public class Infografica {

	public boolean venduto;
	public String titolo;
	public String category;
	public int nImmagini;

	// costruttore di defauolt
	public Infografica() {
		
		venduto = false;
	}
	
	// costruttori con parametri
	public Infografica(String titolo, String category, int nImmagini) {
		
		this();
		
		this.titolo = titolo;
		this.category = category;
		this.nImmagini = nImmagini;
	}
	
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





