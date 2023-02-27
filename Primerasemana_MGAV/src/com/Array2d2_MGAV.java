/*2. Crea las siguientes matrices. Ejemplo: String matrizA [] [] = new String [3][5];
Para que muestre los siguientes valores:
 */
package com;

public class Array2d2_MGAV {

	public static void main(String[] args) {
		
		String matrizA[][] = {{"5", "x", "9", "4", "t"},
				              {"3", "z", "P", "c", "6"},    
		                      {"8", "3", "f", "i", "7"}};
		
		String matrizB[][] = {{"7", "P", "4", "g", "8"},
	                          {"5", "w", "Y", "10", "2"},    
                              {"4", "7", "v", "o", "6"}};
		
		int matrizC[][] = new int[3][5]; 
		
		int numeros[] = {1,2,3,4,5,6,7,8,9,10};
		int n=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
//				//if(Character.(matrizA[i][j].charAt(0) == numeros[n]) {
//					matrizC[i][j] = numeros[n];
//					j++;
//				}else {
//					matrizC[i][j] = 0;
//				}
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<5; j++) {
				System.out.print(matrizC[i][j]+"  ");
			}
		}


	}

}
