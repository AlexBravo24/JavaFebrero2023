package com;

import java.util.Scanner;

public class ArrayBidimensional1_JCCD {

	public static void main(String[] args) {
		
		/*Crea un programa que pida por pantalla cuatro países y a continuación tres 
		*ciudades de cada uno de estos países. Los nombres de ciudades deben 
		*almacenarse en un array multidimensional cuyo primer índice sea el 
		*número asignado a cada país y el segundo índice el número asignado a 
		*cada ciudad. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String [][] paises = new String[4][4];
		String tabla = "";
		
		for (int i=0; i<4; i++) {
			System.out.println("Ingresa un pais: ");
			paises [i][0] = sc.nextLine();
		}
		for (int j = 0; j<4; j++) {
			for(int i=1; i<4; i++) {
				System.out.println("Ingresa la ciudad " + (i) + " del pais " + (j+1) + " : ");
				paises [j][i] = sc.nextLine();
			}
			
		}
		
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j<4; j++) {
				tabla += paises[i][j];
			}
			tabla+="\n";
		}
		System.out.println(tabla);

	}

}
