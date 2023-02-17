package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// *Un array Bidimensiona es un array dentro de otro
		/* en en cual pasamos de una idea de una "lista" o conjunto de datos 
		 * a tener más elementos al contar con otra dimensión
		 * 
		 * Gráficamente o en salida de datos, podríamos "asemejarlo"
		 * o compararlo a una "tabla"
		 * 
		 * Almacenamos datos en él ahora en forma de "coordenadas"
		 */
		
		//Declaramos un array de dos dimensiones
		
//		int [] [] matriz =new int [3][3];

		//Primera forma del llenado de el array bidimensional 
		
//		matriz[0][0]= 1;
//		matriz[0][1]= 2;
//		matriz[0][2]= 3;
//		
//		
//		matriz[1][0]= 4;
//		matriz[1][1]= 5;
//		matriz[1][2]= 6;
//		
//		matriz[2][0]= 7;
//		matriz[2][1]= 8;
//		matriz[2][2]= 9;

		
		//Otra forma de declarar un array de dos dimensiones
		
		int[][] matriz= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		//Dandole salida a los datos de la matriz en consola
		
		//Anidamos dos ciclos
		
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<3; j++)
				System.out.println(matriz[i][j]);
		}
	}

}
