/*3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres. */
package com;

import java.util.Scanner;

public class Array3_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		char caracteres[];
		
		System.out.print("Ingresa una frase: ");
		frase = entrada.nextLine();
		
		caracteres = new char[frase.length()];
		
		for(int i=0; i<frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
		}
		
		//System.out.println(frase);
		for(char i:caracteres) {
			System.out.print(i);		
		}
		

	}

}
