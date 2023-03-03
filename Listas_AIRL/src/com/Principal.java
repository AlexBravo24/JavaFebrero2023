package com;

import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		/*Listas-Una lista en Java es una secuencia de elementos según un orden. 
		 * La interfaz List del paquete java.util es la que implementa esta secuencia 
		 * de objetos ordenados de una manera particular llamada List.
		 * Las listas pueden tener elementos duplicados, nulos, genericos, objetos mixtos.
		 * Hay cuatro tipos de listas en Java, es decir, Stack, LinkedList, ArrayList y Vector.*/
		
		
		
		//Crear un ArrayList
		List<String> lista = new ArrayList<>();
		
		//Agregar elemento a la lista 
		lista.add("Itzel");
		lista.add("Ana");
		lista.add("Daniel");
		lista.add("Jose Luis");
		lista.add("Lupita");
		lista.add("Felipe");
		
		//cantidad de elementos
		System.out.println(lista.size());
		
		//Obtener elemento
		System.out.println(lista.get(3));
		
		//Eliminar elementos
		lista.remove(4);//lista.remove("Lupita");
		
		//Recorrer una lista
		for(String i:lista) {
			System.out.println(i);
		}
		
		//Mostrar lista
		System.out.println(lista);
		
		
		
		

	}

}
