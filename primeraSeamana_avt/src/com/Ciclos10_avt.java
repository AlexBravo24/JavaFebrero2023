package com;

import java.util.Scanner;

public class Ciclos10_avt {

	public static void main(String[] args) {
		int num=0;
		int numposi=0;
		int numnega=0;
		int numpar=0;
		int numeroimpar=0;
		int sumaimpar=0;
		int sumaposi=0;
	    Scanner Entrada = new Scanner( System.in );
		for(int i = 1; i<=3; i++){
				
			System.out.println("Digite un numero");
			num=Entrada.nextInt();
			if(num>0){
			System.out.println("el numero " + num+ " es positivo");
			   numposi++;
			   sumaposi=sumaposi + num;
			}
			if(num<0){
				System.out.println("el numero " + num+ " es negativo");
				numnega++;
			}
			if(num % 2 == 0){
				System.out.println("el numero " + num+ " es par");
				numpar++;
			
			}else {
				System.out.println("el numero " + num+ " es impar");
				numeroimpar++;
				sumaimpar=sumaimpar + num;
			}
			 
		}
		System.out.println("la cantidad de numeros positivos es: "+numposi);
		System.out.println("la cantidad de numeros negativos es: "+numnega);
		System.out.println("la cantidad de numeros pares es: "+numpar);
		System.out.println("la cantidad de numeros impares es: "+numeroimpar);
		System.out.println("la suma de numeros positivos: "+sumaposi);
		System.out.println("la suma de impares: "+sumaimpar);

	}

}
