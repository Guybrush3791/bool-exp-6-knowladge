package org.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static final String FILE_PATH = "/tmp/tmp/java.out";
	
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
		
		FileWriter myWriter = null;
		try {
			
			myWriter = new FileWriter(FILE_PATH, true);
		
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
		
		// lettura di tutto il file
		File tmpFile = new File(FILE_PATH);
		Scanner reader = null;
		try {
			
			reader = new Scanner(tmpFile);
			
			while (reader.hasNextLine()) {
				
				String line = reader.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) { 
		
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			
			if (reader != null)
				reader.close();
		}
	}
}
