package org.lessons.java.geometria;

public class Rettangolo {

	public int base;
	public int altezza;
	
	public Rettangolo(int base, int altezza) {
		
		this.base = base;
		this.altezza = altezza;
	}
	
	public int getArea() {
		
		return base * altezza;
	}
	public int getPerimetro() {
		
		return 2 * (base + altezza);
	}
	
	public String getDrawing() {
		
		String str = "";
		
		for (int x=0;x<base;x++) {
			
			str += "0";
		}
		
		return str;
	}
}
