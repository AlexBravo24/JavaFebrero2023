package com;

import java.util.Scanner;

public class Ejercicios1_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1.Realiza un programa que reciba dos n�meros por teclado e 
		 * indique cu�l es mayor o si son iguales. */

		
				Scanner entradaUno = new Scanner(System.in);
				Scanner entradaDos = new Scanner(System.in);
				
				System.out.print("agregue el primer n�mero: ");
				int PrimerNumero = entradaUno.nextInt();
				
				System.out.print("agregue el segundo n�mero: ");
				int SegundoNumero = entradaDos.nextInt();
				
				if ( PrimerNumero > SegundoNumero ) {
					
					System.out.println("El n�mero "+PrimerNumero+" es mayor que el n�mero "+SegundoNumero);
				
				} else if ( PrimerNumero < SegundoNumero ) {
					
					System.out.println("El n�mero "+SegundoNumero+" es mayor que el n�mero "+PrimerNumero);
					
				} else {
					
					System.out.println("El n�mero "+PrimerNumero+" es igual que el n�mero "+SegundoNumero);
				}
			}
		
	}


