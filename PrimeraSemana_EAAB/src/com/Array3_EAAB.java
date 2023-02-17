package com;

import java.util.Scanner;

public class Array3_EAAB {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y 
		//pasa sus caracteres a un array de caracteres.
		
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		System.out.print("Escribe una frase: ");
		cadena= entrada.nextLine();
		entrada.close();
		
		char[] frase = new char[cadena.length()];
		
		for(int i=0;i<cadena.length();i++) {
			
			frase[i]= cadena.charAt(i);
			System.out.println(frase[i]);
		}

	}

}
