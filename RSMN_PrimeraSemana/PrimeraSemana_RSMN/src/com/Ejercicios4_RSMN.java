package com;

import java.util.Scanner;

public class Ejercicios4_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 4. Realiza un programa que lea una cadena por teclado y 
		 * compruebe si es una letra may�scula.
		 */
		String texto;
				Scanner entrada = new Scanner(System.in);
				
				System.out.print("agrega una palabra: ");
				texto = entrada.nextLine();
				
				if ( Character.isUpperCase(texto.charAt(0))) {
					
					System.out.println("si hay una letra may�scula");
					
				} else {
					
					System.out.println("No hay letra may�scula");
					
				}
							
	}
}


/*
 * String cadena;
 * String cadena2
 * 
 * Scanner entrada =*/
 