package org.java;

public class Main {

	public static class Square {
		
		private int x;
		
		public Square(int x) {
		
			setX(x);
		}
		
		public int getX() {
			
			return x;
		}
		public void setX(int x) {
			
			this.x = x;
		}
		
		public int getArea() {
			
			return x * x;
		}
		public int getPerim() {
			
			return 4 * x;
		}
		
		@Override
		public String toString() {
			
			return "square: " + x + " | a: " + getArea() + " | p: " + getPerim();
		}
	}
	public static class Rectangle extends Square {

		private int y;
		
		public Rectangle(int x, int y) {
			super(x);
			
			setY(y);
		}
		
		public int getY() {
			
			return y;
		}
		public void setY(int y) {
			
			this.y = y;
		}
		
		@Override
		public int getArea() {
			
			return getX() * getY();
		}
		@Override
		public int getPerim() {
			
			return 2 * (getX() + getY());
		}
		
		@Override
		public String toString() {
			
			return "rect: " 
					+ getX() + "x" + getY() 
					+ " | a: " + getArea() 
					+ " | p: " + getPerim()
			;
		}
	}
	
	public static void main(String[] args) {
		
		Square s1 = new Square(5);
		System.out.println(s1);
		
		Rectangle r1 = new Rectangle(7, 3);
		System.out.println(r1);
	}
}
