package org.java;

import org.java.cars.SportCar;
import org.java.cars.UtilityCar;

public class Main {

	public static void main(String[] args) {
		
		SportCar sc1 = new SportCar("Ferrari", 320);
		
		System.out.println("SC 1:");
		System.out.println("-----------------------\n");
		System.out.println(sc1);

		System.out.println("\n-----------------------\n");
		
		sc1.stampaVelocitaMassima();
		sc1.stampaNumeroPorte();
		
		System.out.println("\n-----------------------\n\n");
		
		UtilityCar uc1 = new UtilityCar("Fiesta", 180, 5);
		
		System.out.println("UC 1:");
		System.out.println("-----------------------\n");
		System.out.println(uc1);

		System.out.println("\n-----------------------\n");
		
		uc1.stampaVelocitaMassima();
		uc1.stampaNumeroPorte();
		
		System.out.println("\n-----------------------\n\n");
	}
}
