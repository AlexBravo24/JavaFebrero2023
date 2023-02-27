/*11.Dibuja un cuadrado, como en la imagen que acompaña, 
 * introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8
 */
package com;

import java.util.Scanner;

public class Ciclos11_MGAV {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int ancho, alto;
		
		System.out.print("Digita el ancho: ");
		ancho = entrada.nextInt();
		System.out.print("Digita el alto: ");
		alto = entrada.nextInt();
		System.out.print("\n");
		
		for(int i=1; i<=alto; i++) {
			for(int j=1; j<ancho; j++) {
				System.out.print(" * ");
			}
			System.out.println(" * ");
		}

	}

}
