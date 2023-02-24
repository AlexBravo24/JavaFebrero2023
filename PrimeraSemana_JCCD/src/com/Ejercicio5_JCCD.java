package com;

import java.util.Scanner;

public class Ejercicio5_JCCD {

	public static void main(String[] args) {
		// Ejercicio 5
		
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		int edad;
		
		String genero;
		
		System.out.println("Ingresa tu calificacion: ");
		nota = entrada.nextInt();
		
		if (nota>=5) {
			System.out.println("Ingresa tu edad: ");
			edad = entrada.nextInt();
			
			if(edad >= 18) {
				System.out.println("Cual es tu genero: ");
				genero = entrada.next();
//				
//				String masculino = "M";
//				String femenino = "F";
//				
//				if(genero == masculino) {
//					System.out.println("Posiblemente");
//				}else if (genero == femenino) {
//					System.out.println("Aceptada");
//				}else {
//					System.out.println("No aceptado");
//				}
				switch(genero) {
				
				case "M":
					System.out.println("Posiblemente");
					break;
				case "F":
					System.out.println("Aceptada");
					break;
					default:
						System.out.println("No aceptado");
						break;
				}
				
			}else {
				System.out.println("No aceptado");
			}
			
		}else {
			System.out.println("No aceptado");
		}

	}

}
