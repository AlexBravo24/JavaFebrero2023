/*2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100. 
 * Obt�n la suma de todos ellos y la media.
 */
package com;

public class Array2_AIRL {

	public static void main(String[] args) {
		
		int numeros[] = new int[100];
		//int suma=0;
		float suma=0f, media;
		
		for(int i=0; i<100; i++) {
			numeros[i] = i+1;
		}
		for(int i=0; i<100; i++) {
			suma+=numeros[i];
		}
		media = suma/100;
		System.out.println("La suma es: "+suma+"\n"+"La media es: "+media);
	}

}
