package com;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		//Escribir una breve definicion de que es una lista
		/*Lista - Este tipo de colección se refiere a listas en las que 
		*los elementos de la colección tienen un orden, existe una secuencia 
		*de elementos. En ellas cada elemento estará en una determinada posición 
		*(índice) de la lista.
		*El método add nos permite añadir un elemento al final de la List si no 
		*le indicamos una posición o bien nos permite añadir un elemento en una posición 
		*determinada si le pasamos como parámetro la posición además del elemento.
		* */
		
		/*Metodos
		 * add()
		 * addAll()
		 * clear()
		 * contains()
		 * containsAll()
		 * copyOf()
		 * equals()
		 * get()
		 * hashCode()
		 * indexOf()
		 * isEmpty()
		 * iterator()
		 * lastIndexOf()
		 * listIterator()
		 * of()
		 * remove()
		 * removeAll()
		 * replaceAll()
		 * retainAll()
		 * set()
		 * size()
		 * sort()
		 * spliterator()
		 * subList()
		 * toArray()
		 */
		
		//Ejemplo
		
		// Definimos una ArrayList
		List<String> list = new ArrayList<String>();

		// Añadimos elementos
		list.add("Luis");
		list.add("Marta");
		list.add("Julio");

		// Obtenemos un Iterador y recorremos la lista.
		Iterator<String> iter = list.iterator();
		while (iter.hasNext())
		    System.out.println(iter.next());

		}
		
	}
