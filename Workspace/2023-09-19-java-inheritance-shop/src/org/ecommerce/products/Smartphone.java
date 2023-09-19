package org.ecommerce.products;

public class Smartphone extends Prodotto {

	private String imei;
	private int memory;
	
	public Smartphone(String codice, String nome, String marca, 
					  int prezzo, int iva,
					  String imei, int memory
		) {
		super(codice, nome, marca, prezzo, iva);

		setImei(imei);
		setMemory(memory);
	}
	
	public String getImei() {
		
		return imei;
	}
	public void setImei(String imei) {
		
		this.imei = imei;
	}
	public int getMemory() {
		
		return memory;
	}
	public void setMemory(int memory) {
		
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		
		return "SMARTPHONE:\n" + super.toString() 
			+ "\nIMEI: " + getImei()
			+ "\nmemory: " + getMemory() + "GB";
	}
}
