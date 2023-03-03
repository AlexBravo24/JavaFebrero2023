package com;

import java.util.Scanner;

public class Array1_avt {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		for (int i=0; i<numeros.length;i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("ingrese un numero");
			numeros[i] = entrada.nextInt();
			
		}
		for (int i=0; i<numeros.length;i++) {
			System.out.println("indice:"+i+" "+numeros[i]);
		}

      
	       
	}

}


