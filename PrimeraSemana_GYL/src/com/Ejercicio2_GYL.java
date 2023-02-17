package com;

import java.util.Scanner;

public class Ejercicio2_GYL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que pida un número por teclado y nos indique si es par o impar
		
		int num;
		
		Scanner entrad= new Scanner (System.in);
		System.out.println("Introdusca numero: ");
		num = entrad.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		
	}

}
