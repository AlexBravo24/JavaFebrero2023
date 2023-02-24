package com;

import java.util.Scanner;

public class Ciclos6_MOD {

	public static void main(String[] args) {
		// Ejercicio 6 - Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 
		// ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		double inversion;
		
		System.out.println("----------------------------------");
		System.out.println("|        Interes compuesto       |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad a invertir: ");
		inversion = entrada.nextDouble();
		
		entrada.close();
		
		for (int i = 1; i <= 12; i++) {
			inversion =inversion + (inversion*0.02);
		}
		System.out.print("\nLas ganancias de un año con el 2% de interes seran: $");
		System.out.printf("%.2f", inversion);
	}

}
