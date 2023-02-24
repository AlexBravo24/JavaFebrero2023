package com;

import java.util.Scanner;

public class Ciclos2_EAAB {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		
		Scanner entrada = new Scanner(System.in);
		int numero, veces;
		
		System.out.print("Ingrese numero para realizar su tabla: ");
		numero = entrada.nextInt();
		System.out.print("Hasta que numero desea multiplicarlo? ");
		veces = entrada.nextInt();
		entrada.close();
		
		for(int i = 1; i<= veces;i++) {
			System.out.println(numero +" x "+i+" = "+(numero*i));
			
		}
		

	}

}
