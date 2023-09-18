package org.lessons.java.geometria;

public class Rettangolo {

	private int base;
	private int altezza;
	
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
		
		for (int x=0;x<altezza;x++) {
			for (int y=0;y<base;y++) {
				
				if (x == 0 || x == altezza -1 || y == 0 || y == base -1)
					str += "0";
				else str += " ";
			}
			
			str += "\n";
		}
		
		return str;
	}
}
