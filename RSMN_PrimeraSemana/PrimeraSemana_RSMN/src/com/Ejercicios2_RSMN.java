package com;

import java.util.Scanner;

public class Ejercicios2_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		/* 2.Realiza un programa que pida un n�mero por teclado y 
		 * nos indique si es par o impar */

		int numero;
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("agregue un n�mero: ");
				 numero = entrada.nextInt();
				if ( numero % 2 == 0 ) {
					
					System.out.println("El n�mero "+numero+" es par");
					
				} else {
					
					System.out.println("El n�mero "+numero+" es impar");
					
				}
				
			}
		}
	


