package org.java.es2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Es2main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Frase: ");
		String phrase = sc.nextLine();
		
		Map<Character, Integer> occurences = new HashMap<>();
		for (Character c : phrase.toCharArray()) {
			
			occurences.put(c, 
					(
							occurences.containsKey(c)
							? occurences.get(c)
							: 0
					) + 1
			);
			
//			if (occurences.containsKey(c)) {
//				occurences.put(c, occurences.get(c) + 1);
//			} else {
//				occurences.put(c, 1);
//			}
		}
		
		System.out.println("Occurences:\n" + occurences);
	}
}
