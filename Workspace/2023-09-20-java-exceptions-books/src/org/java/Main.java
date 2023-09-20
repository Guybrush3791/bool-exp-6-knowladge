package org.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi inserire?");
		int nLibri = Integer.valueOf(sc.nextLine());
		
		for (int x=0;x<nLibri;x++) {
			
			System.out.print("Titolo: ");
			String titolo = sc.nextLine();
			
			System.out.print("Numero pagine: ");
			int nPagine = Integer.valueOf(sc.nextLine());
			
			System.out.print("Autore: ");
			String autore = sc.nextLine();
			
			System.out.print("Editore: ");
			String editore = sc.nextLine();
		}
	}
}
