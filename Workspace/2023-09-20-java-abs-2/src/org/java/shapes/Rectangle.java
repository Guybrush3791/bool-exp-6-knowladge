package org.java.shapes;

import org.java.shapes.inter.PolygonInterface;

public class Rectangle extends Square implements PolygonInterface {

	int y;
	
	public Rectangle(int x, int y) {
		
		super(x);
		
		setY(y);
	}

	@Override
	public int calcolaPerimetro() {
		
		return 2 * (getX() + getY());
	}
	@Override
	public int calcolaArea() {
		
		return getX() * getY();
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		
		return getX() + "x" + getY() + "\nperimetro: " + calcolaPerimetro() + "\narea: " + calcolaArea();
	}
}
