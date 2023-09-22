package org.java.mediaplayer;

import org.java.mediaplayer.media.Image;
import org.java.mediaplayer.media.abs.Media;

public class Main {

	public static void main(String[] args) {
		
		try {
		
			Image img1 = new Image("test img");
			Media mediaImg1 = img1;
			
			mediaImg1.execute();
			
			img1.darker();
			img1.darker();
			img1.darker();img1.darker();img1.darker();img1.darker();img1.darker();img1.darker();img1.darker();
			
			mediaImg1.execute();
		} catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("The End");
	}
}
