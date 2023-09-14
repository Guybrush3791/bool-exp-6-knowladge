package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] bestFoods = {
			"cibo 1",
			"cibo 2",
			"cibo 3",
			"cibo 4",
			"cibo 5",

		};
		
		System.out.println("Numero cibi: " + bestFoods.length);
		System.out.println("Cibo top: " + bestFoods[0]);
		System.out.println("Cibo worst: " + bestFoods[bestFoods.length - 1]);

		int medIndex = bestFoods.length / 2;
		boolean pairArray = bestFoods.length % 2 == 0;
		
		if (pairArray) {
			
			System.out.println("Cibo med: " + bestFoods[medIndex - 1] + " ~ " + bestFoods[medIndex]);
		} else {
			
			System.out.println("Cibo med: " + bestFoods[medIndex]);
		}
	}
}
