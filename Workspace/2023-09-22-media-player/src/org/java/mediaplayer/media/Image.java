package org.java.mediaplayer.media;

import org.java.mediaplayer.media.abs.Media;
import org.java.mediaplayer.media.inter.HasBrightness;
import org.java.mediaplayer.media.parameters.Brightness;

public class Image extends Media implements HasBrightness {

	private Brightness brightness;
	
	public Image(String title) {
		super(title);
	}

	public void show() {
		
		System.out.println(this);
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
		show();
	}

	@Override
	public String toString() {
		
		return getTitle() + " " + brightness;
	}
}
