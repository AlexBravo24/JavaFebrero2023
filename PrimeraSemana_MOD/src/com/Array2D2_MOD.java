package com;

public class Array2D2_MOD {

	public static void main(String[] args) {
		// Ejercicio 2 - Array Bidimensional
		
		String[][] matrizA = {{"5","x","9","4","t"},{"3","z","P","c","6"},{"8","3","f","i","7"}};
		String[][] matrizB = {{"7","P","4","g","8"},{"5","w","Y","10","2"},{"4","7","v","o","6"}};
		String[][] matrizC = new String[3][5];
		
		//ciclo para recorrer matrizA y matrizB
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < 5; j++) {
				// Valida mediante una expresion regular si el contenido de los arreglos es numerico para realizar la suma
				if(matrizA[i][j].matches("[0-9]+") && matrizB[i][j].matches("[0-9]+")) {
					matrizC[i][j] = String.valueOf(Integer.parseInt(matrizA[i][j]) + Integer.parseInt(matrizB[i][j])); 
				}else {
					matrizC[i][j] = "0";
				}
			}
		}
		//Impresion de matriz C en consola
		System.out.println("Matriz C:\n");
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print( String.format(" %-3s", matrizC[i][j]) );
			}
			System.out.println();
		}
	}
}
