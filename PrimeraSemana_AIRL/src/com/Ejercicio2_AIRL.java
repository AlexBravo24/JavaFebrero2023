/*
 * 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
 */
package com;

import java.util.Scanner;

public class Ejercicio2_AIRL {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		 
		System.out.print("Digita un número: "); 
		numero = entrada.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("El número "+numero+" es PAR");
		}else {
			System.out.println("El número "+numero+" es IMPAR");
		}

	}

}
