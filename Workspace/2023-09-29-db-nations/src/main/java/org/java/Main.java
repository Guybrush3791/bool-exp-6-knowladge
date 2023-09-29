package org.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		
		final String url = "jdbc:mysql://localhost:3306/db_nations";
		final String user = "root";
		final String password = "code";
		
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			
			final String sql = " SELECT c.country_id, c.name 'nation', r.name 'country', c2.name 'continent'  "
							 + " FROM countries c  "
							 + "	JOIN regions r "
							 + "		ON c.region_id = r.region_id"
							 + "	JOIN continents c2 "
							 + "		ON r.continent_id = c2.continent_id "
							 + " ORDER BY c.name ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("country_id");
				String nation = rs.getString("nation");
				String country = rs.getString("country");
				String continent = rs.getString("continent");
				
				System.out.println("[" + id + "] " + nation);
				System.out.println("country: " + country);
				System.out.println("continent: " + continent);
				
				System.out.println("\n---------------------------------\n");
						
			}
		} catch (Exception e) {
			
			System.out.println("Errore di connessione: " + e.getMessage());
		}
		
		System.out.println("\n----------------------------------\n");
		System.out.println("The end");
	}
}
