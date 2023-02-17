package Bucles;
//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
//23 x 95 = ???

import java.util.Scanner;

public class Programa_Dos {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int Ni, Nf;
		
		System.out.println("Ingresa El Numero Que Deseas Multiplicar :");
		Ni = sc.nextInt();
		System.out.println("Ingresa El Tope  :");
		Nf = sc.nextInt();
		
		for(int i=1; i<=Nf; i++)
		{
			System.out.println(Ni+" X "+ i + " = "+Ni*i);
		}
		
	}
}
