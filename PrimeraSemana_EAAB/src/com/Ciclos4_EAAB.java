package com;

import java.util.Scanner;

public class Ciclos4_EAAB {

	public static void main(String[] args) {
		// BUSCAR NUMERO DE VECES QUE APARECE UNA LETRA EN UNA FRASE
		
		Scanner entrada = new Scanner(System.in);
		
		String frase; // se declaran variables
		int largo, contador=0;
		char letra;
		
		System.out.print("Ingrese una frase: ");//se solicita la cadena
		frase = entrada.nextLine();
		
		System.out.print("Ingrese una letra a buscar: ");//se solicita la cadena
		letra = entrada.next().charAt(0);
		entrada.close();
		
		largo= frase.length();
		
		for(int i=0; i<largo;i++) {
			
			if(frase.toLowerCase().charAt(i)==Character.toLowerCase(letra)) {
				contador++;
			}
			
		}
		
		if(contador==0) {
			System.out.println("\nNo se encontro la letra '"+letra +"' en la frase");
		}
		else {
			System.out.println("\nLa letra '"+letra+"' se encontró "+contador+
					" vez(es) en la frase");
		}
		
		

	}

}
