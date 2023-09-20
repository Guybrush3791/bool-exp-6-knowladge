package org.java.cars;

import org.java.cars.abs.Auto;

public class UtilityCar extends Auto {

	private int doorsCount;
	
	public UtilityCar(String name, int maxSpeed, int doorCount) {
		super(name, maxSpeed);
		
		setDoorsCount(doorCount);
	}

	@Override
	public void stampaNumeroPorte() {
		
		System.out.println("Doors count: " + getDoorsCount());
	}
	
	public int getDoorsCount() {
		return doorsCount;
	}
	public void setDoorsCount(int doorsCount) {
		this.doorsCount = doorsCount;
	}
	
	@Override
	public String toString() {
		
		return super.toString() 
				+ "doors count: " + getDoorsCount();
	}
}
