/*1.Realiza un programa que reciba dos n�meros por teclado e indique
 *  cu�l es mayor o si son iguales.
 */
package com;

import java.util.Scanner;


public class Ejercicio1_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2;
		
		
		System.out.print("Digita el primer n�mero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digita el segundo n�mero: ");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("El n�mero "+numero1+" es MAYOR");
		}else if(numero2 > numero1) {
			System.out.println("El n�mero "+numero2+" es Mayor");
		}else {
			System.out.println("Los n�meros son IGUALES");
		}
		
		

	}

}
