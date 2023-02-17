package com;

import java.util.Scanner;

public class Ejercicio10_MOD {

	public static void main(String[] args) {
		/* Ejercicio 10
		 * Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
		 * 
		 */
		
		int numeroMes;
		
		System.out.println("-------------------------------------------");
		System.out.println("|          Dias por Mese del año          |");
		System.out.println("-------------------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el número de mes (1 - 12): ");
		numeroMes = entrada.nextInt();
		entrada.close();

		switch (numeroMes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("\nEste mes tiene 31 días!");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("\nEste mes tiene 30 días!");
			break;
		case 2:
			System.out.println("\nEste mes por lo general tiene 28 días!\n"
					+ "Pero en años bisiestos tiene 29 dias!");
			break;
		default:
			System.out.println("\nError: Ingresaste un mes que no existe!");
			break;
		}
	}

}
