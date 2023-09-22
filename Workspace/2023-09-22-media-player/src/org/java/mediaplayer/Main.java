package org.java.mediaplayer;

import java.util.Arrays;
import java.util.Scanner;

import org.java.mediaplayer.media.Audio;
import org.java.mediaplayer.media.Image;
import org.java.mediaplayer.media.Video;
import org.java.mediaplayer.media.abs.Media;
import org.java.mediaplayer.media.inter.HasBrightness;
import org.java.mediaplayer.media.inter.HasVolume;

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
		
		System.out.println("\n-----------------------------------\n");
		
		int userValue = -1;
		while (userValue != 0) {
			
			System.out.println("Media:\n-----------------------------------");
			for (int x=0;x<MEDIA_COUNT;x++) 
				System.out.println(
						"Value: " + (x + 1) + "\n"
						+ medias[x]
						+ "\n-----------------------------------\n");
			
			userValue = Integer.valueOf(sc.nextLine());
			
			if (userValue < 1 || userValue >= medias.length + 1) {
				
				userValue = -1;
				
				System.out.println("Valore non compreso");
				
				continue;
			}
			
			Media selectedMedia = medias[userValue - 1];
			selectedMedia.execute();
			
			if (selectedMedia instanceof HasVolume) {
				
				HasVolume volumeMedia = (HasVolume) selectedMedia;
				
				System.out.println("Vuoi regolare il volume? [Y/n]");
				String subUserValue = sc.nextLine();

				if (subUserValue.equalsIgnoreCase("y"))
					while(!subUserValue.equals("0")) {
	
						System.out.println("Azioni:");
						System.out.println("+ --> aumenta volume");
						System.out.println("- --> abbassa volume");
						System.out.println("0 --> esci dalla regolazione");

						subUserValue = sc.nextLine();

						switch (subUserValue) {
							
							case "+": volumeMedia.louder(); break;
							case "-": volumeMedia.weaker(); break;
						}
						
						volumeMedia.printVolume();
					}
			}
			
			if (selectedMedia instanceof HasBrightness) {
				
				HasBrightness brightnessMedia = (HasBrightness) selectedMedia;
				
				System.out.println("Vuoi regolare la luminosita'? [Y/n]");
				String subUserValue = sc.nextLine();
				
				if (subUserValue.equalsIgnoreCase("y"))
					while(!subUserValue.equals("0")) {
						
						System.out.println("Azioni:");
						System.out.println("+ --> aumenta luminosita'");
						System.out.println("- --> abbassa luminosita'");
						System.out.println("0 --> esci dalla regolazione");

						subUserValue = sc.nextLine();

						switch (subUserValue) {
							
							case "+": brightnessMedia.brighter(); break;
							case "-": brightnessMedia.darker(); break;
						}
						
						brightnessMedia.printBrightness();
					}
			}
			
			System.out.println("\n-----------------------------------\n");
		}
		
		System.out.println("-----------------------------------");
		System.out.println("The End");
	}
}
