/*
 * 2.Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
 */
package com;

import java.util.Scanner;

public class Ejercicio2_AIRL {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		 
		System.out.print("Digita un n�mero: "); 
		numero = entrada.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("El n�mero "+numero+" es PAR");
		}else {
			System.out.println("El n�mero "+numero+" es IMPAR");
		}

	}

}
