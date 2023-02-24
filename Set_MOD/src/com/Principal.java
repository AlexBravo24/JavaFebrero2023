package com;

import java.util.HashSet;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {
		/*Set en java
		 * Definicion:
		 * Conjunto puede definirse como una colección de elementos desordenados; 
		 * donde los valores duplicados no se pueden almacenar. Extiende Collection y,
		 *  por lo tanto, todos los métodos en la interfaz Collection están disponibles en la interfaz Set. 
		 *  Se implementa mediante HashSet, LinkedHashSet o TreeSort.
		 * */
		
		//Declaracion de un Set
		
		Set<String> alumnos = new HashSet<String>();
		
		// Agregar elementos en un Set
		alumnos.add("Martin");
		alumnos.add("Jorge");
		alumnos.add("Miguel");
		alumnos.add("Brenda");
		alumnos.add("Luis");
		alumnos.add("Valentina");
		
		//imprimir por consola un set
		System.out.println(alumnos);
		
		//recorrer un set e impresion de cada elemento
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
		
		//Eliminar un elemento de un set
		alumnos.remove("Martin");
		//Set despues de eliminar el elemento que coincida con "Martin"
		System.out.println("\nSet despues de eliminar a 'Martin' \n"+ alumnos);
		
		//Tamaño del set
		System.out.println("\nTamaño del Set alumnos: " + alumnos.size() );

	}	
}
