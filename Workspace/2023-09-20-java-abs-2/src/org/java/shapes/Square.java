package org.java.shapes;

import org.java.shapes.inter.PolygonInterface;

public class Square implements PolygonInterface {

	int x;
	
	public Square(int x) {
		
		setX(x);
	}

	@Override
	public int calcolaPerimetro() {
		
		return 4 * x;
	}
	@Override
	public int calcolaArea() {

		return x * x;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	@Override
	public String toString() {

		return getX() + "\nperimetro: " + calcolaPerimetro() + "\narea: " + calcolaArea();
	}
}
