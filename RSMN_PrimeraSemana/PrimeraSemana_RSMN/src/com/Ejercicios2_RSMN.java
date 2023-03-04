package com;

import java.util.Scanner;

public class Ejercicios2_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		/* 2.Realiza un programa que pida un número por teclado y 
		 * nos indique si es par o impar */

		int numero;
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("agregue un número: ");
				 numero = entrada.nextInt();
				if ( numero % 2 == 0 ) {
					
					System.out.println("El número "+numero+" es par");
					
				} else {
					
					System.out.println("El número "+numero+" es impar");
					
				}
				
			}
		}
	


