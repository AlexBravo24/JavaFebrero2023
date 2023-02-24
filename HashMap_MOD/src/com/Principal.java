package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		/*HashMap -
		 * Definicion: 
		 * Un HashMap en Java es una tabla hash basado en una implementación de la interfaz Map de Java, 
		 * el cual será una colección de Key-value (clave-valor).
		 * Un HashMap permite nulos y no se encuentra ordenada.
		 * */
		
		//Declarar un hashMap
		HashMap<Integer, String> productos = new HashMap<Integer, String>();
		//Agregar elementos a un HashMap
		productos.put(1, "Laptop Gamer");
		productos.put(2, "Teclado RGB");
		productos.put(3, "");
		productos.put(4, "SSD 500GB");
		productos.put(5, "RAM DDR4 8GB");
		
		//Impresion de elementos de un HashMap
		//obtener un valor mediante la clave
		System.out.println(productos.get(4));
		
		//mediante una salida de texto (metodo toString implicito)
		System.out.println(productos);
		
		//mediante Arrays.asList()
		System.out.println(Arrays.asList(productos));
		
		//mediante el merodo estatico Collection.singletonList()
		System.out.println(Collections.singletonList(productos));
		
		//mediante un foreach y el apoyo de los metodos getKey, getValue y entrySet
		productos.entrySet().forEach(producto->{
			System.out.println(producto.getKey() + " = " + producto.getValue());
		});
		
		//Mostrar solo los valores sin la clave
		System.out.println(productos.values());
		
		//Devuelve el numero de elementos clave, valor
		System.out.println(productos.size());
		
		//elimina un elemento proporcionando la clave
		productos.remove(2);
		
		//Modifica o actualiza algun valor de productos con el metodo put
		productos.put(3, "USB 32GB");
		System.out.println(productos);
		System.out.println(productos.size());
		
	    
	}
}
