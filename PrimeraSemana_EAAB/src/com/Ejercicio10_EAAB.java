package com;

import java.util.Scanner;

public class Ejercicio10_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int mes, ndias;
		
		
		System.out.print("Escriba un mes (1 - 12): ");
		mes= entrada.nextInt();
		entrada.close();
		
		switch (mes) {
		
		case 1: 
		case 3: 	
		case 5: 
		case 7: 
		case 8: 
		case 10: 		
		case 12: ndias = 31;
				break;
				
		case 4:
		case 6:
		case 9:
		case 11: ndias=30;
				break;
		
		case 2: ndias=28;
				break;
		default: System.out.println("ERROR, no existe el mes ingresado");
				ndias=0;
		
		}
		
		System.out.println("el mes ingresado tiene "+ndias +" dias ");
		

	}

}
