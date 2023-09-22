package org.java.mediaplayer;

import java.util.Scanner;

import org.java.mediaplayer.media.Image;
import org.java.mediaplayer.media.abs.Media;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Media[] medias = new Media[5];
		
		for (int x=0;x<medias.length;x++) {
			
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
		}
		
		
		
		System.out.println("-----------------------------------");
		System.out.println("The End");
	}
}
