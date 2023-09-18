package org.lessons.java.geometria;

public class Rettangolo {

	private static int instanceCounter = 0;
	
	private int base;
	private int altezza;
	
	public Rettangolo(int base, int altezza) {
		
		setBase(base);
		setAltezza(altezza);
		
		instanceCounter++;
	}
	
	public int getBase() {
		
		return base;
	}
	public void setBase(int base) {
		
		if (base > 0) 
			this.base = base;
	}
	public int getAltezza() {
		
		return altezza;
	}
	public void setAltezza(int altezza) {
		
		this.altezza = altezza;
	}
	
	public int getArea() {
		
		return base * altezza;
	}
	public int getPerimetro() {
		
		return 2 * (base + altezza);
	}
	
	public static int getInstanceCounter() {
		
		return instanceCounter;
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
