package com;

import java.util.Scanner;

public class Ejercicios1_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1.Realiza un programa que reciba dos números por teclado e 
		 * indique cuál es mayor o si son iguales. */

		
				Scanner entradaUno = new Scanner(System.in);
				Scanner entradaDos = new Scanner(System.in);
				
				System.out.print("agregue el primer número: ");
				int PrimerNumero = entradaUno.nextInt();
				
				System.out.print("agregue el segundo número: ");
				int SegundoNumero = entradaDos.nextInt();
				
				if ( PrimerNumero > SegundoNumero ) {
					
					System.out.println("El número "+PrimerNumero+" es mayor que el número "+SegundoNumero);
				
				} else if ( PrimerNumero < SegundoNumero ) {
					
					System.out.println("El número "+SegundoNumero+" es mayor que el número "+PrimerNumero);
					
				} else {
					
					System.out.println("El número "+PrimerNumero+" es igual que el número "+SegundoNumero);
				}
			}
		
	}


