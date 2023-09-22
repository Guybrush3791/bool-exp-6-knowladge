package org.java.mediaplayer.media.parameters;

public class Volume {

	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 10;
	
	int volume;
	
	public Volume() throws Exception {
		
		this(5);
	}
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
	
	public void weaker() {
		
		volume -= volume > MIN_VOLUME ? 1 : 0;
	}
	public void louder() {
		
		volume += volume < MAX_VOLUME ? 1 : 0;
	}
	
	@Override
	public String toString() {
		
		String res = "";
		for (int x=0;x<volume;x++)
			res += "*";
		
		return res + " (" + volume + "/10)";
	}
}
