package org.java.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.java.eventi.helper.DateTimeHelper;

public class Spettacolo extends Evento {
	
	private BigDecimal prezzo;

	public Spettacolo(String titolo, LocalDate data, int postiTotali, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotali);
		
		setPrezzo(prezzo);
	}
	public Spettacolo(String titolo, String data, int postiTotali, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotali);
		
		setPrezzo(prezzo);
	}
	
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public String getPrezzoFormattato() {
		
		return DateTimeHelper.PREZZO_FORMATTER.format(getPrezzo());
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " - " + getPrezzoFormattato();
				 
	}
}
