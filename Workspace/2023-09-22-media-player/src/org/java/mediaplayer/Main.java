package org.java.mediaplayer;

import org.java.mediaplayer.media.Image;
import org.java.mediaplayer.media.abs.Media;

public class Main {

	public static void main(String[] args) {
		
		try {
		
			Media mediaImg1 = new Image("test img");
			
			mediaImg1.execute();
			
//			mediaImg1.
		} catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("The End");
	}
}
