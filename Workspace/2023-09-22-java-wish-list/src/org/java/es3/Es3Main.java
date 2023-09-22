package org.java.es3;

import java.util.Random;

public class Es3Main {
	
	public static void main(String[] args) {
	
		Random rnd = new Random(100);
		
		int[] values = new int[10];
		for (int x=0;x<10;x++) 
			values[x] = rnd.nextInt(0, 101);
	}
}
