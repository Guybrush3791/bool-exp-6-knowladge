package org.java.mediaplayer;

import org.java.mediaplayer.media.Audio;
import org.java.mediaplayer.media.Image;
import org.java.mediaplayer.media.Video;
import org.java.mediaplayer.media.abs.Media;

public class Main {

	public static void main(String[] args) {
		
		try {
		
			Image i1 = new Image("mio immagine");
			i1.execute();
		} catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("The End");
	}
}
