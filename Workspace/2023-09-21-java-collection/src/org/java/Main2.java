package org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.management.ValueExp;

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
		
//		values = values.stream().toList();
		List<String> valuesString = values.stream()
											.map(x -> x * 2)
											.map(x -> "" + x)
										.toList();
		System.out.println("lista stringhe: " + valuesString);
		
		List<Integer> valuesLT50Stream = values.stream().filter(x -> x < 50).toList();
		String valueLT50StreamString = values.stream()
												.filter(x -> x < 50)
												.map(String::valueOf)
											.collect(Collectors.joining(" - "));
		System.out.println(valuesLT50Stream);
		System.out.println(valueLT50StreamString);
		
		String valueLT50String = "";
		for (int x=0;x<values.size();x++) {
			
			Integer value = values.get(x);
			
			if (value < 50) {
				
				valueLT50String += value + (
						x < values.size() - 1 ? " - " : ""
				);
			}
		}
		System.out.println(valueLT50String);
		
		values.add(-1);
		boolean isAllPositive = values.stream().allMatch(x -> x >= 0);
		System.out.println("is all positive: " + isAllPositive);
		
		int avg = 0;
		for (Integer value : values) {
			
			avg += value;
		}
		
		avg /= values.size();
		System.out.println("avg: " + avg);
		
		int avg2 = values.stream().reduce(0, (value, oldValue) -> value + oldValue) / values.size();
		System.out.println("avg2: " + avg2);
		
		List<Integer> orderedValue = values.stream()
												.sorted((x, y) -> y - x)
											.toList();
		System.out.println(orderedValue);
		
		Integer[] orderedValueArr = orderedValue.stream().toList().toArray(new Integer[0]);
	}
}
