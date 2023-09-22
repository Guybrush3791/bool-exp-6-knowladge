package org.java.mediaplayer.media;

import org.java.mediaplayer.media.abs.Media;
import org.java.mediaplayer.media.inter.HasBrightness;
import org.java.mediaplayer.media.inter.HasVolume;
import org.java.mediaplayer.media.inter.Playable;
import org.java.mediaplayer.media.parameters.Brightness;
import org.java.mediaplayer.media.parameters.Volume;

public class Video extends Media implements HasVolume, HasBrightness, Playable {

	private Volume volume;
	private Brightness brightness;
	
	public Video(String title) {
		super(title);
	}
	
	@Override
	public void play() {
		// TODO
		System.out.println("!! TODO !!");
	}
	
	@Override
	public void darker() throws Exception {
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
	public void weaker() {
		
		volume.weaker();
	}
	@Override
	public void louder() {
		
		volume.louder();
	}
	@Override
	public void printVolume() {
		
		System.out.println(volume);
	}
	
	@Override
	public void execute() {
		play();
	}
}
