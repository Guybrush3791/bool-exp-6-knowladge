package org.java.cars;

import org.java.cars.abs.Auto;

public class SportCar extends Auto {

	private static final int DOORS_COUNT = 2;
	
	public SportCar(String name, int maxSpeed) {
		super(name, maxSpeed);
	}

	@Override
	public void stampaNumeroPorte() {
		
		System.out.println("Doors count: " + getDoorsCount());
	}

	public void attivaIlTurbo() {
		
		System.out.println("Ho attivato il turbo!!!");
	}

	@Override
	public int getDoorsCount() {
		
		return DOORS_COUNT;
	}
	
//	@Override
//	public String toString() {
//		
//		return super.toString()
//				+ "\ndoors count: " + DOORS_COUNT;
//	}
}
