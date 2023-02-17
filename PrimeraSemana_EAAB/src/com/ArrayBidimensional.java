package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Un array Bidimensional es un array dentro de otro
		/* en el cual pasamos de una idea de una lista o conjunto de datos
		 * a tener mas elementos
		 * 
		 * Graficamente podriamos asemejarlo con una "tabla" o "matriz"
		 * 
		 * Almacenamos datos en forma de coordenadas
		 * 
		 */
		
		//Declaramos un array de 2 dimensiones
		
		int[][] matriz = new int[3][3];
		
		//primera forma del llenado del array bidimensional
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		
		//otra forma de declarar un array de 2 dimensiones
		
		int matriz1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		// ciclos for anidados para recorrer todo el array y desplegarlo en pantalla
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			
				System.out.print(matriz1[i][j]+" ");	
				
			}
			System.out.println();
		}
		

	}

}
