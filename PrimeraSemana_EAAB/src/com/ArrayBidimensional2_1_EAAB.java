package com;

import java.util.Scanner;

public class ArrayBidimensional2_1_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);
		
		String ma[][] = new String[3][5];
		String mb[][] = new String[3][5];
		String mc[][] = new String[3][5];
		
		int b,a, suma;
		
		
		//Llenando matriz A
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<5;j++) {
				
				System.out.print("Digite MatrizA["+i+"]["+j+"] ");
				ma[i][j]= entrada.next();
				
			}
			
		}
		//Llenando matriz B
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<5;j++) {
				
				System.out.print("Digite MatrizB["+i+"]["+j+"] ");
				mb[i][j]= entrada.next();
			
			}
			
		}
		entrada.close();
		
		//Recorremos las matrices A y B verificando si son digitos y de ser asi los sumamos 
		//y guardamos en matriz C como String
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<5;j++) {
		
				if(Character.isDigit(ma[i][j].charAt(0)) && Character.isDigit(mb[i][j].charAt(0))) { //si el valor en ma y mb es digito
					
					a= Integer.valueOf(ma[i][j]);
					b= Integer.valueOf(mb[i][j]);
					
					//a = Character.getNumericValue(ma[i][j].charAt(0)); //se convierte en numero
					//b = Character.getNumericValue(mb[i][j].charAt(0)); //se convierte en numero		
					suma = a+b;
					mc[i][j]= Integer.toString(suma);
					
					
				}
				else {
					mc[i][j]= "0";
			
				}
			}
		}
		
		//Desplegamos la matriz C resultante
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<5;j++) {
				
				if(Integer.valueOf(mc[i][j])>9) {
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
