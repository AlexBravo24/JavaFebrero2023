package com;

import java.util.Scanner;

public class EnradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// introduce numeros por teclado

		int numero; // declaro una variable en la que voy a introducirn por teclado
		 Scanner  entrada = new Scanner(System.in); // inicar un objeto scanner que nos permita introducir datos ppr teclado
		 System.out.println("introduce un numero"); // envia un mensaje

		numero = entrada.nextInt(); // guardamos el valor que vamos a introducir por teclado
		                            // la variable int declarada en un principio


		System.out.println("el numero tecleado es " + numero);

		System.out.println(numero+20);

		System.out.println(Math.sqrt(numero)); // con la clase math solicito la raiz


		// imprimir en pantalla con cierto formato en los decimales
		System.out.printf("%.4f", Math.sqrt(numero));


		// operador de modulo

		int n=10;

		int resultado = n%2;// nos aroja el residuo de una operacion o divicion de numeros enteros

		System.out.println(resultado);



	}

}
