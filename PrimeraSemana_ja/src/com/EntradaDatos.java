package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		//introducir numeros por teclado
		
		int numero; //Declaro una variable en la que pueda guardar lo que voy a escribir por teclado
		
		Scanner entrada = new Scanner (System.in); //iniciar un objeto Scanner que nos permita introducir datos por teclado
		System.out.println("introduce un numero"); //nos mandamos un mensaje en consola para saber que hacer
		numero = entrada.nextInt();//Guardamos el valor que vamos a introducir por teclado
									//la variable int declaradad en un principio
		
		System.out.println("El numero tecleado es " + numero);
		
		
		
//		System.out.println(Math.sqrt(numero));//con la clase Math solicita la raiz del numero introducido
		
		
		
//		System.out.printf("%.4f",Math.sqrt(numero)); //elegimos la cantidad de decimales a 
		
		/*Operador de modulo
		 * 
		 */
		
		int n = 10;
		
		int resultado = n%4; //nos arroja el residuo de una operacion o division de numeros enteros
		
		System.out.println(resultado);
		
	}

}
