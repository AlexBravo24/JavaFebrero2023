package com;

import java.util.Scanner;

public class Array2D_MOD {
	public static void main(String[] args) {
		// Ejercicio 1 - Arrays Bidimensionales
		String pais, ciudad;
		String[][] paisCiudad = new String[4][4];
		
		Scanner entrada = new Scanner(System.in);
		//Ingresamos los paises en el arreglo paisCiudad
		for (int i = 0; i < 4; i++) {
			System.out.print("Ingrese el Pais: ");
			pais = entrada.nextLine();
			paisCiudad[i][0]=pais;
		}
		// Ingrsamos las ciudades por pais en el arreglo paisCiudad
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Ingrese una ciudad para " + paisCiudad[i][0] + ": ");
				ciudad = entrada.nextLine();
				paisCiudad[i][j+1]=ciudad;;
			}
		}
		entrada.close();
		// Mostramos por consola la impresion del arreglo formateado.
		System.out.println("\n" + String.format("%-81s", "").replace(" ", "*"));
		
		for (int i = 0; i < paisCiudad.length; i++) {
			System.out.print("Pais: " + String.format("%-20s", paisCiudad[i][0]) + "Ciudades: " );
			
			for (int j = 1; j < paisCiudad.length; j++) {
				System.out.print(String.format("%-15s", paisCiudad[i][j]));
			}
			System.out.println();
		}
		System.out.println(String.format("%-81s", "").replace(" ", "*"));
	}
}
