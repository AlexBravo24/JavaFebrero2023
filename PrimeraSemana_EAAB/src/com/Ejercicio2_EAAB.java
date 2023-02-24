package com;

import java.util.Scanner;

public class Ejercicio2_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un numero: ");
		numero = entrada.nextInt();
		entrada.close();
		
		if (numero%2 == 0) {
			System.out.println(numero +" es un numero PAR ");
		}
		
		else {
			System.out.println(numero+" es un numero IMPAR");
		}

	}

}
