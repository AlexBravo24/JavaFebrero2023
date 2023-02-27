/*1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
 *  Muestra por consola el índice y el valor al que corresponde.
 */
package com;

import java.util.Scanner;

public class Array1_MGAV{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"-.Digita un numero: ");
			numeros[i] = entrada.nextInt();
		}
		for(int i=0; i<10; i++) {
			System.out.println("El valor de la posición "+i+" es: "+numeros[i]);
			
		}

	}

}
