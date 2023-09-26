package org.java.eventi;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
	
	private static final DecimalFormat PREZZO_FORMATTER = new DecimalFormat("##.00€");
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
	
	private LocalTime ora;
	private BigDecimal prezzo;

	public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotali);
		
		setOra(ora);
		setPrezzo(prezzo);
	}
	public Concerto(String titolo, String data, int postiTotali, LocalTime ora, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotali);
		
		setOra(ora);
		setPrezzo(prezzo);
	}
	
	public LocalTime getOra() {
		return ora;
	}
	public String getFormattedOra() {
		
		return getOra().format(TIME_FORMATTER);
	}
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public String getFormattedPrezzo() {
		
		return PREZZO_FORMATTER.format(getPrezzo());
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		
		return getFormattedData() + " - " + getFormattedOra()
			+ " - " + getTitolo() + " - " + getFormattedPrezzo();
	}
}
