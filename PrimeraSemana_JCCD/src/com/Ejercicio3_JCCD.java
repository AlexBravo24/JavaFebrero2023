package com;

import java.util.Scanner;

public class Ejercicio3_JCCD {

	public static void main(String[] args) {
		
		//Ejercicio 3
		
		double A;
		double B;
		
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero: ");
		A = numeros.nextDouble();
		
		System.out.println("Ingresa el segundo numero: ");
		B = numeros.nextDouble();
		
		double C = A/B;
		
		if (B > 0) {
			System.out.println("La division es: " + C);
		}else {
			System.out.println("Error");
		}
		

	}

}
