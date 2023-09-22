package org.java.es1;

public class Wish {

	private String name;
	private String recipient;
	public Wish(String name, String recipient) {
		
		setName(name);
		setRecipient(recipient);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	@Override
	public String toString() {
		
		return getName() + " --> " + getRecipient();
	}
}
