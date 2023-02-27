/*4.Programa que reciba una frase y una letra por teclado. 
 * Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
 * Si no existe, imprimir un mensaje “Carácter no encontrado”.
 */
package com;

import java.util.Scanner;

public class Ciclos4_MGAV {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		char letra, caracter = 0;
		int cont = 0;
		
		System.out.print("Digita una frase: ");
		frase = entrada.nextLine();
		System.out.print("Digita una letra: ");
		letra = entrada.next().charAt(0);
		
		for(int i=0; i<(frase.length()); i++) {
			caracter = frase.charAt(i);
			
			if(letra == caracter) {
				cont++;
			}else {
				cont+=0;
			}
		}
		
		if(cont > 0) {
			System.out.println("La letra "+letra+" se encuentra "+cont+" en la frase");
		}else {
			System.out.println("Caracter No encontrado");
		}
		
	}

}
