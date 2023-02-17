package com;

import java.util.Scanner;

public class Ciclos8_MOD {

	public static void main(String[] args) {
		// Ciclos 8 - Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
		
		int numero1, numero2, mayor, menor;
		
		System.out.println("----------------------------------");
		System.out.println("|        Rango de números        |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Ingrese el segundo número: ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		if(numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		}else {
			mayor = numero2;
			menor = numero1;
		}
		
		System.out.println("\n\nLos numero entre " + menor + " y " + mayor + " son:");
		if(numero1 != numero2) {
			for (int i = menor+1; i < mayor; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("Los numeros son iguales!");
		}

	}

}
