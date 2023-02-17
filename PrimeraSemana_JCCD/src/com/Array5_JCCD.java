package com;

public class Array5_JCCD {

	public static void main(String[] args) {
		// Ejercicio Array 5
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		// respectivos precios. Muestra en consola la lista de productos y sus precios. 
		// Por lo menos 5 productos o artículos
		
		String [] productos = {"Refresco","Galleta","Cafe","Sabrita","Leche"};
		double [] precios = {25,15.8,8.7,14,26.6};
		
		for (int i=0,j=0; i<5; i++, j++) {
			System.out.println("El producto " + productos[i] + " cuesta " + precios[j]);
		}

	}

}
