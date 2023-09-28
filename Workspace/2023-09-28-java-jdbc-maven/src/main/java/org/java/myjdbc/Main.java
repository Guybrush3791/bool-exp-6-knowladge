package org.java.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	static final String passName = "pluto"; // from ext
	
	static final String url = "jdbc:mysql://localhost:3306/db-aeroporto";
	static final String user = "root";
	static final String password = "code";
		
	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			  
//			readAllPassagerTable(con);
			updateId1Name(con);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static final void updateId1Name(Connection con) {
		
		final String sql = " UPDATE passengers "
						 + " SET name = ? "
						 + " WHERE id = 1 ";		
		
		PreparedStatement ps = con.prepareStatement(passName)
	}
	private static final void readAllPassagerTable(Connection con) {
		
		final String sql = " SELECT id, name, lastname, date_of_birth "
				 + " FROM passengers p ";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				String dateOfBirth = rs.getString("date_of_birth");
				
				System.out.println("Passegero: " + id + "\n");
				System.out.println("name: " + name + " " + lastname);
				System.out.println("date of birth: " + dateOfBirth);
				
				System.out.println("\n------------------------------\n");
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
