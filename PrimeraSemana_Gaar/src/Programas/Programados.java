package Programas;

import java.util.Scanner;

//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
public class Programados {
	
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);
		int Numero1=0;
		
		
		System.out.println("Ingresa Un Numero : ");
		Numero1 = sc.nextInt();
		
		if(Numero1 % 2 == 0)
		{
			System.out.println("El Numero Ingresado Es Par");
		}
		else
		{
			System.out.println("El Numero Ingresado Es Impar");
		}
		
		
		
		
	}

}
