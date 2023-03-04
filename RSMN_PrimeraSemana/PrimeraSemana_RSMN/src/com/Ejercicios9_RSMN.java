package com;

import java.util.Scanner;

public class Ejercicios9_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/* 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		introducimos otro número nos da un error. */

	
				Scanner entrada = new Scanner(System.in);
				
				System.out.print("Ingrese el número del día: ");
				int Numero = entrada.nextInt();
				
				if ( Numero == 1 ) {
					
					System.out.println("Hoy es Lunes");
					
				} else if ( Numero == 2 ) {
					
					System.out.println("Hoy es Martes");
					
				} else if ( Numero == 3 ) {
					
					System.out.println("Hoy es Miercoles");
					
				} else if ( Numero == 4 ) {
					
					System.out.println("Hoy es Jueves");
					
				} else if ( Numero == 5 ) {
					
					System.out.println("Hoy es Viernes");
					
				} else if ( Numero == 6 ) {
					
					System.out.println("Hoy es Sabado");
					
				} else if ( Numero == 7 ) {
					
					System.out.println("Hoy es Domingo");
					
				} else {
					
					System.out.println("¡Error, ese día no existe!");
					
				}
			}
			
		}
		

