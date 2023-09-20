package org.java;

import java.util.Scanner;

import org.java.library.Libro;

public class Main {

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
			
			Libro l = new Libro(titolo, nPagine, autore, editore);
			libri[x] = l;
			
			System.out.println("\n--------------------------------------\n");
		}
		
		for (int x=0;x<nLibri;x++) {
			
			Libro l = libri[x];
			System.out.println("Libro " + (x + 1) + ":\n" + l);
		}
	}
}
