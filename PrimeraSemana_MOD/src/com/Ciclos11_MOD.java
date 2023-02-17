package com;

import java.util.Scanner;

public class Ciclos11_MOD {

	public static void main(String[] args) {
		// Ejercicio 11 - Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
		// Ejemplo: 8 x 8
		
		int ancho, alto;
		
		System.out.println("----------------------------------");
		System.out.println("|       Dibujando cuadrados      |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el ancho: ");
		ancho = entrada.nextInt();
		
		System.out.print("Ingrese el alto: ");
		alto = entrada.nextInt();
		
		entrada.close();
		
		System.out.println();
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
	}

}
