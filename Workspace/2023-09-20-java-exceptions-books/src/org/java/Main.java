package org.java;

import java.io.FileWriter;
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
		
		FileWriter writer = new FileWriter(null)
		for (int x=0;x<nLibri;x++) {
			
			Libro l = libri[x];
			System.out.println("Libro " + (x + 1) + ":\n" + l);
			
			
		}
	}
}
