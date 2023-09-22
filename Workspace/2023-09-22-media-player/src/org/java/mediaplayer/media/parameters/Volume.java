package org.java.mediaplayer.media.parameters;

public class Volume {

	int volume;
	
	public Volume(int volume) throws Exception {
		
		setVolume(volume);
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) throws Exception {
		
		if (volume < 0 || volume > 10) 
			throw new Exception("Volume must be from 0 to 10 included");
			
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		
		return "" + getVolume();
	}
}
