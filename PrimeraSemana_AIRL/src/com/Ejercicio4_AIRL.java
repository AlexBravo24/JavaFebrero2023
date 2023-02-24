/*
 * 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
 */
package com;

import java.util.Scanner;

public class Ejercicio4_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String cadena, cadena2;
		
		System.out.print("Ingresa una cadena de texto: ");
		cadena = entrada.nextLine();
		cadena2 = cadena.toLowerCase();
		
		if(cadena.equals(cadena2)) {
			System.out.println("Ingresaste minusculas");		
		}else {
			System.out.println("Ingresaste mayúsculas");
		}
		

	}

}
