package com;

import java.util.Scanner;

public class Ejercicio1_JCCD {

	public static void main(String[] args) {
		
		//Ejercicio 1
		
		int A;
		int B;
		
		Scanner primero = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero: ");
		
		A = primero.nextInt();
		
		System.out.println("Ingresa el segundo numero: ");
		
		B = primero.nextInt();
		
		if (A > B) {
			System.out.println("El mayor numero es: " + A);
		}else if (A < B){
			System.out.println("El numero mayor es: " + B);
		}else {
			System.out.println("Son iguales");
		}
		
		
	}

}
