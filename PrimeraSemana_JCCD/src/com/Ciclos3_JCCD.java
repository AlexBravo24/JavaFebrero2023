package com;

import java.util.Scanner;

public class Ciclos3_JCCD {

	public static void main(String[] args) {
		// Ciclos ejercicio 3
		// Realiza un programa para determinar si un String es palíndromo
		
		Scanner entrada = new Scanner(System.in);
		
		String palabra;
		
		String invertido = "";
		
		System.out.println("Ingresa una palabra: ");
		palabra = entrada.nextLine();
		
		for (int indice = palabra.length() - 1; indice >= 0; indice--) {
			invertido += palabra.charAt(indice);
		}
		System.out.println("Palabra original " + palabra);
		System.out.println("Palabra invertida " + invertido);
		if (palabra.equals(invertido)) {
			System.out.println("Si es un Palindromo");
		}else {
			System.out.println("No es un Palindromo");
		}

	}

}
