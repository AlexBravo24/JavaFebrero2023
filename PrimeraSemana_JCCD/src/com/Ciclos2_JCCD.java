package com;

import java.util.Scanner;

public class Ciclos2_JCCD {

	public static void main(String[] args) {
		// Ejercicio Ciclos 2
		/*Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		*desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta
		el 95. 23 x 95 = ???*/
		
		int numero;
		int max;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Que numero quieres multiplicar?");
		numero = entrada.nextInt();
		
		System.out.println("Hasta que numero quieres que se multiplique?");
		max = entrada.nextInt();
		
		for (int i = 1; i<max+1; i++) {
			int multi = numero * i;
			System.out.println("La tabla del " + "numero: " + i + " x " + numero + " = " + multi);
		}

	}

}
