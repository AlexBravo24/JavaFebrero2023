package com;

import java.util.Scanner;

public class Ejercicio11_JCCD {

	public static void main(String[] args) {
		// Ejercicio 11
		
		Scanner entrada = new Scanner(System.in);
		
		int Kg;
		
		System.out.println("Cuanto pesa el paquete?");
		Kg = entrada.nextInt();
		
		if (Kg <= 5) {
			int lugar;
			System.out.println("Cual de las siguientes ubicaciones se enviara?");
			System.out.println("1. America del Norte");
			System.out.println("2. America Central");
			System.out.println("3. America del Sur");
			System.out.println("4. Europa");
			System.out.println("5. Asia");
			lugar = entrada.nextInt();
			
			switch(lugar) {
			case 1:
			System.out.println("El costo del envio es: " + Kg*24 + " euros");
			break;
			case 2:
				System.out.println("El costo del envio es: " + Kg*20 + " euros");
				break;
			case 3:
				System.out.println("El costo del envio es: " + Kg*21 + " euros");
				break;
			case 4:
				System.out.println("El costo del envio es: " + Kg*10 + " euros");
				break;
			case 5:
				System.out.println("El costo del envio es: " + Kg*18 + " euros");
				break;
			}
		}else {
			System.out.println("Es muy pesado");
		}

	}

}
