package org.java.mediaplayer.media.parameters;

public class Brightness {

	private double brightness;
	
	public Brightness(double brightness) throws Exception {
		
		setBrightness(brightness);
	}

	public double getBrightness() {
		return brightness;
	}
	public void setBrightness(double brightness) throws Exception {
		
		if (brightness < 0d || brightness > 1d) 
			throw new Exception("Brightness must be from 0.0 to 1.0 included");
		
		this.brightness = brightness;
	}
	
	@Override
	public String toString() {
		
		return "" + getBrightness();
	}
}
