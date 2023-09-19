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
	}
	
	public String getCodice() {
		
		return codice;
	}
	private void setCodice(String codice) {
		
		this.codice = codice;
	}
	public String getName() {
		
		return nome;
	}
	public void setName(String name) {
		
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
	public void setPrezzo(int prezzo) {
		
		this.prezzo = prezzo;
	}
	public int getIva() {
		
		return iva;
	}
	public void setIva(int iva) {
		
		this.iva = iva;
	}
}
