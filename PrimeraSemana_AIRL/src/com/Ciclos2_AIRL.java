/*2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
 *  desde teclado, hasta la iteraci�n deseada por el usuario. 
 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??? */
package com;

import java.util.Scanner;

public class Ciclos2_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, limite, multi;
		
		System.out.print("Digite la multiplicaci�n que desee conocer: ");
		numero = entrada.nextInt();
		System.out.print("Digite hasta que n�mero se va a multiplicar: ");
        limite = entrada.nextInt();
        
        for(int i=0; i<=limite; i++) {
        	multi = numero * i;
        	System.out.println(numero+" x "+i+" = "+multi );
        }
		
	}

}
