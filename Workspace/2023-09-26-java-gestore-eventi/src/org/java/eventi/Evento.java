package org.java.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Evento {

	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	private Evento(String titolo, int postiTotali) throws Exception {
		
		setTitolo(titolo);
		setPostiTotali(postiTotali);
		
		setPostiPrenotati(0);
	}
	public Evento(String titolo, LocalDate data, int postiTotali) throws Exception {
	
		this(titolo, postiTotali);
		
		setData(data);
	}
	public Evento(String titolo, String data, int postiTotali) throws Exception {
		
		this(titolo, postiTotali);
		
		setData(data);
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
	protected String getFormattedData() {
		
		return getData().format(DATE_FORMATTER);
	}
	public void setData(LocalDate data) throws Exception {
		
		if (data.isBefore(LocalDate.now()))
			throw new Exception("La data dell'evento non puo' essere nel passato");
		
		this.data = data;
	}
	public void setData(String data) throws Exception {
		
		setData(LocalDate.parse(data, DATE_FORMATTER));
	}
	public int getPostiTotali() {
		return postiTotali;
	}
	private void setPostiTotali(int postiTotali) throws Exception {
		
		if (postiTotali <= 0)
			throw new Exception("Il numero di posti totali devono essere strettamente positivi");
		
		this.postiTotali = postiTotali;
	}
	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	private void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}
	
	public void prenota() throws Exception {
		
		if (postiPrenotati >= postiTotali)
			throw new Exception("Non ci sono posti disponibili");
		
		checkDataPassata();
		
		postiPrenotati++;
	}
	public void disdici() throws Exception {
		
		if (postiPrenotati == 0)
			throw new Exception("Nessun posto prenotato da disdire");
		
		checkDataPassata();
		
		postiPrenotati--;
	}
	
	@Override
	public String toString() {
		
		return getFormattedData() + " - " + getTitolo();
	}
	
	private void checkDataPassata() throws Exception {
		
		if (getData().isBefore(LocalDate.now()))
			throw new Exception("L'evento e' gia' passato");
	}
}
