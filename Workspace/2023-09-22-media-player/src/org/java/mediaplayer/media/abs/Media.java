package org.java.mediaplayer.media.abs;

public abstract class Media {

	private String title;
	
	public Media(String title) {
		
		setTitle(title);
	}

	public abstract void execute();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		
		return getTitle();
	}
}
