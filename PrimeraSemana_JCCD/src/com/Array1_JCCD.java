package com;

import java.util.Scanner;

public class Array1_JCCD {

	public static void main(String[] args) {
		// Ejercicio Arrays 1
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingresa un numero: ");
			numeros[i] = sc.nextInt();
		}
		for (int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}

}
