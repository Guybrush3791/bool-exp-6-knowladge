package org.java.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import org.java.eventi.helper.DateTimeHelper;
import org.java.eventi.inter.Prezzabile;

public class Concerto extends Evento implements Prezzabile {



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
	public Concerto(String titolo, String data, int postiTotali, String ora, BigDecimal prezzo) throws Exception {
		super(titolo, data, postiTotali);

		setOra(ora);
		setPrezzo(prezzo);
	}

	public LocalTime getOra() {
		return ora;
	}
	public String getFormattedOra() {

		return getOra().format(DateTimeHelper.TIME_FORMATTER);
	}
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	public void setOra(String ora) {

		setOra(LocalTime.parse(ora));
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

		return getFormattedData() + " - " + getFormattedOra()
			+ " - " + getTitolo() + " - " + getFormattedPrezzo();
	}
}
