package org.java;

import java.time.LocalDate;

public class Evento {

	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	public Evento(String titolo, LocalDate date, int postiTotali) throws Exception {
	
		setTitolo(titolo);
		setData(date);
		setPostiTotali(postiTotali);
		
		setPostiPrenotati(0);
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) throws Exception {
		
		if (data.isBefore(LocalDate.now()))
			throw new Exception("La data dell'evento non puo' essere nel passato");
		
		this.data = data;
	}
	public int getPostiTotali() {
		return postiTotali;
	}
	public void setPostiTotali(int postiTotali) throws Exception {
		
		if (postiTotali <= 0)
			throw new Exception("Il numero di posti totali devono essere strettamente positivi");
		
		this.postiTotali = postiTotali;
	}
	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	public void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}
	
}
