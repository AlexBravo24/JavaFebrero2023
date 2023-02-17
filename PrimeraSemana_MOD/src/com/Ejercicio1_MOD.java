package com;

import java.util.Scanner;

public class Ejercicio1_MOD {

	public static void main(String[] args) {
		
		// Ejercicio 1 - Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		
		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);// Indica un objeto que nos permite introducir datos por teclado
		
		System.out.println("-------------------------------------------");
		System.out.println("|            N�meros enteros              |");
		System.out.println("|             Mayor o Igual?              |");
		System.out.println("-------------------------------------------\n");
		
		System.out.print("Ingresa el primer n�mero --> ");
		numero1 = entrada.nextInt();
		
		System.out.print("Ingresa el segundo n�mero --> ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		if (numero1 > numero2) {
			System.out.println("\nEl n�mero " + numero1 + " es mayor que " + numero2 + "!" );
		} else if(numero1 < numero2) {
			System.out.println("\nEl n�mero " + numero2 + " es mayor que " + numero1 + "!");
		}else {
			System.out.println("\nEl numero " + numero1 + " es igual a " + numero2 + "!");
		}

	}

}
