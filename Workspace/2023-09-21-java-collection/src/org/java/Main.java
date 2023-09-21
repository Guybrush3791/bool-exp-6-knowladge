package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	}
}
