/*3. Realiza un programa para determinar si un String es palíndromo.*/
package com;

import java.util.Scanner;

public class Ciclos3_MGAV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String palabra, palabraInv = "";
		char caracter;
		
		System.out.print("Digita una palabra: ");
		palabra = entrada.next();
		
		 for (int i = palabra.length() - 1; i >= 0; i--) {
	            caracter = palabra.charAt(i);
	            palabraInv += caracter;
	        }
		 if(palabra.equals(palabraInv)) {
			 System.out.println("La palabra "+palabra+" es PALÍNDROMO");
		 }else {
			 System.out.println("La palabra "+palabra+ " No es palíndromo");
		 }
		
		
		
		
		
		
		
		
 
	}

}
