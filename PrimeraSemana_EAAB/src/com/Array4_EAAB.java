package com;

public class Array4_EAAB {

	public static void main(String[] args) {
//		Dado un array de números de 5 posiciones con los siguientes 
//		valores: {1,2,3,4,5}. Guardar los valores de este array en otro 
//		array distinto pero con los valores invertidos, es decir, 
//		que el segundo array deberá tener los valores {5,4,3,2,1}.
		
		int[] arreglo = {1,2,3,4,5};
		int[] invertido = new int[5];
		
		for(int i=4;i>=0;i--) {
			invertido[4-i]= arreglo[i];
		}
		System.out.println("Arreglo original:");
		for(int i=0;i<5;i++) {
			System.out.print(arreglo[i]+" ");
		}
		
		
		System.out.println("\nArreglo invertido:");
		
		for(int i=0;i<5;i++) {
			System.out.print(invertido[i]+" ");
		}

	}

}
