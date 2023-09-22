package org.java.mediaplayer.media;

import org.java.mediaplayer.media.abs.Media;
import org.java.mediaplayer.media.inter.HasBrightness;
import org.java.mediaplayer.media.parameters.Brightness;

public class Image extends Media implements HasBrightness {

	private Brightness brightness;
	
	public Image(String title) throws Exception {
		super(title);
		
		brightness = new Brightness();
	}

	public void show() {
		
		System.out.println(this);
	}
	
	@Override
	public void darker() throws Exception {
		brightness.darker();		
	}
	@Override
	public void brighter() throws Exception {
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
		
		return "Image:\n" + super.toString() + "\nbrightness: " + brightness;
	}
}
