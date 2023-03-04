package com;

import java.util.Scanner;

public class Ejercicios5_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		/* 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA */

		int edad;
		int nota;
		String sexo;
		
				Scanner entrada_uno = new Scanner(System.in);
				Scanner entrada_dos = new Scanner(System.in);
				Scanner entrada_tres = new Scanner(System.in);
				
				System.out.print("tu edad: ");
				 edad = entrada_uno.nextInt();
				
				System.out.print("agrega una nota: ");
				 nota = entrada_dos.nextInt();
				
				System.out.print("agrega el sexo: ");
				 sexo = entrada_tres.nextLine();
				
				if ( edad >= 18 && nota >= 5 && sexo.equalsIgnoreCase("Masculino") ) {
					
					System.out.println("POSIBLE");
					
				} else if ( edad >= 18 && nota >= 5 && sexo.equalsIgnoreCase("Femenino") ) {
					
					System.out.println("ACEPTADA");
					
				} else {
					
					System.out.println("NO ACEPTADA");
					
				}
			}
		}
	


