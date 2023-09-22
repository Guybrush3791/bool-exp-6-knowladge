package org.java.mediaplayer.media;

import org.java.mediaplayer.media.abs.Media;
import org.java.mediaplayer.media.inter.HasBrightness;

public class Image extends Media implements HasBrightness {

	public Image(String title) {
		super(title);
	}

	@Override
	public void darker() {
		brightness.darker();		
	}
	@Override
	public void brighter() {
		brightness.brighter();
	}
	@Override
	public void printBrightness() {
		System.out.println(brightness);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
