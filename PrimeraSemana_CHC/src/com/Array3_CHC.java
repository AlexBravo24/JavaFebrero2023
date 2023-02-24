package com;

import java.util.Scanner;

//Array 3
//Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
public class Array3_CHC {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Inserta la frase: ");
		String frase=entrada.nextLine();
		
		char caracteres[]= frase.toCharArray(); //Creamos un array de caracteres usando el metodo string
		
		for(int i=0; i<frase.length();i++) {
			System.out.println(caracteres[i]);
		}
		
		
	}
}
