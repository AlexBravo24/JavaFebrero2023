package com;

import java.util.Scanner;

public class Array1_EAAB {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos 
		//por teclado. Muestra por consola el índice y el valor al que corresponde.
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[]= new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.print("Ingrese el "+(i+1)+"° valor:  ");
			arreglo[i]= entrada.nextInt();
			
		}
		entrada.close();
		for(int i=0;i<10;i++) {
			
			System.out.println("Valor "+(i+1)+": "+arreglo[i]);
		}
		

	}

}
