package org.java.mediaplayer.media.abs;

public abstract class Media {

	private String title;
	
	public Media(String title) throws Exception {
		
		setTitle(title);
	}

	public abstract void execute();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {
		
		if (title.isBlank()) 
			throw new Exception("Title can't be blank");
		
		this.title = title;
	}
	
	@Override
	public String toString() {
		
		return "title: " + getTitle();
	}
}
