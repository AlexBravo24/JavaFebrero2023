package com;

import java.util.Scanner;

//Array 1
//Crea un array de 10 posiciones de números con valores pedidos por teclado.
//Muestra por consola el índice y el valor al que corresponde


public class Array1_CHC {

	public static void main(String[] args) {
		int numero;
	int[] numeros= new int[10];
	
		
	Scanner entrada=new Scanner(System.in);
	
	for(int i=0; i<10; i++) {
		System.out.println("Ingresa los números: ");
		numero=entrada.nextInt();
		numeros[i]= numero;
		}
		entrada.close();
		
		for (int i=0; i< numeros.length; i++) {
		System.out.println(" El índice de " + i + " es  " + numeros [i]);
		}
	}
	
}
