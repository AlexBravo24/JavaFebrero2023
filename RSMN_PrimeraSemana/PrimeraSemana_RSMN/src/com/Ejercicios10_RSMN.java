package com;

import java.util.Scanner;

public class Ejercicios10_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/* 10.Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
		mes correspondiente. */

				Scanner entrada = new Scanner(System.in);
				
				System.out.print("Ingrese el n�mero del d�a: ");
				int Numero = entrada.nextInt();
				
				if ( Numero == 1 ) {
					
					System.out.println("Enero tiene 31 d�as");
					
				} else if ( Numero == 2 ) {
					
					System.out.println("Febrero tiene 28 d�as");
					
				} else if ( Numero == 3 ) {
					
					System.out.println("Marzo tiene 31 d�as");
					
				} else if ( Numero == 4 ) {
					
					System.out.println("Abril tiene 30 d�as");
					
				} else if ( Numero == 5 ) {
					
					System.out.println("Mayo tiene 31 d�ass");
					
				} else if ( Numero == 6 ) {
					
					System.out.println("Junio tiene 30 d�as");
					
				} else if ( Numero == 7 ) {
					
					System.out.println("Julio tiene 31 d�as");
					
				} else if ( Numero == 8 ) {
					
					System.out.println("Agosto tiene 31 d�as");
					
				} else if ( Numero == 9 ) {
					
					System.out.println("Septiembre tiene 30 d�as");
					
				} else if ( Numero == 10 ) {
					
					System.out.println("Octubre tiene 31 d�as");
					
				} else if ( Numero == 11 ) {
					
					System.out.println("Noviembre tiene 30 d�as");
					
				} else if ( Numero == 12 ) {
					
					System.out.println("Diciembre tiene 31 d�as");
					
				} else {
					
					System.out.println("�Error, ese mes no existe!");
					
				}
			}
			
		}

