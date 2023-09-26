package org.java.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.java.eventi.helper.DateTimeHelper;
import org.java.eventi.inter.Prezzabile;

public class Spettacolo extends Evento implements Prezzabile {
	
	private BigDecimal prezzo;

	public Spettacolo(String titolo, LocalDate data, int postiTotali, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotali);
		
		setPrezzo(prezzo);
	}
	public Spettacolo(String titolo, String data, int postiTotali, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotali);
		
		setPrezzo(prezzo);
	}
	
	@Override
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	@Override
	public String getFormattedPrezzo() {
		
		return DateTimeHelper.PREZZO_FORMATTER.format(getPrezzo());
	}
	@Override
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " - " + getFormattedPrezzo();
				 
	}
}
