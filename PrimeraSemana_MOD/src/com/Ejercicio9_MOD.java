package com;

import java.util.Scanner;

public class Ejercicio9_MOD {

	public static void main(String[] args) {
		// Ejercicio 9 - Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
		// Si introducimos otro número nos da un error. 
		
		int diaSemana;
		
		System.out.println("-------------------------------------------");
		System.out.println("|            Dias de la Semana            |");
		System.out.println("-------------------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el día de la semana (1 - 7): ");
		diaSemana = entrada.nextInt();
		entrada.close();
		
		switch(diaSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("ERROR: el día no existe.");					
	
	}
	}

}
