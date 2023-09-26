package org.java.eventi;

import java.time.LocalDate;

public class Concerto extends Evento {

	public Concerto(String titolo, LocalDate data, int postiTotali) throws Exception {
		super(titolo, data, postiTotali);
	}
	public Concerto(String titolo, String data, int postiTotali) throws Exception {
		super(titolo, data, postiTotali);
	}
}
