package org.java.mediaplayer.media;

import org.java.mediaplayer.media.abs.Media;
import org.java.mediaplayer.media.inter.HasVolume;
import org.java.mediaplayer.media.inter.Playable;
import org.java.mediaplayer.media.parameters.Volume;

public class Audio extends Media implements HasVolume, Playable {
	
	private Volume volume;
	
	public Audio(String title) {
		super(title);
	}

	@Override
	public void play() {
		// TODO
		System.out.println("!! TODO !!");
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
