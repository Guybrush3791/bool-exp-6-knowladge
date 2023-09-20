package org.java;

import org.java.cars.SportCar;
import org.java.cars.UtilityCar;
import org.java.cars.abs.Auto;

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
		
		Auto[] cars = new Auto[2];
		cars[0] = sc1;
		cars[1] = uc1;
		
		// ----------------------
		
		int avgMaxSpeed = 0;
		int avgDoorsCount = 0;
		for (int x=0;x<cars.length;x++) {
			
			Auto a = cars[x];
			
			avgMaxSpeed += a.getMaxSpeed();
			avgDoorsCount += a.getDoorsCount();
		}
		
		avgMaxSpeed /= cars.length;
		avgDoorsCount /= cars.length;

		System.out.println("Velocita' massima media: " + avgMaxSpeed + "km/h");
		System.out.println("Numero medio porte auto: " + avgDoorsCount);
	}
}
