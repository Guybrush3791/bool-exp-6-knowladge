package org.java.cars.abs;

public abstract class Auto {

	private String name;
	private int maxSpeed;
	
	public Auto(String name, int maxSpeed) {
		
		setName(name);
		setMaxSpeed(maxSpeed);
	}

	public abstract void stampaNumeroPorte();
	
	public void stampaVelocitaMassima() {
		
		System.out.println("max speed: " + getMaxSpeed());
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
	
	@Override
	public String toString() {
		
		return getName()  
				+ ":\nmax speed: " + getMaxSpeed() 
		;
	}
}
