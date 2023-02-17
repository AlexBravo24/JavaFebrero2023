package com;

public class Array2_JCCD {

	public static void main(String[] args) {
		// Ejercicio Arrays 2
		// Crea un array de números de 100 posiciones, que contendrá los números del 
		// 1 al 100. Obtén la suma de todos ellos y la media.
		
		int [] numeros = new int[100];
		int suma = 0;
		
		for (int i = 0; i<numeros.length; i++) {
			numeros[i] = i;
		}
		
		for (int i=0; i<numeros.length; i++) {
			//System.out.println(numeros[i]);
			suma = suma + numeros[i];
		}
		double media = suma/numeros.length;
		System.out.println("La suma de todos los numeros del array es: " + suma);
		System.out.println("La media es: " + media);

	}

}
