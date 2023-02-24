package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Principal {

	public static void main(String[] args) {
		
		/*Investigar que son las listas, set, HashMap y Vectores
		 * para cada uno crear un nuevo proyecto nombre_iniciales
		 * 
		 * 
		 * LISTA 
		 * Una lista es una secuencia de elementos dispuesto en un cierto orden, 
		 * en la que cada elemento tiene como mucho un predecesor y un sucesor. 
		 * El número de elementos de la lista no suele estar fijado, 
		 * ni suele estar limitado por anticipado. 
		 * 
		 * Puede ser:
		 * ArrayList
		 * Vector
		 * LinkedList
		 * 
		 */ 
		
		
	//Como se declaran las listas: ArrayList
		
		List<String> listaAutos = new ArrayList<>();
		 
		
		 
	//como se agregan elementos individuales
		//se utiliza el metodo .add
		
		listaAutos.add("honda");
		
		//o a partir de un array con el metodo Arrays.asList();
		
		String[] autos = {"chevrolet","nissan","ford","jeep","toyota"}; 
		List<String> listaAutos2 = Arrays.asList(autos);
		 
	//que metodos emplea? (Agregar, borrar, etc)
		
		//combinar elementos de 2 listas
		
		listaAutos.addAll(listaAutos2);
		
		//recorrer la lista con ciclo for each
		
		for(String str : listaAutos) {
			System.out.println(str);
			
		}
		System.out.println();
		//recorrer la lista con ListIterator
		
		//se crea el iterador - es un objeto que se apropia de los elementos de una coleccion
		// y tiene funcionalidades que permiten recorrer dicha lista. la ventaja es que
		//los iteradoes permiten realizar acciones cuendo estemos recorriendo la lista
		
		ListIterator<String> iterador = listaAutos.listIterator();
		
		//con un while lo recorremos
		
		while(iterador.hasNext()) { // se verifica si la lista tiene elemento siguiente
			
			System.out.println(iterador.next()); //se extrae el elemento siguiente de la lista
		}
		System.out.println();
		//Eliminar elementos de una lista con metodo .remove() o .clear()
		// puede ser:
		//		mediante el indice (posicion) del elemento
		//		mediante su nombre
		//		todos los elementos con metodo .clear
		
		
		listaAutos.remove(1);
		listaAutos.remove("jeep");
		//listaAutos.clear();
		
		for(String str : listaAutos) {
			System.out.println(str);
		}
		System.out.println();
		 
		//isEmpty evalua si la lista esta vacia y devuelve true o false
		System.out.println("esta vacia? "+listaAutos.isEmpty());
		
		//.size devuelve el numero de elementos de la lista
		System.out.println("elementos: "+listaAutos.size());
		
		// .indexOf devuelve el indice o posicion en la que se encuentra un elemento dado
		System.out.println("ford esta en la posicion: "+listaAutos.indexOf("ford"));
		
		
		
		 

	}

}
