package org.java;

import org.java.cars.SportCar;

public class Main {

	public static void main(String[] args) {
		
		SportCar sc1 = new SportCar("Ferrari", 320);
		System.out.println("SC 1:");
		System.out.println("-----------------------\n");
		System.out.println(sc1);

		System.out.println("\n-----------------------\n");
		
		sc1.stampaVelocitaMassima();
		sc1.stampaNumeroPorte();
		
		System.out.println("\n-----------------------\n");
	}
}
