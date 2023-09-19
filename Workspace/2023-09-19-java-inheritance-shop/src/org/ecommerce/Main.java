package org.ecommerce;

import org.ecommerce.products.Prodotto;
import org.ecommerce.products.Smartphone;
import org.ecommerce.products.Televisore;

public class Main {

	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("12345", "Super-monitor", "Dell", 399, 22);
		
		Smartphone s1 = new Smartphone("34567", "Galaxy Note 20", "Samsung", 
									   400, 22, "23847293472938", 32);
		Televisore t1 = new Televisore("67890", "Super-televisore", "Lg", 
									   600, 22, 32, false);
		
		System.out.println(p1);
		System.out.println("\n-----------------------------\n");
		System.out.println(s1);
		System.out.println("\n-----------------------------\n");
		System.out.println(t1);
	}
}
