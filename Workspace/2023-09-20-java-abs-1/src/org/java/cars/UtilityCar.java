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
	
	public void trainaAuto() {
		
		System.out.println("Sto trainando un'auto...");
	}
	
	@Override
	public int getDoorsCount() {
		return doorsCount;
	}
	public void setDoorsCount(int doorsCount) {
		this.doorsCount = doorsCount;
	}
	
//	@Override
//	public String toString() {
//		
//		return super.toString() 
//				+ "\ndoors count: " + getDoorsCount();
//	}
}
