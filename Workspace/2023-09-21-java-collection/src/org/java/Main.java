package org.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		
		strings.add("Hello");
		strings.add("World!");
		
		System.out.println(strings);
		
		Random rnd = new Random();
		List<Integer> values = new ArrayList<>();
		for (int x=0;x<100;x++) {
			
			int value = rnd.nextInt(0, 10);
			values.add(value);
		}
		
		System.out.println(values);
		
		Set<Integer> uniqueValues = new HashSet<>();
		for (int x=0;x<100;x++) {
			
			int value = rnd.nextInt(0, 10);
			uniqueValues.add(value);
		}
		
		System.out.println(uniqueValues);
		
		String lorem = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Corrupti pariatur temporibus molestias nobis saepe maxime libero nulla neque officia iste quidem, reprehenderit beatae quam! Odio labore libero aut itaque voluptate?";
		Map<Character, Integer> charCounter = new HashMap<>();
		for (int x=0;x<lorem.length();x++) {
			
			char loremChar = lorem.toLowerCase().charAt(x);
			
			if (charCounter.containsKey(loremChar)) {
				
				charCounter.put(loremChar, charCounter.get(loremChar) + 1);
			} else {
				
				charCounter.put(loremChar, 1);
			}
		}
		
		System.out.println(charCounter);
	}
}
