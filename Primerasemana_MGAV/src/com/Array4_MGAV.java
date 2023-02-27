/*4. Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
 * Guardar los valores de este array en otro array distinto pero con los valores invertidos, 
 * es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
 */
package com;

public class Array4_MGAV {

	public static void main(String[] args) {
		int numeros[] = {1,2,3,4,5};
		int numInv[] = new int[5];
		int j=0;
		for(int i=numeros.length-1; i>=0; i--) {
			numInv[j] = numeros[i];
			j++;
		}
		for(int i:numInv) {
			System.out.println(i);
		}

	}

}
