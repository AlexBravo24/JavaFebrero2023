package com;

import java.util.Scanner;

public class Ejercicio14_JCCD {

	public static void main(String[] args) {
		// Ejercicio 14
		
		Scanner entrada = new Scanner(System.in);
		
		int horas;
		int extra;
		int total;
		
		System.out.println("Cuantas horas trabajas?");
		horas = entrada.nextInt();
		
		if (horas <= 40) {
			System.out.println("Tu pago total es de: " + horas * 16);
		}else {
			extra = horas - 40;
	        total= (extra * 20) + (40*16);
	        System.out.println("Tu pago total es de:" + total);
		}

	}

}
