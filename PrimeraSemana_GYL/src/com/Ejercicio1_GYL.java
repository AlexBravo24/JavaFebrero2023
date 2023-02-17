package com;

import java.util.Scanner;

public class Ejercicio1_GYL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		int numero1;
		int numero2;
		
		Scanner entrada = new Scanner (System.in);  
		System.out.println("Introducir primer numero");
		numero1 = entrada.nextInt(); 
		
		Scanner entra = new Scanner (System.in);  
		System.out.println("Introducir segundo numero");
		numero2 = entra.nextInt();
		
		if (numero1>numero2) {
			System.out.println("El primer numero es mayor");
		}else if (numero1<numero2) {
			System.out.println("El segundo numero es mayor");
		}else if (numero1==numero2) {
			System.out.println("Los dos numeros son iguales");
		}
		
	}

}
