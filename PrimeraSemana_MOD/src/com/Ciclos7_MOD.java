package com;

import java.util.Scanner;

public class Ciclos7_MOD {

	public static void main(String[] args) {
		// Ejercicio 7 - Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. 
		// ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?
		
		double inversion, gananciaDeseada;
		int meses=0;
		
		System.out.println("----------------------------------");
		System.out.println("|       Interes compuesto 2      |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad a invertir: ");
		inversion = entrada.nextDouble();
		
		System.out.print("Ingrese la cantidad que desea ganar: ");
		gananciaDeseada = entrada.nextDouble();
		
		entrada.close();
		
		while(inversion <= gananciaDeseada) {
			inversion = inversion + (inversion * 0.02);
			meses++;
		}
	
		System.out.println("\nLa cantidad de meses para ganar $" + gananciaDeseada + " es de " + meses);
		System.out.printf("Y su ganacia seria de: $" + "%.2f", inversion);
	}

}
