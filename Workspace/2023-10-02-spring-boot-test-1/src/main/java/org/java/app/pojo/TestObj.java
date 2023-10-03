package org.java.app.pojo;

public class TestObj {

	private int id;
	private String name;
	
	public TestObj(int id, String name) {
		
		setId(id);
		setName(name);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getName();
	}
}
