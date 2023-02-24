package com;

public class Array2_EAAB {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, 
		//que contendrá los números del 1 al 100. 
		//Obtén la suma de todos ellos y la media.
		
		
		int arreglo[] = new int[100];
		double suma=0;
		double promedio;
		
		for(int i=0;i<100;i++) {
			arreglo[i]=i+1;
			suma= suma+arreglo[i];
		}
		
		promedio= suma/100;
		
		System.out.println("La suma es: "+suma+"\nEl promedio es: "+promedio);
		

	}

}
