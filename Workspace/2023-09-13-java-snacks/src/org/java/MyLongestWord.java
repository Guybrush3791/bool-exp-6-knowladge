package org.java;

import java.util.Scanner;

public class MyLongestWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("word 1: ");
		String word1 = sc.nextLine();
		
		System.out.print("word 2: ");
		String word2 = sc.nextLine();
		
		sc.close();
		
		if (word1.length() > word2.length()) {
			
			System.out.println(word1 + " > " + word2);
		} else if (word1.length() < word2.length()) {
			
			System.out.println(word2 + " > " + word1);
		} else {
			
			System.out.println(word2 + " == " + word1);
		}
	}
}
