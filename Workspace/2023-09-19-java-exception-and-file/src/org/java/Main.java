package org.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero persone: ");
		int persCount = Integer.valueOf(sc.nextLine());
		
		Persona[] persone = new Persona[persCount];
		
		for (int x=0;x<persCount;x++) {
			
			try {
		
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Lastname: ");
				String lastname = sc.nextLine();
				
				System.out.print("Age: ");
				int age = Integer.valueOf(sc.nextLine());
				
				Persona p = new Persona(name, lastname, age);
				persone[x] = p;
			} catch (Exception e) {
				
				System.err.println("Invalid Persona data: " + e.getMessage());
				
				x--;
			}
		}
		sc.close();
		
		System.out.println("\n------------------------------\n");
		
//		File tmpFile = new File("/tmp/tmp/java.out");
		
		FileWriter myWriter = null;
		try {
			
			myWriter = new FileWriter("/tmp/tmp/java.out");
		
			for (int x=0;x<persCount;x++) {
				
				myWriter.write(persone[x].getFullname() + "\n");
				
				System.out.println("Persona " + (x + 1));
				System.out.println("------------------");
				System.out.println(persone[x]);
				System.out.println("");
			}
		} catch (IOException e) {
			
			System.err.println("Error updating file: " + e.getMessage());
		} finally {
			
			try {
				myWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
