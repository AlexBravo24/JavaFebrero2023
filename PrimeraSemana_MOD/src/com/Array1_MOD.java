package com;

import java.util.Scanner;

public class Array1_MOD {

	public static void main(String[] args) {
		// Ejercicio 1 - Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		// Muestra por consola el índice y el valor al que corresponde.
		
		int numero=0;
		int[] numeros = new int[10]; 

		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese un número: ");
			numero = entrada.nextInt();
			numeros[i] = numero;
		}
		entrada.close();
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("\nindice [" + i + "] valor: " + numeros[i]);
		}
	}

}
