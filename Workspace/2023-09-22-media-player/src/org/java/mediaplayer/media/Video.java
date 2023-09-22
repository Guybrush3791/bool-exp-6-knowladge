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
	
	public Video(String title) throws Exception {
		super(title);
		
		volume = new Volume();
		brightness = new Brightness();
	}
	
	public Volume getVolume() {
		return volume;
	}
	public void setVolume(Volume volume) {
		this.volume = volume;
	}
	public Brightness getBrightness() {
		return brightness;
	}
	public void setBrightness(Brightness brightness) {
		this.brightness = brightness;
	}

	@Override
	public void play() {
		
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
		System.out.println(getBrightness());
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
	
	@Override
	public String toString() {
		
		return "Video:\n" + super.toString() + "\nvolume: " + volume + "\nbrightness: " + brightness;
	}
}
