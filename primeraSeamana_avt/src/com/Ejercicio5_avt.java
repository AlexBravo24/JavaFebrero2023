package com;

import java.util.Scanner;

public class Ejercicio5_avt {
	public static void main(String[] args) {
		/*Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTAD*/
		Scanner Entrada = new Scanner(System.in);
	    int nota;
	    int edad;
	    String sexo;
	    
	    System.out.println("Edad: ");
	    edad = Entrada.nextInt();
	    System.out.println("Nota: ");
	    nota = Entrada.nextInt(); Entrada.nextLine();
	    System.out.println("Sexo (M o F): ");
	    sexo = Entrada.nextLine();
	    

	    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
	      System.out.println("El valor de sexo introducido es incorrect");
	    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	      System.out.println("POSIBLE");
	    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	       System.out.println("ACEPTADA");
	    }else {
	        System.out.println("NO ACEPTADA");
	    }
	    
	}
}
