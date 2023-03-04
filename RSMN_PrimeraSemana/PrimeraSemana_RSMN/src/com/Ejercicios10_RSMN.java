package com;

import java.util.Scanner;

public class Ejercicios10_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/* 10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		mes correspondiente. */

				Scanner entrada = new Scanner(System.in);
				
				System.out.print("Ingrese el número del día: ");
				int Numero = entrada.nextInt();
				
				if ( Numero == 1 ) {
					
					System.out.println("Enero tiene 31 días");
					
				} else if ( Numero == 2 ) {
					
					System.out.println("Febrero tiene 28 días");
					
				} else if ( Numero == 3 ) {
					
					System.out.println("Marzo tiene 31 días");
					
				} else if ( Numero == 4 ) {
					
					System.out.println("Abril tiene 30 días");
					
				} else if ( Numero == 5 ) {
					
					System.out.println("Mayo tiene 31 díass");
					
				} else if ( Numero == 6 ) {
					
					System.out.println("Junio tiene 30 días");
					
				} else if ( Numero == 7 ) {
					
					System.out.println("Julio tiene 31 días");
					
				} else if ( Numero == 8 ) {
					
					System.out.println("Agosto tiene 31 días");
					
				} else if ( Numero == 9 ) {
					
					System.out.println("Septiembre tiene 30 días");
					
				} else if ( Numero == 10 ) {
					
					System.out.println("Octubre tiene 31 días");
					
				} else if ( Numero == 11 ) {
					
					System.out.println("Noviembre tiene 30 días");
					
				} else if ( Numero == 12 ) {
					
					System.out.println("Diciembre tiene 31 días");
					
				} else {
					
					System.out.println("¡Error, ese mes no existe!");
					
				}
			}
			
		}

