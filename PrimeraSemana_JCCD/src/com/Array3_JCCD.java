package com;

import java.util.Scanner;

public class Array3_JCCD {

	public static void main(String[] args) {
		// Ejercicio Array 3
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase: ");
		String frase = sc.nextLine();
		
		char caracteres [] = new char [frase.length()];
		
		
		for (int i = 0; i < frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
			System.out.println(caracteres[i]);
		}
		

	}

}
