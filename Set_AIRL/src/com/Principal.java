package com;

import java.util.HashSet;
import java.util.Set;

public class Principal {
	
	public static void main(String[] args) {
		/*Es una colecci�n desordenada de objetos en la que no se pueden almacenar valores duplicados. 
		 * Dado que Set es una interfaz , no se pueden crear objetos de la composici�n tipogr�fica. 
		 * Siempre necesitamos una clase que ampl�e esta lista para crear un objeto. */

		
		Set<String> fruta = new HashSet<String>();
		
		fruta.add("Manzana");
		fruta.add("Pera");
		
		System.out.println(fruta);
		
	}
  
}
