package org.java.mediaplayer;

import org.java.mediaplayer.media.Audio;
import org.java.mediaplayer.media.abs.Media;

public class Main {

	public static void main(String[] args) {
		
		try {
		
			Audio a1 = new Audio("mio audio");
			Media mediaA1 = a1;
			
			mediaA1.execute();
			
			a1.weaker();
			a1.weaker();
			a1.weaker();
			a1.weaker();
			a1.weaker();
			a1.weaker();
			a1.weaker();
			
			
			a1.execute();
		} catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("The End");
	}
}
