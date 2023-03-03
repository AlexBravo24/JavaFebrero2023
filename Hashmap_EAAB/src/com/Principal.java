package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		// Hashmap
		
		//Los elementos se almacenan en pares clave/valor.
		//->Los elementos no mantienen ningún orden cuando se agregan. Los datos están desordenados.
		//->En caso de que hayan claves duplicadas, la última anulará a las otras.
		//->Los tipos de datos se especifican utilizando clases contenedoras en lugar de tipos de datos primitivos.

	//creacion: se declaran los tipos de datos de las claves y de los valores,los cuales
		//deben ser tipos de datos no primitivos
		
		HashMap<Integer, String> listaAutos = new HashMap<>();
		
		//Agregar elemento a un HashMap con put()
		
		listaAutos.put(1,"honda");
		listaAutos.put(2, "jeep");
		listaAutos.put(3, "toyota");
		
		System.out.println(listaAutos);
	
		//Acceder a los elementos con get()
		
		System.out.println(listaAutos.get(2));
		
		//Cambiar valor de elementos con replace()
		
		listaAutos.replace(2, "nissan");
		System.out.println(listaAutos);
		
		//Eliminar elemento de HashMap con remove() para uno o clear() para borrar todos
		
		listaAutos.remove(2);
		//listaAutos.clear();
		System.out.println(listaAutos);
		
		//validar si existe una clave o un valor dados
		
		System.out.println("existe la clave 2? "+listaAutos.containsKey(2));
		System.out.println("existe el valor 'honda'? "+listaAutos.containsValue("honda"));
		
		//obtener el numero de elementos del HashMap
		
		System.out.println("tamaño de HashMap: "+listaAutos.size());
		
		//validar si el HashMap esta vacio
		
		System.out.println("esta vacio el HashMap?: "+listaAutos.isEmpty());
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
