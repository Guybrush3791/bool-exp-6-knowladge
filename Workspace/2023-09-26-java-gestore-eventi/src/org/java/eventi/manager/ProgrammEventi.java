package org.java.eventi.manager;

import java.util.ArrayList;
import java.util.List;

import org.java.eventi.Evento;

public class ProgrammEventi {

	private String titolo;
	private List<Evento> eventi;
	public ProgrammEventi(String title) {
		
		setTitolo(title);
		setEventi(new ArrayList<>());
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public List<Evento> getEventi() {
		return eventi;
	}
	private void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
}
