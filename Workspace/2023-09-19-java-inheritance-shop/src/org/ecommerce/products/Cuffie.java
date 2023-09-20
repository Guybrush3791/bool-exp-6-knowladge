package org.ecommerce.products;

public class Cuffie extends Prodotto {

	private String colore;
	private boolean wireless;
	
	public Cuffie(String codice, String nome, String marca, 
				  int prezzo, int iva,
				  String colore, boolean wireless
		) {
		super(codice, nome, marca, prezzo, iva);

		setColore(colore);
		setWireless(wireless);
	}

	@Override
	public float getFullPriceFedelta(boolean fedelta) {
		
		float fullPrice = getFullPrice(fedelta);
		
		if (fedelta)
			fullPrice *= isWireless() ? .98 : .93;
		
		return fullPrice;
	}
	
	public String getColore() {
		
		return colore;
	}
	public void setColore(String colore) {
		
		this.colore = colore;
	}
	public boolean isWireless() {
		
		return wireless;
	}
	public void setWireless(boolean wireless) {
		
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		
		return "CUFFIE:\n" + super.toString() 
				+ "\ncolore: " + getColore()
				+ "\nis wireless: " + (isWireless() ? "YES" : "NO");
	}
}
