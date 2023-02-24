package com;

import java.util.Scanner;

public class Array1_JAMA {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("escribe 10 numeros");
		int [] numeros = {entrada.nextInt()};
		
		for (int i:numeros) { 
			System.out.println("se mostrara el array (numeros) por renglon");
			System.out.println(i);
		}

	}

}
