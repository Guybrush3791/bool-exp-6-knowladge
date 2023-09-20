package org.java.library;

public class Libro {

	private String titolo;
	private int nPagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int nPagine, String autore, String editore) throws Exception {
		
		setTitolo(titolo);
		setnPagine(nPagine);
		setAutore(autore);
		setEditore(editore);
	}

	public String getTitolo() {
		
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		
		if (titolo.isBlank()) 
			throw new Exception("Title can't be blank");
		
		this.titolo = titolo;
	}

	public int getnPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) throws Exception {
		
		if (nPagine <= 0) 
			throw new Exception("Page number can't be 0 or lezz");
		
		this.nPagine = nPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		
		if (autore.isBlank()) 
			throw new Exception("Autore can't be blank");
		
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws Exception {
		
		if (editore.isBlank()) 
			throw new Exception("Editore can't be blank");
		
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
