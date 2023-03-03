package com;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		// Set
		
		//Es un tipo de interfaz de coleccion que no puede contener elementos duplicados.
		//su implementacion se hace en las clases: HashSet, LinkedHashSet y TreeSet.
		
		//HashSet
		// no garantiza que los elementos insertados se almacenen en el mismo orden
		// se permiten elementos NULL
		// si intentamos agregar un elemento igual a uno existente no lo agregará
		
		//LinkedHashSet
		//version ordenada de HashSet: ordena los elementos a como fueron insertados
		
		
		//TreeSet
		//se incluye clasificacion: almacena y ordena los elementos 
		//(orden alfabetico o numerico)

		
		//creacion de un Set: HashSet
		
		Set<String> autos = new HashSet<String>();
		Set<String> autos2 = new LinkedHashSet<String>();
		Set<String> autos3 = new TreeSet<String>();
		
		//Agregar elementos con .add(valor)
		
		//hashSet
		autos.add("honda");
		autos.add("nissan");
		autos.add("kia");
		autos.add("ford");
		
		//LinkedHashSet
		autos2.add("honda");
		autos2.add("nissan");
		autos2.add("kia");
		autos2.add("ford");
		
		//TreeSet
		autos3.add("honda");
		autos3.add("nissan");
		autos3.add("kia");
		autos3.add("ford");
		
		System.out.println("HashSet: "+autos);
		
		System.out.println("\nLinkedHashSet: "+autos2);
		
		System.out.println("\nTreeSet: "+autos3);
		
		// size() para obtener el numero de elementos
		System.out.println("num de elementos hashset: "+autos.size());
		
		//agregar elementos duplicados
		
		autos.add("kia");
		
		//agregar valor NULL
		
		autos.add(null);
		autos.add(null);
		
		//mostramos el contenido
		System.out.println(autos);
		// se observa que el duplicado no lo agrega y de los 2 null solo agrega el primero
		
		
		// remove(elemento) para borrar un elemento y clear() para borrar todos
		
		autos.remove("kia");
		autos.remove(null);
		//autos.clear();
		System.out.println(autos);
		
		
		
		
	}

}
