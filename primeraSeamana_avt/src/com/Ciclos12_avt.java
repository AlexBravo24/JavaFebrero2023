package com;

import java.util.Scanner;

public class Ciclos12_avt {

	public static void main(String[] args) {
		int lado1=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el numero de asteriscos: ");
		lado1=entrada.nextInt();
		
		 for(int i = 1; i<=lado1; i++){
			 for(int j = 1; j<=lado1; j++){
				 System.out.print(" * ");
				 
			 }
			 System.out.println();
			 
		 }

	}

}
