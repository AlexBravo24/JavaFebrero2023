package com;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Ejercicio 10
		
		Scanner entrada = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Ingresa el numero del mes: ");
		mes = entrada.nextInt();
		
		switch (mes) {
		
		case 1:
			System.out.println("El mes es Enero y tiene 31 dias");
			break;
		case 2:
			System.out.println("El mes es Febrero y tiene 29 dias");
			break;
		case 3:
			System.out.println("El mes es Marzo y tiene 31 dias");
			break;
		case 4:
			System.out.println("El mes es Abril y tiene 30 dias");
			break;
		case 5:
			System.out.println("El mes es Mayo y tiene 31 dias");
			break;
		case 6:
			System.out.println("El mes es Junio y tiene 30 dias");
			break;
		case 7:
			System.out.println("El mes es Julio y tiene 31 dias");
			break;
		case 8:
			System.out.println("El mes es Agosto y tiene 31 dias");
			break;
		case 9:
			System.out.println("El mes es Septiembre y tiene 30 dias");
			break;
		case 10:
			System.out.println("El mes es Octubre y tiene 31 dias");
			break;
		case 11:
			System.out.println("El mes es Noviembre y tiene 30 dias");
			break;
		case 12:
			System.out.println("El mes es Diciembre y tiene 31 dias");
			break;
		default:
			System.out.println("Este numero no corresponde a un mes");
			break;
		}

	}

}
