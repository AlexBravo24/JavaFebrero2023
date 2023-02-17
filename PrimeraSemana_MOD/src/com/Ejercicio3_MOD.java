package com;

import java.util.Scanner;

public class Ejercicio3_MOD {

	public static void main(String[] args) {
		// Ejercicio 3 - Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		// Si el segundo número es 0, debe mostrar un mensaje de error.
		
		double numero1, numero2;
		Scanner entrada = new Scanner(System.in);// Indica un objeto que nos permite introducir datos por teclado
		
		System.out.println("-------------------------------------------");
		System.out.println("|         División de 2 números           |");
		System.out.println("-------------------------------------------\n");
		
		System.out.print("Ingresa el primer número --> ");
		numero1 = entrada.nextInt();
		
		System.out.print("Ingresa el segundo número --> ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		if (numero2 != 0) {
			System.out.println("\nEl resultado es: " + (numero1 / numero2));
		} else {
			System.out.println("\nError: Lo sentimos, no se puede dividir entre 0!");
		}

	}

}
