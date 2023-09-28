package org.java.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		
		final String url = "jdbc:mysql://localhost:3306/db-aeroporto";
		final String user = "root";
		final String password = "code";
		
		final String sql = " SELECT id, name, lastname, date_of_birth "
						 + " FROM passengers p ";	
		
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			  
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				String dateOfBirth = rs.getString("date_of_birth");
				
				System.out.println("Passegero\n");
				System.out.println("name: " + name + " " + lastname);
				System.out.println("date of birth: " + dateOfBirth);
				
				System.out.println("\n------------------------------\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
