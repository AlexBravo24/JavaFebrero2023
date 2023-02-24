package com;

import java.util.Scanner;

public class Ciclos2_MOD {

	public static void main(String[] args) {
		// Ejercicio 2 - Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
		// hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		int numero, limite;
		
		System.out.println("---------------------------------");
		System.out.println("|     Tablas de multiplicar     |");
		System.out.println("---------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el número a multiplicar: ");
		numero = entrada.nextInt();
		
		System.out.print("Hasta que número desea multiplicar?: ");
		limite = entrada.nextInt();
		
		entrada.close();
		
		System.out.println();
		for (int i = 1; i <= limite; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
	}

}
