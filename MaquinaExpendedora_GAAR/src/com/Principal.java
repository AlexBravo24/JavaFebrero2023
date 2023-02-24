package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
		
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	
		double pago=0;
		String nombre;
	 
	 

     HashMap<String, Producto> producto = new HashMap<String,Producto>();
      
	   producto.put("DONAS", new Producto("1524",21,50));
	   producto.put("SABRITAS", new Producto("1523",17,50));
	   producto.put("RUFLES", new Producto("1522",15,50));
	   producto.put("CHIPS", new Producto("1521",17.5,50));
	   producto.put("NITO", new Producto("1520",12,50));
	   producto.put("MANTECADAS", new Producto("1519",22,50));
	   producto.put("REBANADAS", new Producto("1518",10,50));
	   producto.put("AMARANTO", new Producto("1517",7,50));
		
		//instanciar un cajero 
		Maquina maquina1 = new Maquina("La buena",producto);
	
	//Consultar informacion de las cuentas 
		//System.out.println(cajero1.BuscarCuenta("Aroon"));
	
		 int opc=0;
		do {
			System.out.println("MENU");
			System.out.println("1._Ver Productos");
			System.out.println("2._Comprar Productos");
			System.out.println("3._Salir");
			System.out.println("SELECCIONA UN NUMERO DE OPCION :");
			opc=sc.nextInt();
			
			
			switch(opc)
			{
			case 1: 
				System.out.println("1.DONAS  $21");
				System.out.println("2.SABRITAS  $17");
				System.out.println("3.RUFLES $15");
				System.out.println("4.CHIPS  $17");
				System.out.println("5.NITO  $12.5");
				System.out.println("6.MANTECADS  $22");
				System.out.println("7.REBANADAS  $10");
				System.out.println("8.AMARANTO  $7");
				
				break;
				
			case 2: 
				
				System.out.println("1.DONAS  $21");
				System.out.println("2.SABRITAS  $17");
				System.out.println("3.RUFLES $15");
				System.out.println("4.CHIPS  $17");
				System.out.println("5.NITO  $12.5");
				System.out.println("6.MANTECADS  $22");
				System.out.println("7.REBANADAS  $10");
				System.out.println("8.AMARANTO  $7");
				
				
				System.out.println("Ingresa Efectivo");
				pago = sc.nextDouble();
				System.out.println("INGRESA NOMBRE DE UN PRODUCTO");
				nombre = sc.next();
				System.out.println(maquina1.DescontarProducto(nombre.toUpperCase(), pago));
				break;
			
			default: break;
			
			
			}
			
			
		}while(opc!=3);
		
		
	
		
		//EJERCICIO SIMULAR UNA MAQUINA EXPENDEDORA DE REFRESCOS
		//Buscamos producto
		//Retiro del producto, despachar
		//ingresar dinero
		
	}
	
		
}
