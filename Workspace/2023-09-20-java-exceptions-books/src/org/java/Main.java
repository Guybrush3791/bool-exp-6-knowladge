package org.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.java.library.Libro;

public class Main {

	private static final String LOG_PATH = "/tmp/tmp/java-log.out";
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanti libri vuoi inserire?");
		int nLibri = Integer.valueOf(sc.nextLine());
		
		Libro[] libri = new Libro[nLibri];		
		for (int x=0;x<nLibri;x++) {
			
			System.out.println("Libro " + (x + 1) + ":");
			
			System.out.print("Titolo: ");
			String titolo = sc.nextLine();
			
			System.out.print("Numero pagine: ");
			int nPagine = Integer.valueOf(sc.nextLine());
			
			System.out.print("Autore: ");
			String autore = sc.nextLine();
			
			System.out.print("Editore: ");
			String editore = sc.nextLine();
			
			try {
				
				Libro l = new Libro(titolo, nPagine, autore, editore);
				libri[x] = l;
			} catch (Exception e) {
				
				System.out.println("Il libro non puo' essere creato: " + e.getMessage());
				x--;
			}
			
			System.out.println("\n--------------------------------------\n");
		}
		
		FileWriter writer = null;
		try {
			writer = new FileWriter(LOG_PATH);
		
			for (int x=0;x<nLibri;x++) {
				
				Libro l = libri[x];
				System.out.println("Libro " + (x + 1) + ":\n" + l);
				
				writer.write(l.getTitolo() + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		File logFile = new File(LOG_PATH);
		Scanner reader = null;
		try {
			
			reader = new Scanner(logFile);
			
			while(reader.hasNextLine()) {
				
				String line = reader.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) { 
			
			System.out.println("Error opening log file: " + e.getMessage());
		} finally {
			
			if (reader != null) 
				reader.close();
		}
	}
}
