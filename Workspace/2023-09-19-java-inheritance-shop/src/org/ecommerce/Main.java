package org.ecommerce;

import org.ecommerce.products.Prodotto;

public class Main {

	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("12345", "Super-monitor", "Dell", 399, 22);
		
		System.out.println(p1);
	}
}
