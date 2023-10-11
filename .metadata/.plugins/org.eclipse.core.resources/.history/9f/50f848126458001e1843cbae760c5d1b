package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		
		Random rnd = new Random(100);
		List<Integer> values = new ArrayList<>();
		
		for (int x=0;x<10;x++) 
			values.add(rnd.nextInt(0, 100));
		
		System.out.println(values);
		
//		values.stream().forEach(x -> System.out.println(x));
//		values.stream().forEach(System.out::println);
		
		List<Integer> valuesLT50 = new ArrayList<>();
		for (Integer value : values) {
			
			if (value < 50) 
				valuesLT50.add(value);
		}
		System.out.println(valuesLT50);
	}
}
