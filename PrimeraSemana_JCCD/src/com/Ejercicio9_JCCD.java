package com;

import java.util.Scanner;

public class Ejercicio9_JCCD {

	public static void main(String[] args) {
		// Ejercicio 9
		
		Scanner entrada = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Introduce el dia de la semana: ");
		dia = entrada.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("El dia es Lunes");
			break;
		case 2:
			System.out.println("El dia es Martes");
			break;
		case 3:
			System.out.println("El dia es Miercoles");
			break;
		case 4:
			System.out.println("El dia es Jueves");
			break;
		case 5:
			System.out.println("El dia es Viernes");
			break;
		case 6:
			System.out.println("El dia es Sabado");
			break;
		case 7:
			System.out.println("El dia es Domingo");
			break;
		default:
			System.out.println("Error: el numero debe ser del 1 al 7");
			break;
		}

	}

}
