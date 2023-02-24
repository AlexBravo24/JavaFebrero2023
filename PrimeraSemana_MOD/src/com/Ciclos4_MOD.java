package com;

import java.util.Scanner;

public class Ciclos4_MOD {

	public static void main(String[] args) {
		// Ejercicio 4 - Programa que reciba una frase y una letra por teclado. 
		// Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
		// Si no existe, imprimir un mensaje “Carácter no encontrado”. 
		String frase, letra;
		int numLetras=0;
		char[] letras;
		
		System.out.println("----------------------------------");
		System.out.println("|     Búsqueda de carácteres     |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el texto: ");
		frase = entrada.nextLine();
		
		System.out.print("Ingrese el carácter a buscar: ");
		letra = entrada.next();
		
		entrada.close();
		
		// Convertimos frase en un array
		letras = frase.toCharArray();
		
		//Recorremos el arreglo para contabilizar el numero de caracteres que coincidan
		for (int i = 0; i < letras.length; i++) {
			if(letra.equals(String.valueOf(letras[i]) )) {
				numLetras++;
			}
		}
		
		// Mostramos el mensaje segun la evaluacion
		if (numLetras>0) {
			System.out.println("\nCantidad de carácteres encontrados en el texto: " + numLetras);
		}else {
			System.out.println("\nCarácter no encontrado!");
		}
	}
}
