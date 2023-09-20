package org.java.cars;

public abstract class Auto {

	private String name;
	private int maxSpeed;
	private int doorsCount;
	
	public Auto(String name, int maxSpeed, int doorsCount) {
		
		setName(name);
		setMaxSpeed(maxSpeed);
		setDoorsCount(doorsCount);
	}

	public void stampaVelocitaMassima() {
		
		System.out.println("max speed: " + getMaxSpeed());
	}
	public void stampaNumeroPorte() {
		
		System.out.println("doors count: " + getDoorsCount());
	}
	public void accenditi() {
		
		System.out.println("turning on");
	}
	public void spegniti() {
		
		System.out.println("turning off");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getDoorsCount() {
		return doorsCount;
	}
	public void setDoorsCount(int doorsCount) {
		this.doorsCount = doorsCount;
	}
	
	@Override
	public String toString() {
		
		return getName()  
				+ ":\nmax speed: " + getMaxSpeed() 
				+ "\ndoors count: " + getDoorsCount()
		;
	}
}
