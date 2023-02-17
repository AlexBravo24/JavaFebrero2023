package com;

import java.util.Scanner;

public class Ciclos10_EAAB {

	public static void main(String[] args) {
	// Programa que lea 20 números e indique si son positivos o negativos y pares o impares 
	//y además muestre la sumatoria de los positivos y sumatoria de los impares.
		
		Scanner entrada = new Scanner(System.in);
		
		
		int n[]= new int[20];
		int sumaposi=0, sumaimpares=0;
		
		for(int i=0; i<20;i++) {
			System.out.print("Ingrese el "+(i+1)+"° numero: ");
			n[i]= entrada.nextInt();
			
		}
		entrada.close();
		
		for(int i=0;i<20;i++) {
			
			if(n[i]>0) {
				
				sumaposi= sumaposi + n[i];
				
				if(n[i]%2==0) {
					System.out.println(n[i]+" es POSITIVO y PAR");
				}
				else {
					System.out.println(n[i]+" es POSITIVO e IMPAR");
					sumaimpares= sumaimpares + n[i];
				}
			}
			else if(n[i]<0) {
				if(n[i]%2!=0) {
					sumaimpares= sumaimpares + n[i];
					System.out.println(n[i]+" es NEGATIVO e IMPAR");
				}
				else {
					System.out.println(n[i]+" es NEGATIVO y PAR");
					
				}
			}
			
		}
		
		
		
		
		System.out.print("Suma de positivos es: "+sumaposi);
		System.out.print("\nSuma de impares es: "+sumaimpares);
		

	}

}
