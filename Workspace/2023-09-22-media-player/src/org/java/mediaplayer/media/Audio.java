package org.java.mediaplayer.media;

import org.java.mediaplayer.media.abs.Media;
import org.java.mediaplayer.media.inter.HasVolume;
import org.java.mediaplayer.media.inter.Playable;
import org.java.mediaplayer.media.parameters.Volume;

public class Audio extends Media implements HasVolume, Playable {
	
	private Volume volume;
	
	public Audio(String title) throws Exception {
		super(title);
		
		volume = new Volume();
	}

	@Override
	public void play() {
		
		System.out.println(this);
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
		
		return "Audio:\n" + super.toString() + "\nvolume: " + volume;
	}
}
