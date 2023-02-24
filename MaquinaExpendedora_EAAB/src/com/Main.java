package com;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		String opc;
		int bandera, dinero;
		HashMap<String, Producto> producto = new HashMap<String, Producto>();
		
		
		producto.put("A1",new Producto("Coca 600ml",17,3));
		producto.put("A2",new Producto("Fanta 600ml",15,5));
		producto.put("A3",new Producto("Sprite 600ml",15,5));
		producto.put("B1",new Producto("Sabritas sal",16,8));
		producto.put("B2",new Producto("Doritos",15,7));
		producto.put("B2",new Producto("Ruffles queso",16,1));
		
		Maquina exp = new Maquina(producto);
		
		do {
			System.out.println("A1 - Coca cola 600ml: $17\n");
			System.out.println("A2 - Fanta 600ml: $15\n");
			System.out.println("A3 - Sprite 600ml: $15\n");
			System.out.println("B1 - Sabritas sal: $16\n");
			System.out.println("B2 - Doritos: $15\n");
			System.out.println("B3 - Rufles queso: $16\n");
			System.out.print("Ingrese efectivo : ");
			dinero = entrada.nextInt();
			System.out.print("Digite opcion: ");
			opc = entrada.next();
			opc.toLowerCase();
			System.out.println(opc);
			
			switch(opc.toUpperCase()) {
			
			case "A1":
			case "A2":
			case "A3":
			case "B1":
			case "B2":
			case "B3": bandera=1;
						System.out.println(exp.cobrar(opc.toUpperCase(), dinero));
						//bandera=0;
						break;
			
						
			default: bandera = 0;
					System.out.println("Opcion no valida");
			
			}
			
			
			

			
			
			
			
		}while(bandera==0);
		
		
		
//		Maquina exp = new Maquina(producto);
//		
//		//System.out.println(exp.SelecProducto("A1"));
//		
//		System.out.println(exp.cobrar("A1", 15));
//		//System.out.println("cantidad: "+producto.get("A1").getCantidad());
//		System.out.println(exp.cobrar("A2", 18));
//		//producto.replace("A1", setCantidad(0)); 
		

	}

}
