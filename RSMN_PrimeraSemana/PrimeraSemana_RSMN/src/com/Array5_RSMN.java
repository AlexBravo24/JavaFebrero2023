package com;

import java.util.ArrayList;

public class Array5_RSMN {
	public static void main(String[] args) {
		
		ArrayList<String> prod = new ArrayList<String>(); 
		prod.add("papas");
		prod.add("coca");
		prod.add("pepsi");
		prod.add("boing");
		prod.add("leche");
		
		ArrayList<Float> precios = new ArrayList<Float>(); 
		precios.add((float) 17);
		precios.add((float) 18.00);
		precios.add((float) 17.50);
		precios.add((float) 16);
		precios.add((float) 22);
		
		for (int i = 0; i < prod.size(); i++) {
			System.out.println("producto:" + prod.get(i) + " precio:" + precios.get(i));
		}
		
	}
}
