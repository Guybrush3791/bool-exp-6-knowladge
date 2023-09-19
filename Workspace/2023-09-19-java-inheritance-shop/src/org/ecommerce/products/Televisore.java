package org.ecommerce.products;

public class Televisore extends Prodotto {

	private int dimensione;
	private boolean smart;
	
	public Televisore(String codice, String nome, String marca, 
					  int prezzo, int iva,
					  int dimensione, boolean smart
		) {
		super(codice, nome, marca, prezzo, iva);

	}
	
	public int getDimensione() {
		
		return dimensione;
	}
	public void setDimensione(int dimensione) {
		
		this.dimensione = dimensione;
	}
	public boolean isSmart() {
		
		return smart;
	}
	public void setSmart(boolean smart) {
		
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		
		return "TELEVISORE:\n" + super.toString() 
		+ "\ndimensione: " + getDimensione()
		+ "\nis smart: " + (isSmart() ? "YES" : "NO");
	}
}
