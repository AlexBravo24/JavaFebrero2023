package com;

import java.util.Scanner;

public class Ejercicios8_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
		obtenido.
		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
		“ERROR: número incorrecto”. */


				Scanner entrada = new Scanner(System.in);
				
				System.out.print("Ingrese el número que obtuvo al lanzar el dado: ");
				int Numero = entrada.nextInt();
				
				if ( Numero == 1 ) {
					
					System.out.println("La cara opuesta de ese número es F");
					
				} else if ( Numero == 2 ) {
					
					System.out.println("La cara opuesta de ese número es E");
					
				} else if ( Numero == 3 ) {
					
					System.out.println("La cara opuesta de ese número es D");
					
				} else if ( Numero == 4 ) {
					
					System.out.println("La cara opuesta de ese número es C");
					
				} else if ( Numero == 5 ) {
					
					System.out.println("La cara opuesta de ese número es B");
					
				} else {
					
					System.out.println("La cara opuesta de ese número es A");
					
				}
			}
			
		}		
		

