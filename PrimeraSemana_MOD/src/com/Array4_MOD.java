package com;

public class Array4_MOD {

	public static void main(String[] args) {
		// Ejercicio 4 - Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
		int[] numeros = {1,2,3,4,5};
		int[] numerosInvertidos = new int[numeros.length];
		int indice=0;
		
		for (int i = numeros.length - 1; i >= 0 ; i--) {
			numerosInvertidos[indice] = numeros[i];
			indice++;
		}
		
		for (int i : numerosInvertidos) {
			System.out.print(" " + i);
		}
	}

}
