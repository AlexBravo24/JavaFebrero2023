package com;

import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		HashMap<String, Integer> monedas = new HashMap<String, Integer>();
		monedas.put("cincuentaCents",500);
		monedas.put("unPeso",50);
		monedas.put("dosPesos",50);
		monedas.put("cincoPesos",50);
		monedas.put("diezPesos", 0);
		
		HashMap<String, Producto> productos = new HashMap<String, Producto>();
		productos.put("A1", new Producto("Chips fuego", "Barcel", 15,10));
		productos.put("A2", new Producto("Suavicremas fresa", "Gamesa", 17,10));
		productos.put("A3", new Producto("Donitas azucaradas", "Bimbo", 18,10));
		productos.put("B1", new Producto("Sabritas original", "Sabritas", 15,10));
		productos.put("B2", new Producto("Doritos Incognito", "Sabritas", 15,10));
		productos.put("B3", new Producto("Cheetos queso", "Sabritas", 13,10));
		productos.put("C1", new Producto("Bubulubu", "Barcel", 10,10));
		productos.put("C2", new Producto("Cacahuates japoneses", "Barcel", 15,10));
		productos.put("C3", new Producto("Panditas", "Ricolino", 12,10));
		
		MaquinaBotanas maquina = new MaquinaBotanas(monedas,productos);
		maquina.ingresarMonedas(0, 0, 1, 1, 2);
		System.out.println(monedas + "\n");
		maquina.comprar("C3");
		System.out.println("\n" + maquina.buscarProducto("C3"));
		System.out.println(monedas);
		
	}
}
