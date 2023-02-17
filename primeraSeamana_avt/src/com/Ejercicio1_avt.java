package com;

import java.util.Scanner;

public class Ejercicio1_avt {
	//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.


	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		Scanner Entrada =new Scanner(System.in);
		System.out.println("introduce el primer numero");
		numero1 =Entrada.nextInt();
		System.out.println("introduce el segundo numero");
		numero2 =Entrada.nextInt();
		
		if(numero1==numero2) {
			System.out.println("son iguales ");
		}else  {
			if(numero1>numero2) {
				System.out.println(numero1 + " es mayor que " + numero2);
			}else {
				System.out.println(numero2 + " es mayor que " + numero1);
			}
		}
		
	}

}
