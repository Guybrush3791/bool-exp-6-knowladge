package org.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Search: ");
		String search = sc.nextLine();
		
		final String url = "jdbc:mysql://localhost:3306/db_nations";
		final String user = "root";
		final String password = "code";
		
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			
			final String countryByName = 
							   " SELECT c.country_id, c.name 'nation', r.name 'country', c2.name 'continent'  "
							 + " FROM countries c  "
							 + "	JOIN regions r "
							 + "		ON c.region_id = r.region_id"
							 + "	JOIN continents c2 "
							 + "		ON r.continent_id = c2.continent_id "
							 + " WHERE c.name LIKE ? "
							 + " ORDER BY c.name ";
			final String statsByCountryId = 
							   " SELECT * "
							 + " FROM country_stats cs "
							 + " WHERE cs.country_id = ? "
							 + " ORDER BY `year` DESC "
							 + " LIMIT 1; ";
			final String languagesByCountryId = 
							   " SELECT * "
							 + " FROM languages l "
							 + "	JOIN country_languages cl "
							 + "		ON l.language_id = cl.language_id "
							 + " WHERE cl.country_id = ? ";
			
			PreparedStatement ps = conn.prepareStatement(countryByName);
			ps.setString(1, "%" + search + "%");
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
			
			System.out.print("Choose a country id: ");
			int countryId = Integer.valueOf(sc.nextLine());
			
			ps = conn.prepareStatement(languagesByCountryId);
			ps.setInt(1, countryId);
			rs = ps.executeQuery();
			
			String langs = "";
			while(rs.next()) {
				
				String lang = rs.getString("language");
				langs += lang + ", ";
			}
			
			System.out.println("Details:");
			System.out.println("Languages: " + langs);
			
		} catch (Exception e) {
			
			System.out.println("Errore di connessione: " + e.getMessage());
		}
		
		System.out.println("\n----------------------------------\n");
		System.out.println("The end");
	}
}
