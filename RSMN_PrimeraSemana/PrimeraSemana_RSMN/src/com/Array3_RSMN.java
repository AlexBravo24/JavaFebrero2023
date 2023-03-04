package com;

import java.util.Scanner;

public class Array3_RSMN {
	public static void main(String[] args) {
		
		String frase = "";
		char[] frasecara;
		
		frase = new Scanner(System.in).nextLine();
		
		frasecara = new char[frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			frasecara[i] =  frase.charAt(i);
		}
		System.out.print("En caracteres es: ");
		System.out.println(frasecara);
	}
}
