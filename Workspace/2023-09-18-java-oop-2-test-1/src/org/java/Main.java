package org.java;

import java.util.Scanner;

public class Main {

	public static class Square {
		
		private int x;
		
		public Square(int x) throws Exception {
		
			setX(x);
		}
		
		public int getX() {
			
			return x;
		}
		public void setX(int x) throws Exception {
			
			if (x <= 0)
				throw new Exception();
				
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
//	public static class Rectangle extends Square {
//
//		private int y;
//		
//		public Rectangle(int x, int y) {
//			super(x);
//			
//			setY(y);
//		}
//		
//		public int getY() {
//			
//			return y;
//		}
//		public void setY(int y) {
//			
//			this.y = y;
//		}
//		
//		@Override
//		public int getArea() {
//			
//			return getX() * getY();
//		}
//		@Override
//		public int getPerim() {
//			
//			return 2 * (getX() + getY());
//		}
//		
//		@Override
//		public String toString() {
//			
//			return "rect: " 
//					+ getX() + "x" + getY() 
//					+ " | a: " + getArea() 
//					+ " | p: " + getPerim()
//					+ " | original p: " + super.getPerim()
//			;
//		}
//	}
	
	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
			
			sc = new Scanner(System.in);
			int lato = Integer.valueOf(sc.nextLine());
			
			Square s1 = new Square(lato);
			System.out.println(s1);
		} catch (Exception e) {

			System.err.println("Il lato non puo' essere 0 o inferiore");
			System.err.println(e.getMessage());
		} finally {
			
			if (sc != null)
				sc.close();
		}
		
//		
//		Rectangle r1 = new Rectangle(7, 3);
//		System.out.println(r1);
	}
}
