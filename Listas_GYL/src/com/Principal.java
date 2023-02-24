package com;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		//Escribir una breve definicion de que es una lista
		/*Lista - Este tipo de colecci�n se refiere a listas en las que 
		*los elementos de la colecci�n tienen un orden, existe una secuencia 
		*de elementos. En ellas cada elemento estar� en una determinada posici�n 
		*(�ndice) de la lista.
		*El m�todo add nos permite a�adir un elemento al final de la List si no 
		*le indicamos una posici�n o bien nos permite a�adir un elemento en una posici�n 
		*determinada si le pasamos como par�metro la posici�n adem�s del elemento.
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

		// A�adimos elementos
		list.add("Luis");
		list.add("Marta");
		list.add("Julio");

		// Obtenemos un Iterador y recorremos la lista.
		Iterator<String> iter = list.iterator();
		while (iter.hasNext())
		    System.out.println(iter.next());

		}
		
	}
