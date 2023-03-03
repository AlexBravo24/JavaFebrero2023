package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		HashMap<String, Productos> producto= new HashMap<String, Productos>();
		producto.put("Gansito",new Productos("Pastelito",20.5,4));
		producto.put("Negrito",new Productos("Pastelito",23,6));
		producto.put("Dalmata",new Productos("Pastelito",20,4));
		producto.put("Mamut",new Productos("Pastelito",20.5,4));
		
		Caja caja= new Caja(producto, 0);
        System.out.println(caja.compra("Gansito", 22.00));

	}
}
