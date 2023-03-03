package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		HashMap<String,Productos>mproductos =new HashMap<String,Productos>();
		
		mproductos.put("caramelo",new Productos("001",1,20,1,1));
		mproductos.put("refresco",new Productos("002",1,25,1,1));
		mproductos.put("paleta",new Productos("003",1,35,1,1));


		//instanciar un cajero 
		Maquina cajero1 = new Maquina("edomex",mproductos);
		
		System.out.println(cajero1);

	}
}
