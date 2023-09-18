package org.lessons.java.valutazioni;

public class Studente {

	public int id;
	public int assenze;
	public float mediaVoti;
	
	public Studente(int id, int assenze, float mediaVoti) {
		
		this.id = id;
		this.assenze = assenze;
		this.mediaVoti = mediaVoti;
	}
	
	public boolean isBocciato() {
		
		return assenze > 50
			|| (assenze > 25 && assenze <= 50 && mediaVoti <= 2)
			|| (assenze <= 25 && mediaVoti < 2);
	}
}
