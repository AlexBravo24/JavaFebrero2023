package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Introducir n�meros por teclado
		
		int numero; //Declaro una variable en lo que pueda guardar lo que vot a introducir por teclado
		
//		Scanner entrada= new Scanner(System.in);// Iniciar un obejto scanner que nos permite introducir datos
//		System.out.println("Introduce un n�mero");//Nos enviamos un mensaje en consola para saber que hacer
//	
//	  numero= entrada.nextInt(); //Guardar el valor que vamos a introducir por teclado en 
//	                             // la variable int declarada en un principio
//	System.out.println("El n�mero tecleado es " + numero);
//	
//	//System.out.println(Math.sqrt(numero)); //con la clase math solicito la ra�z de n�mero
//	//imprimir en pantalla con cierto formato los decimales
//	System.out.printf("%.2f",Math.sqrt(numero)); //aqu� elegimos la cantidad de decimales a mostrar
//	}

	
	//Operador de modulo
	
	int n=10;
	
	int resultado= n%4;//nos arroja el residuo de una operaci�n o divisi�n de n�meros enteros
	
	System.out.println(resultado);

	}
}
