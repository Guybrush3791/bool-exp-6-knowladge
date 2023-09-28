package org.java.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/db-aeroporto";
		String user = "root";
		String password = "code";
		
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			  
			System.out.println("Connection to db...OK!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
