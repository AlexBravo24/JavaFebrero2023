package com;

import java.util.Scanner;

public class Array3_MOD {

	public static void main(String[] args) {
		// Ejercicio 3 - Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		String frase;
		char[] letras;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el texto: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		// Convertimos frase en un array
		letras = frase.toCharArray();
		
		for (char c : letras) {
			System.out.println(c);
		}
	}

}
