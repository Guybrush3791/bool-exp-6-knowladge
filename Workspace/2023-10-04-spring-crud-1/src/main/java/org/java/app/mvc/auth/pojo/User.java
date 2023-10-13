package org.java.app.mvc.auth.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
	@NotNull
	private String username;
	
	@Column(nullable = false)
	@NotNull
	private String password;
	
	public User() { }
	public User(String username, String password) {
		
		setUsername(username);
		setPassword(password);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getUsername();
	}
}
