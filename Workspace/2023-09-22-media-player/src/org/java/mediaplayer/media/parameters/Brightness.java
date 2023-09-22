package org.java.mediaplayer.media.parameters;

public class Brightness {

	private static final double MIN_BRIGHTNESS = 0d;
	private static final double MAX_BRIGHTNESS = 1d;
	private static final double DEFAULT_BRIGHTNESS = .5d;
	
	private double brightness;
	
	public Brightness() throws Exception {
		
		this(DEFAULT_BRIGHTNESS);
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
		
		int supportValue = (int) (brightness * 10) - (int) (brightness > MIN_BRIGHTNESS ? 1 : 0);
		brightness = supportValue / 10d;
	}
	public void brighter() {
		
		int supportValue = (int) (brightness * 10) + (int) (brightness < MAX_BRIGHTNESS ? 1 : 0);
		brightness = supportValue / 10d;
	}
	public void printBrightness() {
		System.out.println(getBrightness());
	}
	
	@Override
	public String toString() {
		
		String res = "";
		for (double x=0d;x<brightness;x=((int) (x * 10) + 1) / 10d)
			res += "*";
		
		return res + " (" + brightness + "/1.0)";
	}
}
