package com;

import java.util.Scanner;

public class Ejercicio1_MOD {

	public static void main(String[] args) {
		
		// Ejercicio 1 - Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);// Indica un objeto que nos permite introducir datos por teclado
		
		System.out.println("-------------------------------------------");
		System.out.println("|            Números enteros              |");
		System.out.println("|             Mayor o Igual?              |");
		System.out.println("-------------------------------------------\n");
		
		System.out.print("Ingresa el primer número --> ");
		numero1 = entrada.nextInt();
		
		System.out.print("Ingresa el segundo número --> ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		if (numero1 > numero2) {
			System.out.println("\nEl número " + numero1 + " es mayor que " + numero2 + "!" );
		} else if(numero1 < numero2) {
			System.out.println("\nEl número " + numero2 + " es mayor que " + numero1 + "!");
		}else {
			System.out.println("\nEl numero " + numero1 + " es igual a " + numero2 + "!");
		}

	}

}
