package com;

import java.util.Scanner;

public class Ciclo11_JAMA {
	
	public static void main(String[] args) {
	
	try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("Coloca un numero para definir las columnas y filas del cuadrado: ");
		int cf = entrada.nextInt();
		
		for (int fila = 1; fila <= cf; fila++) {
			for (int columna = 1; columna <= cf; columna++)
				System.out.print("*");
			
			System.out.println();
		}
	}

}
}
