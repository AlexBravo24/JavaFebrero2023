package com;

import java.util.Scanner;

public class Ejercicio2_JAMA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		Scanner entrada = new Scanner (System.in); 
		System.out.println("introduce un numero"); 
		numero = entrada.nextInt();
		
		
		if(numero%2==0){
			System.out.println("es par");
		}else {
			System.out.println("es inpar");
		}
		
	}

}