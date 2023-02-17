package com;

import java.util.Scanner;

public class Ciclos10_JCCD {

	public static void main(String[] args) {
		// Ejercicios Ciclos 10
		// Programa que lea 20 números e indique si son positivos o negativos y pares o 
		// impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 
		
		Scanner read = new Scanner(System.in);
		
		int sumaPares = 0, sumaImpares = 0;
		for (int i = 1; i <= 20; i++) {
			System.out.print("Ingrese numero: ");
			int numero = Integer.parseInt(read.nextLine());
			
			if (numero > 0) {
                System.out.print("El numero es positivo\n");
            } else {
                System.out.print("El numero es negativo\n");
            }
			
			if (numero % 2 == 0)
				sumaPares += numero;
			else
				sumaImpares += numero;
		}
		System.out.println("\nSuma de pares: " + sumaPares);
		System.out.println("Suma de impares: " + sumaImpares);


	}

}
