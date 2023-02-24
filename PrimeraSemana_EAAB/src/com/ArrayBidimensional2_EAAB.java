package com;

import java.util.Scanner;

public class ArrayBidimensional2_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String ma[][] = {{"5","x","9","4","t"},{"3","z","P","c","6"},{"8","3","f","i","7"}};
		String mb[][] = {{"7","P","4","g","8"},{"5","w","Y","10","2"},{"4","7","v","o","6"}};
		String mc[][] = new String[3][5];
		int b,a, suma;

		//Recorremos las matrices A y B verificando si son digitos y de ser asi los sumamos y guardamos en C como String
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<5;j++) {
		
				if(Character.isDigit(ma[i][j].charAt(0)) && Character.isDigit(mb[i][j].charAt(0))) { //si el valor en ma y mb es digito
					
					a= Integer.valueOf(ma[i][j]); //obtenemos el valor en entero int
					b= Integer.valueOf(mb[i][j]); //obtenemos el valor en entero int		
					suma = a+b; //sumamos los valores ya en enteros
					mc[i][j]= Integer.toString(suma); //Guardamos la suma en la matriz c como String
					
					
				}
				else {
					mc[i][j]= "0"; //si alguno no es numerico, guardamos "0" en la matriz
			
				}
			}
		}
		
		//Desplegamos la matriz C resultante
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<5;j++) {
				
				if(Integer.valueOf(mc[i][j])>9) { //si es menor a 9 agremamos un espacio
													// solo para que se vea ordenada la matriz
					System.out.print(mc[i][j]+"  ");
				}
				else {
					System.out.print(mc[i][j]+"   ");	
				}
				
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
