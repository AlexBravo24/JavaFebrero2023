package com;

public class Arraybidimensional {

	public static void main(String[] args) {
		
		/*un array bidimensional es un array dentro del otro
		 * en la cula pasamos de una idea  de una lista o conjunto de datos
		 * alamcenamos datos  en forma de coordenada
		 */
		//int [][] matriz= new int [3][3];
		
		//primera forma de llenar un array
		/*matriz [0][0] =1;
		matriz [0][1] =2;
		matriz [0][2] =3;
		
		matriz [1][0] =4;
		matriz [1][1] =5;
		matriz [1][2] =6;
		
		matriz [2][0] =7;
		matriz [2][1] =8;
		matriz [2][2] =9;*/
		
		// otra forma de declarar el array
		int [] [] matriz= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]);
				
			}
		}
		

	}

}
