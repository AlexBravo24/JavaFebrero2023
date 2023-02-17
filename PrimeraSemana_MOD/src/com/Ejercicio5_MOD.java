package com;

import java.util.Scanner;

public class Ejercicio5_MOD {

	public static void main(String[] args) {
		/* Ejercicio 5 - Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes par�metros: edad, nota y sexo. 
		 * M�nimo: Nota (5), edad (18), sexo M -> POSIBLE 
		 * M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 * Otros casos -> NO ACEPTADA
		*/
		int nota, edad;
		String sexo;
		
		Scanner entrada = new Scanner(System.in);// Indica un objeto que nos permite introducir datos por teclado
		
		System.out.println("-------------------------------------------");
		System.out.println("|       Aceptaci�n de solicitudes        |");
		System.out.println("-------------------------------------------\n");
		
		System.out.print("Ingrese la nota: ");
		nota = entrada.nextInt();
		
		System.out.print("Ingrese la edad: ");
		edad = entrada.nextInt();
		
		System.out.print("Sexo (M o F): ");
		sexo = entrada.next();
	
		entrada.close();
		
		boolean sexoMF = sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M");
		
		if (nota >= 5 && edad >= 18 && sexoMF) {
			System.out.println("\nPOSIBLE ACEPTADA");
		} else {
			System.out.println("\nNO ACEPTADA");
		}
	}	
}
