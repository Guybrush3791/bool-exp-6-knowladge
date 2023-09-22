package org.java.es3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Es3Main {
	
	public static void main(String[] args) {
	
//		Random rnd = new Random(100);
//		
//		int[] values = new int[10];
//		for (int x=0;x<10;x++) 
//			values[x] = rnd.nextInt(0, 101);
//		
//		MyIterator myIt = new MyIterator(values);
//		
//		while(myIt.hasNext()) {
//			
//			int value = myIt.getNextElement();
//			
//			System.out.println("value: " + value);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		MyIterator myIt = new MyIterator();
		
		String userContinue = "y";
		while (userContinue.equalsIgnoreCase("y")) {
			
			System.out.print("Valore: ");
			int value = Integer.valueOf(sc.nextLine());
			
			myIt.addElement(value);
			
			System.out.println("Altro elemento? [Y/n]");
			userContinue = sc.nextLine();
		}
		
		while(myIt.hasNext()) {
			
			int value = myIt.getNextElement();
			
			System.out.println("value: " + value);
		}
		
		List<Integer> myL = new ArrayList<>();
		myL.add(10);
	}
}
