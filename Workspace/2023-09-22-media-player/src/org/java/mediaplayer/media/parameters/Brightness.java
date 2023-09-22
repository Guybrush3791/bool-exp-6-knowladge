package org.java.mediaplayer.media.parameters;

import java.math.BigDecimal;

public class Brightness {

	private static final int MIN_BRIGHTNESS = 0;
	private static final int MAX_BRIGHTNESS = 1;
	
	private BigDecimal brightness;
	
	public Brightness() throws Exception {
		
		this(.5f);
	}
	public Brightness(float brightness) throws Exception {
		
		setBrightness(brightness);
	}

	public double getBrightness() {
		return brightness;
	}
	public void setBrightness(float brightness) throws Exception {
		
		if (brightness < 0f || brightness > 1f) 
			throw new Exception("Brightness must be from 0.0 to 1.0 included");
		
		this.brightness = brightness;
	}

	public void darker() {
		
		brightness -= brightness > MIN_BRIGHTNESS ? .1f : 0;
	}
	public void brighter() {
		
		brightness += brightness < MAX_BRIGHTNESS ? .1f : 0;
	}
	
	@Override
	public String toString() {
		
		String res = "";
		for (double x=0f;x<brightness;x+=.1f)
			res += "*";
		
		return res + " (" + brightness + ")";
	}
}
