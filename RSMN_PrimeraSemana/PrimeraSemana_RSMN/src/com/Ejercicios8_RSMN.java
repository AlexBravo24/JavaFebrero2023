package com;

import java.util.Scanner;

public class Ejercicios8_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
		seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado 
		obtenido.
		Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
		�ERROR: n�mero incorrecto�. */


				Scanner entrada = new Scanner(System.in);
				
				System.out.print("Ingrese el n�mero que obtuvo al lanzar el dado: ");
				int Numero = entrada.nextInt();
				
				if ( Numero == 1 ) {
					
					System.out.println("La cara opuesta de ese n�mero es F");
					
				} else if ( Numero == 2 ) {
					
					System.out.println("La cara opuesta de ese n�mero es E");
					
				} else if ( Numero == 3 ) {
					
					System.out.println("La cara opuesta de ese n�mero es D");
					
				} else if ( Numero == 4 ) {
					
					System.out.println("La cara opuesta de ese n�mero es C");
					
				} else if ( Numero == 5 ) {
					
					System.out.println("La cara opuesta de ese n�mero es B");
					
				} else {
					
					System.out.println("La cara opuesta de ese n�mero es A");
					
				}
			}
			
		}		
		

