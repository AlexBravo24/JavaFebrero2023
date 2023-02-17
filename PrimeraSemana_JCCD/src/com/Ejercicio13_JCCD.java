package com;

import java.util.Scanner;

public class Ejercicio13_JCCD {

	public static void main(String[] args) {
		// Ejercicio 13
		
		double Donacion;
		double Salud;
		double Niños;
		double Bolsa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuanto es la donacion?");
		Donacion = entrada.nextDouble();
		
		if (Donacion >= 10000) {
			Salud = Donacion * 0.30;
			Niños = Donacion * 0.50;
			Bolsa = Donacion - (Salud + Niños);
			System.out.println("El total dado a salud es: " + Salud);
			System.out.println("El total dado a niños es: " + Niños);
			System.out.println("Lo invertido a bolsa es es: " + Bolsa);
		}else {
			Salud = Donacion * 0.25;
			Niños = Donacion * 0.60;
			Bolsa = Donacion - (Salud + Niños);
			System.out.println("El total dado a salud es: " + Salud);
			System.out.println("El total dado a niños es: " + Niños);
			System.out.println("Lo invertido a bolsa es es: " + Bolsa);
		}

	}

}
