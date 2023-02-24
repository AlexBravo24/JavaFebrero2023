package com;

import java.util.Scanner;

public class Ejercicio1_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduzca 2 numeros: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		entrada.close();
		
		if (num1 > num2) {
			System.out.println(num1 +" es mayor que "+num2);
		}
		else if(num2 > num1) {
			System.out.println(num2 +" es mayor que "+num1);
			
		}
		else {
			System.out.println("los numeros son iguales");
		}

	}

}
