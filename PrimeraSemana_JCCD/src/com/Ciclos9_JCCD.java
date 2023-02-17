package com;

import java.util.Scanner;

public class Ciclos9_JCCD {

	public static void main(String[] args) {
		// Ejercicio Ciclos 9
		// Programa Java que lea dos números y muestre los números pares entre ellos
		
Scanner entrada = new Scanner(System.in);
		
		int num1, num2, menor, mayor;
		
		do {
			System.out.println("Introduce un numero: ");
			num1 = entrada.nextInt();
			System.out.println("Introduce otro numero diferente: ");
			num2 = entrada.nextInt();
			
			if(num1 == num2) {
				System.out.println("Introduce un numero distinto al primero: ");
				num2 = entrada.nextInt();
			}
		}while (num1 == num2);
		
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		}else {
			mayor = num2;
			menor = num1;
		}
		
		System.out.println("Los numeros pares desde " + menor + " hasta " + mayor + " son: ");
		for (int i = menor; i < mayor; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
