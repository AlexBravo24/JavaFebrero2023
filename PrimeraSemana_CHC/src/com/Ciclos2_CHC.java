package com;
//EJERCICIO 2
//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//23 x 95 = ??


import java.util.Scanner;

public class Ciclos2_CHC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int factor1= entrada.nextInt();
		
		for(int factor2=1; factor2<=95; factor2++) {
			System.out.println(factor1 + " x " +factor2+ " = "+(factor1*factor2));
		}
		
	}

}
