package com;

import java.util.Scanner;

public class Ciclos12_MOD {

	public static void main(String[] args) {
		// Ejercicio 12 - ingresan un conjunto de n edades de personas por teclado. 
		// El programa finalizara cuando el promedio de las edades sea superior a 25.
		int edad, edades=1;
		double promedio=0;
		
		System.out.println("----------------------------------");
		System.out.println("|        Promediando edades      |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		while(promedio<25) {
			System.out.print("Ingrese la edad: ");
			edad = entrada.nextInt();
			promedio = (promedio + edad)/edades;
			edades++;
		}
		
		entrada.close();
		System.out.println("\nCantidad de edades ingresadas: " + (edades - 1) 
				+ "\nPromedio: " + promedio);
	}

}
