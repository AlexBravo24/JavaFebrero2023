package com;

import java.util.Scanner;

public class Ejercicio4_JCCD {

	public static void main(String[] args) {
		// Ejercicio 4
		
		Scanner entrada = new Scanner(System.in);
		
		String text = "";
		
		System.out.println("Ingresa un texto: ");

		text = entrada.nextLine();
		
		System.out.println("El texto es: " + text);
		
		if (text.equals(text.toLowerCase())) {
			System.out.println("El texto no esta en mayuscula");
		}else {
			System.out.println("El texto esta en mayuscula");
		}
	}

}
