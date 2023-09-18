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

		public Rectangle(int x) {
			super(x);
			
			
		}
	}
	
	public static void main(String[] args) {
		
		Square s = new Square(5);
		System.out.println(s);
	}
}
