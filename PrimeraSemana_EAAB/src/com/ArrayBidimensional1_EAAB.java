package com;

import java.util.Scanner;

public class ArrayBidimensional1_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String[][] paises = new String[4][4];
		//int j=0;
		String temp;
		
		for(int i=0;i<4;i++) {
			
			System.out.print("Ingrese un pais: ");
			paises[i][0]= entrada.next();
			temp = paises[i][0];
			
			for(int j=1;j<4;j++) {
				
				System.out.print("Ingrese ciudad de "+temp+":  ");
				paises[i][j]= entrada.next();
			}
		}
		
		entrada.close();
		
		for(int i=0;i<4;i++) {
			
			System.out.print("Pais: "+paises[i][0]+"     Ciudades:  ");
			
			for(int j=1;j<4;j++) {
				
				System.out.print("  "+paises[i][j]+"  ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
