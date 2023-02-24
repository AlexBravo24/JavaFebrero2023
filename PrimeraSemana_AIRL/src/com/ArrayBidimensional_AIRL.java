/*1. Crea un programa que pida por pantalla cuatro países y a continuación 
 * tres ciudades de cada uno de estos países. Los nombres de ciudades deben 
 * almacenarse en un array multidimensional cuyo primer índice sea el número 
 * asignado a cada país y el segundo índice el número asignado a cada ciudad.
 * 
 */
package com;

import java.util.Scanner;

public class ArrayBidimensional_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String paises[] = new String[4];
		String ciudades[][] = new String[4][3];
		
		for(int i=0; i<4; i++) {//pais
			System.out.print("Digita el pais "+(i+1)+": ");
			paises[i] = entrada.nextLine();
			}	
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Digita la ciudad "+(j+1)+" de "+paises[i]+": ");
				ciudades[i][j] = entrada.nextLine();
			}
		}
	
				for(int k=0; k<4; k++) {
					System.out.println();
					System.out.print("País: "+paises[k]+"    "+"Ciudades:  ");		
					for(int l=0; l<3; l++) {
						System.out.print(ciudades[k][l]+"   ");				
					}
				}
									
	}

}
