package com;

import java.util.Scanner;

public class Ejercicio5_JAMA {

	public static void main(String[] args) {
		// Ejercicio5 - 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
//		parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		
		int nota = 5;
		int nota5;
		int edad = 18;
		int edad18;	
		String sexo = "M";
		String sexop;
		
		//introducir el primer numero
		Scanner entrada = new Scanner (System.in); 
		System.out.println("introduce tu sexo (M O F)"); 
		sexop = entrada.next();
								
				//introducir el segundo numero
		Scanner entrada2 = new Scanner (System.in); 
		System.out.println("introduce tu edad (18)"); 
		edad18 = entrada2.nextInt();
		
		//introducir el segundo numero
		Scanner entrada3 = new Scanner (System.in); 
		System.out.println("introduce tu NOTA (5)"); 
		nota5 = entrada3.nextInt();
		
		
		
		if(sexo==sexop && edad==edad18 && sexop.equalsIgnoreCase("M")){
			System.out.println("POSIBLE");//SI SE CUMPLEN LAS 3 CONDICIONES NE DEVUELVE TRUE
		}else if (sexop.equalsIgnoreCase("F")) {//SI NO SE CUMPLE UNA, ME DEVUELVE FALSE
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		
		
	}

	}

}
