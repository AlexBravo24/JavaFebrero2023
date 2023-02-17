package com;

import java.util.Scanner;

public class Ciclos3_EAAB {

	public static void main(String[] args) {
		// DETERMINAR SI UN STRING ES PALINDROMO
		
		Scanner entrada = new Scanner(System.in);
		
		String cadena, cadenatemp, invertida= ""; // se declaran variables
		int largo;
		
		System.out.print("Ingrese una cadena de texto: ");//se solicita la cadena
		cadena = entrada.nextLine(); //se almacena la cadena en la variable "cadena"
		
		entrada.close(); // se cierra el scanner
		
		//se modifica la cadena para que elimine los espacios
		cadenatemp = cadena.replace(" ", ""); // .replace elimina el espacio y guardamos en otra variable
		largo= cadenatemp.length(); //almacenamos el valor de la longitud de la cadena
		
		// SE INVIERTE LA CADENA ALMACENANDOLA EN UNA NUEVA VARIABLE
		
		for(int i=largo-1; i>=0;i--) { //recorremos cada caracter de la cadena descendente
			
			invertida = invertida + cadenatemp.charAt(i); //vamos almacenando en invertida
		}
		
		//se evalua si la invertida es igual a la cadena ignorando mayusculas
		
		if(invertida.equalsIgnoreCase(cadenatemp)) { 
			
			System.out.println("\n"+cadena +"  ES UN PALINDROMO"); //
		}
		else {
			System.out.println("\n"+cadena +" NO ES UN PALINDROMO");
		}
		
		System.out.println("\nla cadena invertida (sin espacios) es: "+invertida.toLowerCase());

	}

}
