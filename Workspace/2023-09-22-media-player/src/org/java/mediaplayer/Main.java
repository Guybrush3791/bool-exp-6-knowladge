package org.java.mediaplayer;

import org.java.mediaplayer.media.Image;
import org.java.mediaplayer.media.Video;
import org.java.mediaplayer.media.abs.Media;

public class Main {

	public static void main(String[] args) {
		
		try {
		
			Video v1 = new Video("video 1");
			Media mediaV1 = v1;
			
			mediaV1.execute();
			
			v1.brighter();
			v1.louder();
			
			mediaV1.execute();
		} catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("The End");
	}
}
