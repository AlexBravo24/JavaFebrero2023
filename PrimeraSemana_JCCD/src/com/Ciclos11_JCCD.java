package com;

import java.util.Scanner;

public class Ciclos11_JCCD {

	public static void main(String[] args) {
		// Ejercicio Ciclos 11
		//Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese valor: ");
		int valor = teclado.nextInt();
		teclado.close();

		for (int fila = 1; fila <= valor; fila++) {
			for (int columna = 1; columna <= valor; columna++)
				System.out.print(" * ");
			
			System.out.println();//Salto de línea para pasar a la siguiente FILA
		}


	}

}
