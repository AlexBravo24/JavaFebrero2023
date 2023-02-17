package com;

public class Array4_JCCD {

	public static void main(String[] args) {
		// Ejercicio Arrays 4
		// Dado un array de números de 5 posiciones con los siguientes valores:
		// {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		// los valores invertidos, es decir, que el segundo array deberá tener los valores 
		// {5,4,3,2,1}.
		
		int [] numeros = {1,2,3,4,5};
		
		int [] invertido = new int [numeros.length];
		
		for(int i=(numeros.length-1),j=0;i>=0;i--,j++){
	           invertido[j]=numeros[i];
	           System.out.println(invertido[j]);
	        }

	}

}
