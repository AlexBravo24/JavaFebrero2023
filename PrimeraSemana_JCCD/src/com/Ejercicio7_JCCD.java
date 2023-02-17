package com;

import java.util.Scanner;

public class Ejercicio7_JCCD {

	public static void main(String[] args) {
		// Ejercicio 7
		
		Scanner entrada = new Scanner(System.in);
		
		int alumnos;
		
		System.out.println("Cuantos alumnos iran al viaje?");
		
		alumnos = entrada.nextInt();
		
		if (alumnos >= 100) {
			int costo = 65;
			System.out.println("El costo por alumno es: " + costo);
			System.out.println("el costo del viaje es: " + alumnos * costo + " euros");
		}else if(alumnos >= 50 && alumnos <= 99) {
			int costo = 70;
			System.out.println("El costo por alumno es: " + costo);
			System.out.println("el costo del viaje es: " + alumnos * costo + " euros");
		}else if(alumnos >= 30 && alumnos <= 49) {
			int costo = 95;
			
			System.out.println("el costo del viaje es: " + alumnos * costo + " euros");
		}else {
			int costo = 4000;
			System.out.println("El costo del viaje es: " + costo);
		}

	}

}
