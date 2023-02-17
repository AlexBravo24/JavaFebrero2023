package com;

import java.util.Scanner;

public class Ejercicio3_GYL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error
		
		int numer1;
		int numer2;
		int numer3= 0;
		
		Scanner entrada = new Scanner (System.in);  
		System.out.println("Introducir primer numero");
		numer1 = entrada.nextInt(); 
		
		Scanner entra = new Scanner (System.in);  
		System.out.println("Introducir segundo numero");
		numer2 = entra.nextInt();
		
		if (numer2==numer3) {
			System.out.println("Error");
		}else {
			System.out.println("La division es= "+numer1/numer2);
		}
	}

}
