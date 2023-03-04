package com;

import java.util.Scanner;

public class Ejercicios3_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		/* 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		segundo número es 0, debe mostrar un mensaje de error. */

		
				Scanner entrada_uno = new Scanner(System.in);
				Scanner entrada_dos = new Scanner(System.in);
				
				System.out.print("agregue el primer número: ");
				float Primer_numero = entrada_uno.nextFloat();
				
				System.out.print("agregue el segundo número: ");
				float Segundo_numero = entrada_dos.nextFloat();
				
				if ( Segundo_numero == 0.0 ) {
					System.out.println("hay un error");
				} else {
					float resultado = Primer_numero / Segundo_numero;
					
					System.out.println("El resultado es: "+resultado);
				}
			}
		}
	


