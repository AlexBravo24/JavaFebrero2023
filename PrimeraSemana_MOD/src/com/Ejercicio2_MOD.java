package com;

import java.util.Scanner;

public class Ejercicio2_MOD {

	public static void main(String[] args) {
		// Ejercicio 2 - Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		int numero;
		Scanner entrada = new Scanner(System.in);// Indica un objeto que nos permite introducir datos por teclado
		
		System.out.println("-------------------------------------------");
		System.out.println("|            N�meros enteros              |");
		System.out.println("|              Par o Impar?               |");
		System.out.println("-------------------------------------------\n");
		
		System.out.print("Ingresa un n�mero --> ");
		numero = entrada.nextInt();
		
		entrada.close();
		
		if (numero % 2 == 0) {
			System.out.println("\nEl n�mero " + numero + " es par!");
		}else {
			System.out.println("\nEl n�mero " + numero + " es impar!");
		}
	}

}
