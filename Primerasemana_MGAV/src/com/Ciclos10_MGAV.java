/*10. Programa que lea 20 n�meros e 
 * indique si son positivos o negativos y 
 * pares o impares y adem�s muestre la 
 * sumatoria de los positivos y sumatoria de los impares.
 */
package com;

import java.util.Scanner;

public class Ciclos10_MGAV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros[] = new int[20];
		int post=0;
		
		for(int i=0; i<20; i++) {
			System.out.println("Digita el n�mero "+(i+1)+": ");
			numeros[i] = entrada.nextInt();
			if(numeros[i] > 0) {
				post++;
				
			}
		}
		

	}

}
