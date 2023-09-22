package org.java.mediaplayer.media.parameters;

public class Brightness {

	private static final double MIN_BRIGHTNESS = 0d;
	private static final double MAX_BRIGHTNESS = 1d;
	
	private double brightness;
	
	public Brightness() throws Exception {
		
		this(.5);
	}
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

	public void darker() {
		
		brightness -= brightness > MIN_BRIGHTNESS ? .1 : 0;
	}
	public void brighter() {
		
		brightness += brightness < MAX_BRIGHTNESS ? .1 : 0;
	}
	
	@Override
	public String toString() {
		
		return "Brightness: " + getBrightness();
	}
}
