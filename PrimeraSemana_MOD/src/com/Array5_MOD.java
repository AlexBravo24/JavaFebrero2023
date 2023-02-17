package com;

public class Array5_MOD {

	public static void main(String[] args) {
		// Ejercicio 5 - Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		// Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		String [] productos = {"Laptop","Teclado","Mouse","USB 32GB","Audifonos","Impresora"};
		double[] precios = {12000,200,150,180,350,4000};
		
		System.out.println(String.format("%-10s", "Producto")+ "| Precio");
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println(String.format("%-10s", productos[i])+ ": $"  + precios[i]);
		}
	}

}
