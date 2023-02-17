package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 
		
		
		
		
		
//		int [] [] matriz = new int [3][3];
//		
//		//Primera forma del llenado de el arry bidimensional
//		
//		matriz [0][0] = 1;
//		matriz [0][1] = 2;
//		matriz [0][2] = 3;
//		
//		matriz [1][0] = 4;
//		matriz [1][1] = 5;
//		matriz [1][2] = 6;
//	
//		matriz [2][0] = 7;
//		matriz [2][1] = 8;
//		matriz [2][2] = 9;
	
		//Otra forma de declaral un array de dos dimensiones
		
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Dandole salida a los datos de la matriz en consola
		
		//Anidamos dos ciclos 
		
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) //No necesariamente se ponen llaves
				System.out.print(matriz[i][j]);
			
		
			
			
			
			}
		}
	}


