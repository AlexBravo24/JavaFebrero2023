package com;

import java.util.Scanner;

public class Ciclos8_JCCD {

	public static void main(String[] args) {
		// Ejercicio Ciclos 8
		// Programa Java que lea dos números y muestre los números desde el menor hasta el 
		// mayor
		
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
		
		System.out.println("Los numeros desde el " + menor + " hasta el " + mayor + " son: ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

	}

}
