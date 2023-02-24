package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		//Creamos una pequeña BD, llenar el HashMap
		HashMap<Integer, Producto> productos = new HashMap<Integer, Producto>();
		
		productos.put(123, new Producto("Canelitas", 17, 0, 1));
		productos.put(124, new Producto("Polvorones", 18, 0, 0));
									
	    Maquina maquina1 = new Maquina("Atlacomulco", productos);
				
		System.out.println(maquina1.comprar(123, 30));
		System.out.println(maquina1.comprar(123, 20));
		System.out.println(maquina1.comprar(124, 20));
	}

}
