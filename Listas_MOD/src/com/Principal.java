package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		/* Listas -
		 * Las listas son un tipo de colección que hereda de la interface collection, 
		 * son una estructura de datos que respeta el orden en el cual fueron agregados los elementos, 
		 * también permiten registros repetidos.
		 * */
		
		//Declarar una lista
		List<String> colores = new ArrayList<String>();
		
		//Agregar datos a una lista
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Amarillo");
		colores.add("Negro");
		
		//Recorrer una lista
		System.out.println("Lista de colores: ");
		for (String color : colores) {
			System.out.println(color);
		}
		//Eliminar datos de una lista
		//mediante indice
		colores.remove(0);
		
		//mediante contenido
		colores.remove("Verde");
		
		System.out.println("\nLista de colores despues de eliminar algunos elementos: ");
		for (String color : colores) {
			System.out.println(color);
		}
	}
}
