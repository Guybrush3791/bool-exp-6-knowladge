package org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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
		
		List<Integer> valuesLT50Stream = values.stream().filter(x -> x < 50).toList();
		String valueLT50StreamString = values.stream()
												.filter(x -> x < 50)
												.map(String::valueOf)
											.collect(Collectors.joining(" - "));
		System.out.println(valuesLT50Stream);
		System.out.println(valueLT50StreamString);
	}
}
