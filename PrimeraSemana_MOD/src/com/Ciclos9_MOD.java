package com;

import java.util.Scanner;

public class Ciclos9_MOD {

	public static void main(String[] args) {
		// Ejercicio 9 - Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos.
		
		int numero1, numero2, mayor, menor;
		
		System.out.println("----------------------------------");
		System.out.println("|        Rango de n�meros        |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el primer n�mero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Ingrese el segundo n�mero: ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		if(numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		}else {
			mayor = numero2;
			menor = numero1;
		}
		
		System.out.println("\n\nLos numero pares entre " + menor + " y " + mayor + " son:");
		if(numero1 != numero2) {
			for (int i = menor; i <= mayor; i++) {
				if (i%2 == 0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("Los numeros son iguales!");
		}

	}

}
