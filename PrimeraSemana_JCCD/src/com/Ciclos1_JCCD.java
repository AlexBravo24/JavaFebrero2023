package com;

public class Ciclos1_JCCD {

	public static void main(String[] args) {
		// Ciclos Ejercicio 1
		//Programa un algoritmo que realice la tabla de multiplicar del 12
		
		int numero = 12;
		
		for (int i = 1; i<13; i++) {
			int multi = numero*i ;
			System.out.println("La tabla del 12: " + i + " x " + numero + " = " + multi);
		}

	}

}
