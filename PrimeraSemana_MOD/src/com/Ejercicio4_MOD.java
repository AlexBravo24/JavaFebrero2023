package com;

import java.util.Scanner;

public class Ejercicio4_MOD {

	public static void main(String[] args) {
		// Ejercico 4 - Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
		String letras;
		
		Scanner entrada = new Scanner(System.in);// Indica un objeto que nos permite introducir datos por teclado
		
		System.out.println("-------------------------------------------");
		System.out.println("|       El texto esta en may�sculas?      |");
		System.out.println("-------------------------------------------\n");
		
		System.out.print("Ingresa un texto --> ");
		letras = entrada.nextLine();
	
		entrada.close();
		
		if (letras.equals(letras.toUpperCase())) {
			System.out.println("\nEl texto esta en May�sculas!");
		} else {
			System.out.println("\nEl texto esta en minusculas!");
		}
		
	}

}
