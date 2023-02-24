/*5. Realiza un programa que calcule la aceptación de una solicitud 
con base a 
 * los siguientes parámetros: edad, nota y sexo. 
 * * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
 * * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
 * * Otros casos -> NO ACEPTADA
 */
package com;

import java.util.Scanner;

public class Ejercicio5_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		float nota;
		String sex;
		
		
		System.out.print("Digita edad: ");
		edad = entrada.nextInt();
		System.out.print("Digita nota: ");
		nota = entrada.nextFloat();
		System.out.print("Ingresa sexo F/M: ");
		sex = entrada.next();		
		
		
		if(nota >= 5 && edad >= 18 && sex.equalsIgnoreCase("m")) {
			System.out.println("POSIBLE");
		}else if(nota >= 5 && edad >= 18 && sex.equalsIgnoreCase("f")) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
		//System.out.println(sex);

	}

}
