package com;

import java.util.Scanner;

public class Ejercicio13_JCCD {

	public static void main(String[] args) {
		// Ejercicio 13
		
		double Donacion;
		double Salud;
		double Ni�os;
		double Bolsa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuanto es la donacion?");
		Donacion = entrada.nextDouble();
		
		if (Donacion >= 10000) {
			Salud = Donacion * 0.30;
			Ni�os = Donacion * 0.50;
			Bolsa = Donacion - (Salud + Ni�os);
			System.out.println("El total dado a salud es: " + Salud);
			System.out.println("El total dado a ni�os es: " + Ni�os);
			System.out.println("Lo invertido a bolsa es es: " + Bolsa);
		}else {
			Salud = Donacion * 0.25;
			Ni�os = Donacion * 0.60;
			Bolsa = Donacion - (Salud + Ni�os);
			System.out.println("El total dado a salud es: " + Salud);
			System.out.println("El total dado a ni�os es: " + Ni�os);
			System.out.println("Lo invertido a bolsa es es: " + Bolsa);
		}

	}

}
