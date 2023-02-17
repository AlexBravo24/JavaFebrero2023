package com;

import java.util.Scanner;

public class Ejercicio8_JCCD {

	public static void main(String[] args) {
		// Ejercicio 8
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Cual numero le salio en el dado?");
		numero = entrada.nextInt();
		
		switch(numero) {
		
		case 1:
			System.out.println("En la cara opuesta esta el numero 6");
			break;
		case 2:
			System.out.println("En la cara opuesta esta el numero 5");
			break;
		case 3:
			System.out.println("En la cara opuesta esta el numero 4");
			break;
		case 4:
			System.out.println("En la cara opuesta esta el numero 3");
			break;
		case 5:
			System.out.println("En la cara opuesta esta el numero 2");
			break;
		case 6:
			System.out.println("En la cara opuesta esta el numero 1");
			break;
			default:
				System.out.println("Error: Numero incorrecto");
				break;
		
		}
		
	}

}
