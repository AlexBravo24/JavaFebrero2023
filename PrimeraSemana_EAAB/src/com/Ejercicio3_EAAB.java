package com;

import java.util.Scanner;

public class Ejercicio3_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduzca 2 numeros: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		entrada.close();
		
		if (num2 == 0) {
			System.out.println("ERROR NO SE PUEDE DIVIDIR ENTRE CERO");
		}
		
		else {
			System.out.println("La DIVISION de "+num1 +" entre "+num2 +" es igual a "+(num1/num2));
		}

	}

}
