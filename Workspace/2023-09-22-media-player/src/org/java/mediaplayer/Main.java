package org.java.mediaplayer;

import java.util.Arrays;
import java.util.Scanner;

import org.java.mediaplayer.media.Audio;
import org.java.mediaplayer.media.Image;
import org.java.mediaplayer.media.Video;
import org.java.mediaplayer.media.abs.Media;

public class Main {

	private static final int MEDIA_COUNT = 2;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Media[] medias = new Media[MEDIA_COUNT];
		
		for (int x=0;x<MEDIA_COUNT;x++) {
			
			System.out.println("Media type:");
			System.out.println("1) Image");
			System.out.println("2) Audio");
			System.out.println("3) Video");
			System.out.println("------------");
			String mediaType = sc.nextLine();
			
			System.out.print("\nTitolo: ");
			String title = sc.nextLine();
			
			Media newMedia = null;
			
			try {
				
				switch(mediaType) {
				
					case "1":
						newMedia = new Image(title);
					break;
					case "2":
						newMedia = new Audio(title);
					break;
					case "3":
						newMedia = new Video(title);
					break;					
				}
			} catch(Exception e) {
				
				System.out.println("Error: " + e.getMessage());
			}
			
			if (newMedia == null) 
				x--;
			else 
				medias[x] = newMedia;
		}
		
		System.out.println("-----------------------------------");
		
		String userValue = "-1";
		while (!userValue.equals("0")) {
			
			System.out.println("Media:");
			for (int x=0;x<MEDIA_COUNT;x++) 
				System.out.println(medias[x]
						+ "-----------------------------------\n");
			
			userValue = sc.nextLine();
		}
		
		System.out.println("-----------------------------------");
		System.out.println("The End");
	}
}
