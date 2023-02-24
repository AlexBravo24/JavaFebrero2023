package com;

import java.util.HashMap;
import java.util.Map;

public class Principal {
//HASHMAP
	/*Definici�n:
	 * Designa claves �nicas para los valores correspondientes
	 * que se pueden recuperar en cualquier punto dado.
	 * HashMap almacena solo referencias de objetos, por eso 
	 * es imposible utilizar tipos de datos primitivos
	 * como double o int.
	 * 
	 */
	
	
	//Existen dos formas de declarar un mapa hash:
	//HashMap <String, Object> map = new HashMap <String, Object> ();
	//HashMap x=new HashMap();
	
	//get (object key) devolver� el valor asociado con una
	//clave especificada en este hashmap de Java
	//put (Object Key, String Value)- Este m�todo
	//almacena el valor especificado y lo asocia con la clave 
	//especificada en este mapa
	
	public static void main (String [] args) {
		 Map<String, String> map = new HashMap<>();
		  map.put("apple", "green"); 
		  System.out.println(map); 	
		
		
	}
}
