package org.java;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// Snack 1
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("value: ");
//		int value = sc.nextInt();
//		
//		sc.close();
//		
////		if (value % 2 == 0) {
////			
////			System.out.println("value: " + value);
////		} else {
////			
////			System.out.println("value: " + (value + 1));
////		}
//		
//		System.out.println("value: " + (value + (
//				value % 2 == 0
//				? 0
//				: 1
//			))
//		);
		
		// Snack 2
//		Random rnd = new Random();
//		
//		String[] names = { "name1", "name2", "name3" };
//		String[] lastnames = { "lastname1", "lastname2", "lastname3", "lastname4"};
//		
//		for (int x=0;x<5;x++) {
//			
//			int rndNameIndex = rnd.nextInt(names.length);
//			int rndLastnameIndex = rnd.nextInt(lastnames.length);
//			
//			String name = names[rndNameIndex];
//			String lastname = lastnames[rndLastnameIndex];
//			
//			System.out.println("fullname: " + name + " " + lastname);
//		}
		
		// Snack 3
//		Random rnd = new Random();
//		
//		final int lng = 10;
//		int[] arr = new int[lng];
//		
//		for (int x=0;x<lng;x++) {
//			
//			arr[x] = rnd.nextInt(10);
//		}
//		
//		int sum = 0;
//		for (int x=1;x<lng;x+=2) {
//			
//			System.out.println("[" + x + "] " + arr[x]);
//			sum += arr[x];
//		}
//		
//		System.out.println("sum: " + sum);
		
		// Snack 4
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Stringa: ");
//		String str = sc.nextLine().toLowerCase(); // anna : lng = 4
//		
//		System.out.println("\n---------------------\n");
//		
//		// OPZIONE 2
//		boolean palindrom = true;
//		for (int x=0;x<str.length()/2;x++) {
//			
//			int revX = str.length() - 1 - x;
//			
//			System.out.println("x: " + x);
//			System.out.println("revX: " + revX);
//			
//			char charX = str.charAt(x);
//			char charRevX = str.charAt(revX);
//			
//			System.out.println("charX: " + charX );
//			System.out.println("charRevX: " + charRevX);
//			
//			if (charX != charRevX) {
//				
//				palindrom = false;
//				break;
//			}
//			
//			System.out.println("\n---------------------\n");
//		}
//		
//		System.out.println("Palindoma: " + palindrom);
//		
////		OPZIONE 1
////		String revStr = "";
////		for (int x=str.length()-1;x>=0;x--) {
////			
////			revStr += str.charAt(x);
////		}
////		
////		if (str.equals(revStr)) {
////			
////			System.out.println("La stringa e' palindroma");
////		} else {
////			
////			System.out.println("La stringa NON e' palindroma");
////		}
		
		// Snack 5
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("Stringa: ");
//			String str = sc.nextLine();
//			
//			if (str.equals("0"))
//				break;
//			
//			char[] alphaList = new char[(int) 'z' - (int) 'a' + 1];
//			for (int x=0;x<alphaList.length;x++) {
//				
//				char c = (char) ((int) 'a' + x);
//				alphaList[x] = c;
//			}
//			
//			char[] numbList = new char[(int) '9' - (int) '0' + 1];
//			for (int x=0;x<numbList.length;x++) {
//				
//				char c = (char) ((int) '0' + x);
//				numbList[x] = c;
//			}
//			
//			int alphaCount = 0;
//			int numberCount = 0;
//			int symbolCount = 0;
//			
//			for (int x=0;x<str.length();x++) {
//				
//				char c = str.charAt(x);
//				
//				if (Character.isDigit(c)) {
//					
//					numberCount++;
//				} else if (Character.isLetter(c)) {
//					
//					alphaCount++;
//				} else {
//					
//					symbolCount++;
//				}
//			}
//			
//			System.out.println("Alpha count: " + alphaCount);
//			System.out.println("Number count: " + numberCount);
//			System.out.println("Symbol count: " + symbolCount);
//		}
//		
//		System.out.println("The end");
		
		// Snack 6
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Stringa: ");
//		String str = sc.nextLine().toLowerCase(); // 234
//		
//		int res = 0;
//		for (int x=0;x<str.length();x++) {
//			
//			char c = str.charAt(x); // 2 -- 3
//			int valC = (int) c - (int) '0'; // 2 -- 3
//			
//			res = res * 10 + valC; // 0 * 10 + 2 = 2 -- 2 * 10 + 3 = 23
//		}
//		
//		System.out.println("Integer value: " + res);
		 
		// Snack 7
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("Secondi: ");
//			int secondTot = sc.nextInt();
//			
//			int hour = secondTot / (60 * 60);
//			int minutes = (secondTot % (60 * 60)) / 60;
//			int seconds = secondTot % 60;
//			
//			System.out.println(
//					String.format("%02d", hour) + ":" 
//				    + String.format("%02d", minutes) + ":" 
//					+ String.format("%02d", seconds) 
//			);
//		}
		
		// Snack 8
//		Random rnd = new Random();
//		final int lng = 10;
//		int[] values = new int[lng];
//		
//		for (int x=0;x<lng;x++) {
//			
//			int value = rnd.nextInt(100, 151);
//			values[x] = value;
//		}
//		
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		int avg = 0;
//		for (int x=0;x<values.length;x++) {
//			
//			final int value = values[x];
//			
//			if (value < min)
//				min = value;
//			
//			if (value > max) 
//				max = value;
//			
//			avg += value;
//		}
//		
//		avg /= values.length;
//		
//		System.out.println("min: " + min);
//		System.out.println("max: " + max);
//		System.out.println("avg: " + avg);
		
		// Snack 9
//		Scanner sc = new Scanner(System.in);
//		
//		int sum = 0;
//		while (sum < 1_000) {
//			
//			System.out.print("Next value: ");
//			int value = sc.nextInt();
//			
//			sum += value;
//		}
//		sc.close();
//		
//		System.out.println("sum: " + sum);
		
		// Snack 10
		Random rnd = new Random();
		
		final int lng = 10;
		int[] values = new int[lng];
		
		for (int x=0;x<10;x++) {
			
			final int value = rnd.nextInt(100, 1001);
			values[x] = value;
		}
	}
}


















