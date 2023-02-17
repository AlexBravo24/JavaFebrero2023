package com;

import java.util.Scanner;

public class Array5_EAAB {

	public static void main(String[] args) {
//		Crea dos arrays, uno para mostrar n productos y 
//		otro para mostrar sus respectivos precios. Muestra en 
//		consola la lista de productos y sus precios. Por lo menos 
//		5 productos o artículos.
		
		Scanner entrada = new Scanner(System.in);
		
		//String[] productos;
		//double[] precios;
		int cantidad;
		
		System.out.print("Ingrese cantidad de productos a capturar: ");
		cantidad= entrada.nextInt();
		
		String producto[]= new String[cantidad];
		double precios[]= new double[cantidad];
			
		for(int i=0;i<cantidad;i++) {
			
			System.out.print("Ingrese producto: ");
			producto[i]= entrada.next();
			System.out.print("Ingrese precio: ");
			precios[i]= entrada.nextDouble();
			entrada.close();
			
		}
		
		for(int i=0;i<cantidad;i++) {
			System.out.println(producto[i]+":  $"+precios[i]);
		}
		
		
		

	}

}
