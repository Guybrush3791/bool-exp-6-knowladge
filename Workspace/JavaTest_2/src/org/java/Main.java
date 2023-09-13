package org.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TIPI DI DATO PRIMITIVI
		// interi
		boolean b1 = true; // false
		byte b2 = 100;
		short s1 = 30_000;
		int i1 = 2_140_999_999;
		long l1 = 9_999_999_999_999_999L;
		
		// virgola mobile
		float f1 = 10.0F;
		double d1 = 20.0;
		
		// character
		char c = 's';
		
		// OGGETTI
		String str = "my string";
		Scanner sc = new Scanner(System.in);

		System.out.println("// -----------------------------------------");
		
		// -----------------------------------------
		
		// SOMMA/CONCATENAZIONE
		int x = 10;
		int y = 20;
		
		String s2 = "hello";
		String s3 = "world";
		
		int z = x + y; // 10 + 20 = 30;
		System.out.println("z: " + z);
		
		String sR = s2 + s3; // "hello" + "world" = "helloworld"
		System.out.println("sR: " + sR);
		
		String sR2 = x + s2; // 10 + "hello" = "10hello"
		System.out.println("sR2: " + sR2);
		
		String intConcat = "" + x + y;
		System.out.println("intConcat: " + intConcat);
		
		System.out.println("// -----------------------------------------");
		
		// -----------------------------------------
		
		// LETTURA/SCRITTURA DA TERMINALE
//		String line = null;
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Type something: ");
//		line = in.nextLine();
//		
//		System.out.println("You typed: '" + line + "'");
//		
//		System.out.println("// -----------------------------------------");
		
		// -----------------------------------------
		
		// OPERATORI CONDIZIONALI
		
		int x1 = 10;
		int x2 = 10;
		int x3 = 20;
		int x4 = 50;
		
		if (x1 == 10) {
			
			System.out.println("x1 is 10");			
		}
		
		if (x1 > x2) { 
			
			System.out.println("x1 is gt x2");
		} else if (x3 < x4) {
			
			System.out.println("x3 is lt x4");
		} else {
			
			System.out.println("I don't really f***ing know");
		}
		
		System.out.println("// -----------------------------------------");
		
		// -----------------------------------------
		
		// CLASSE RANDOM
		
		Random rnd = new Random();
		rnd.setSeed(100);
		
		int val = rnd.nextInt(10, 20);
		System.out.println("val: " + val);
		
		System.out.println("// -----------------------------------------");
		
		// -----------------------------------------
		
		// TYPE CASTING
		
		int myInt = 100;
		long myLong = myInt;
		System.out.println("myLong: " + myLong);
		
		long myLong2 = 2_147_483_650L;
		int myInt2 = (int) myLong2;
		System.out.println("myInt2: " + myInt2);
		
		System.out.println("// -----------------------------------------");
		
		// -----------------------------------------
		
		// STRING
		
		String myStr = "Hello, World!";
		System.out.println("myStr: " + myStr);
		
		int lng = myStr.length();
		System.out.println("lng: " + lng);
		
		String myStrUpper = myStr.toUpperCase();
		System.out.println("myStrUpper: " + myStrUpper);
		
		float f2 = 10.23944F;
		String formattedF2 = String.format("%.04f", f2);
		System.out.println("formattedF2: " + formattedF2);
		
		int i2 = 3;
		String formattedI2 = String.format("hello: %06d", i2);
		System.out.println("formattedI2: " + formattedI2);
		
		System.out.println("// -----------------------------------------");	
		
		// -----------------------------------------
		
		// ARRAY
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = new int[10];
		
		arr2[0] = 100;
		arr2[9] = 200;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[9]);
		System.out.println(arr2[1]);
		
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		// -----------------------------------------
		
	}
}
