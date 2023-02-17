package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Un array bidimensional: es una rray dentro de otro.
		// Conjunto de datos a tener mas elementos al contar con otra dimension
		
		//Declaracion de un array de dos dimensiones
		
		//Ejemplo 1
		int[][] matriz = new int[3][3];
		
		matriz[0][0]= 1;
		matriz[0][1]= 2;
		matriz[0][2]= 3;
		
		matriz[1][0]= 4;
		matriz[1][1]= 5;
		matriz[1][2]= 6;
		
		matriz[2][0]= 7;
		matriz[2][1]= 8;
		matriz[2][2]= 9;
		
		//Ejemplo 2 
		
		int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.println(matriz1[i][j]);
			}
			System.out.println();
		}
	}

}
