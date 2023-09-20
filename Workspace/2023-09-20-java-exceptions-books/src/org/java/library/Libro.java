package org.java.library;

public class Libro {

	private String titolo;
	private int nPagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int nPagine, String autore, String editore) {
		
		setTitolo(titolo);
		setnPagine(nPagine);
		setAutore(autore);
		setEditore(editore);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getnPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) {
		this.nPagine = nPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	@Override
	public String toString() {
		
		return "[" + getEditore() + "] " 
				+ getAutore() + ": " 
				+ getTitolo() 
				+ " (n pagine: " + getnPagine() + ")"
		;
	}
}
