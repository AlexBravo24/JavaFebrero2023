package com;

public class Array2_MOD {

	public static void main(String[] args) {
		// Ejercicio 2 - Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100. 
		// Obt�n la suma de todos ellos y la media.
		
		int[] numeros = new int[100];
		int suma = 0; 
		float media;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i+1;
			suma = suma+numeros[i];
		}
		
		media = (float) suma/numeros.length;
		
		System.out.println("la suma de los numeros del 1-100 es: " + suma);
		System.out.println("la media de la sumatoria del 1-100 es: " + media);

	}

}
