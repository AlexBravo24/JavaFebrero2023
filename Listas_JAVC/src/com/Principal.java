package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		/*Una lista simple o lista simplemente encadenada, 
		 * son estructuras de datos muy parecidas a los array, 
		 * donde el acceso al elemento o nodo , 
		 * es a través de un puntero , a diferencia de un array 
		 * donde este se accede a través de índices.
		 * 
		 */
		List<String> colores = new ArrayList<String>();
		
		colores.add("azul");
		colores.add("rojo");
		colores.add("verde");
		colores.add("naranja");
		
		System.out.println("Lista de colores:");
		//recorrer una lista
		for (String color : colores) {
			
			System.out.println(color);
			
		}
		//eliminar datos de una lista
		//mediante indice
		colores.remove(0);
		
		//mediante contenido
		colores.remove("verde");
		
		System.out.println("Lista con datos removidos:");
		
		for (String color : colores) {
			System.out.println(color);
		}
		
		
	}

}
