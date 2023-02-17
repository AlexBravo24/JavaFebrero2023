package com;

import java.util.Scanner;

public class Ejercicio2_JCCD {
	
	

	public static void main(String[] args) {

		//Ejercicio 2
		
		int A;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		
		A = numero.nextInt();
		
		if (A % 2 == 0) {
			System.out.println("Es un numero par");
		}else {
			System.out.println("Es un numero impar");
		}
		
	}

}
