package org.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
//		List<String> strings = new ArrayList<>();
//		
//		strings.add("Hello");
//		strings.add("World!");
//		
//		System.out.println(strings);
//		
//		List<Integer> values = new ArrayList<>();
//		for (int x=0;x<100;x++) {
//			
//			int value = rnd.nextInt(0, 10);
//			values.add(value);
//		}
//		
//		System.out.println(values);
//		
//		Set<Integer> uniqueValues = new HashSet<>();
//		for (int x=0;x<100;x++) {
//			
//			int value = rnd.nextInt(0, 10);
//			uniqueValues.add(value);
//		}
//		
//		System.out.println(uniqueValues);
//		for (Integer value : uniqueValues) {
//			
//			System.out.println("value: " + value);
//		}
//		
//		List<Integer> listUniqueValues = new ArrayList<>(uniqueValues);
//		System.out.println("list: " + listUniqueValues);
//		
//		System.out.println("-------------------------------------");
//		
//		Iterator<Integer> itValues = uniqueValues.iterator();
//		while(itValues.hasNext()) {
//			
//			Integer value = itValues.next();
//			System.out.println("value: " + value);
//		}
//		
		String lorem = "aabbccddefg";
		Map<Character, Integer> charCounter = new HashMap<>();
		for (int x=0;x<lorem.length();x++) {
			
			char loremChar = lorem.toLowerCase().charAt(x);
			
			if (charCounter.containsKey(loremChar)) {
				
				charCounter.put(loremChar, charCounter.get(loremChar) + 1);
			} else {
				
				charCounter.put(loremChar, 1);
			}
		}
		
		for (Character k : charCounter.keySet()) {
			
			Integer v = charCounter.get(k);
			
			System.out.println(k + " --> " + v);
			
//			System.out.println("k: " + k);
//			System.out.println("v: " + v);
		}
		
		Collection<Integer> values = charCounter.values();
		for (Integer value : values) { 
			System.out.println("value: " + value);
		}
	}
}
