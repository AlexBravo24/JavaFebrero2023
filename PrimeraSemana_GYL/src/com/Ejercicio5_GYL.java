package com;

import java.util.Scanner;

public class Ejercicio5_GYL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/* Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		parámetros: edad, nota y sexo.
	 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
	 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
	 * Otros casos -> NO ACEPTADA
	 */
		
		int nota;
		int edad;
		String sexo;
		
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nota:");
		nota=entrada.nextInt();
		
		Scanner entra=new Scanner(System.in);
		System.out.println("Introduce tu edad:");
		edad=entra.nextInt();
		
		Scanner entrad=new Scanner(System.in);
		System.out.println("Introduce tu sexo:");
		sexo=entrad.nextLine();
		
		if((nota>=5) && (edad>=18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("Solicitud Posible");
		}else if ((nota>=5) && (edad>=18) && (sexo.toUpperCase().equals("F"))) {
			System.out.println("Solicitud Aceptada");
		}else {
			System.out.println("Solicitud No Aceptada");
		}
		
	}

}
