package com;

import java.util.Scanner;

public class Ciclos10_MOD {

	public static void main(String[] args) {
		// Ejercicio 10 - Programa que lea 20 números e indique si son positivos o negativos y pares o impares 
		// y además muestre la sumatoria de los positivos y sumatoria de los impares.
		int numero, sumaPositivos=0, sumaImpares=0;
		
		System.out.println("----------------------------------");
		System.out.println("|      Clasificando números      |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 20; i++) {
			System.out.print("\nIngrese número " + i + ": ");
			numero = entrada.nextInt();
			
			if(numero > 0) {
				System.out.println("\nEl numero " + numero + " es positivo.");
				sumaPositivos = sumaPositivos + numero;
			}else if(numero < 0) {
				System.out.println("\nEl numero " + numero + " es negativo.");
			}else if(numero == 0 ) {
				System.out.println("\nEl numero " + numero + " es neutro.");
			}
			
			if(numero%2 == 1 || numero%2 == -1) {
				sumaImpares = sumaImpares + numero;
			}
		}
		entrada.close();
		
		System.out.println("\n\nLa sumatoria de los números positivos es: " + sumaPositivos);
		System.out.println("La sumatoria de los números impares es: " + sumaImpares);
		System.out.println(-3%2);
	}

}
