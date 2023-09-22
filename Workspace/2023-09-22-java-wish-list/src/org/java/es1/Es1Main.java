package org.java.es1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Es1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Java Wish List");
		
		String userContinue = "y";
		List<Wish> wishes = new ArrayList<>();
		while (userContinue.equalsIgnoreCase("y")) {
			
			System.out.print("Nome del regalo: ");
			String wishName = sc.nextLine();
			System.out.print("Destinatario del regalo: ");
			String wishRecipient = sc.nextLine();
			
			Wish wish = new Wish(wishName, wishRecipient);
			
			wishes.add(wish);
			int lng = wishes.size();
			
			System.out.println("Numero regali: " + lng);
			System.out.println("Vuoi inserire un altro regalo? [Y/n]");
			userContinue = sc.nextLine();
		}
		sc.close();
		
		System.out.println("Lista desideri:\n" + wishes);
	}
}
