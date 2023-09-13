package org.java;

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
		
		// -----------------------------------------
		
		// LETTURA/SCRITTURA DA TERMINALE
		String line = null;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Type something: ");
		line = in.nextLine();
		
		System.out.println("You typed: '" + line + "'");
	}
}
