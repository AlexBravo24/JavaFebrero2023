/*3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
 * Si el segundo n�mero es 0, debe mostrar un mensaje de error. 
 */
package com;

import java.util.Scanner;

public class Ejercicio3_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double numero1, numero2, div;
		
		System.out.print("Digita el primer n�mero: ");
		numero1 = entrada.nextDouble();
		System.out.print("Digita el segundo n�mero: ");
		numero2 = entrada.nextDouble();
		
		if(numero2 > 0) {
			div = numero1/numero2;
			System.out.println("El resultado es: "+div);
		}else {
			System.out.println("***Error***"+"\nNo es posible dividir entre 0");
		}

	}

}
