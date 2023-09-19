package org.ecommerce.products;

public class Prodotto {

	private String codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	public Prodotto(String codice, String nome, String marca,
				    int prezzo, int iva) {
		
		setCodice(codice);
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public String getCodice() {
		
		return codice;
	}
	private void setCodice(String codice) {
		
		this.codice = codice;
	}
	public String getNome() {
		
		return nome;
	}
	public void setNome(String name) {
		
		this.nome = name;
	}
	public String getMarca() {
		
		return marca;
	}
	public void setMarca(String marca) {
		
		this.marca = marca;
	}
	
	public int getPrezzo() {
		
		return prezzo;
	}
	public String getFullPrice() {
		
		return String.format("%.02f euro", 
				getPrezzo() / 100f * (100 + getIva()));
	}
	public void setPrezzo(int prezzo) {
		
		this.prezzo = prezzo;
	}
	public int getIva() {
		
		return iva;
	}
	public void setIva(int iva) {
		
		this.iva = iva;
	}

	@Override
	public String toString() {
		
		return "[" + getCodice() + "] " + getMarca() + ": " + getNome()
			+ "\nprezzo: " + getFullPrice() + " (" + getPrezzo() + ")"
			+ "\niva: " + getIva() + "%";
	}
}
