package com;

import java.util.Scanner;

public class Ejercicio14_MOD {

	public static void main(String[] args) {
		// Ejercicio 14 - Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		// Si trabaja 40 horas o menos se le paga $16 por hora. 
		// Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
		
		double horasTrabajadas, sueldo;
		
		System.out.println("-------------------------------------------");
		System.out.println("|          Calculadora de nómina          |");
		System.out.println("-------------------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese las horas laboradas en la semana: ");
		horasTrabajadas = entrada.nextDouble();
		
		entrada.close();
		
		if (horasTrabajadas > 0 && horasTrabajadas < 40) {
			sueldo = horasTrabajadas * 16;
			System.out.println("\nSalario semanal: $" + sueldo);
		} else if(horasTrabajadas >= 40){
			sueldo = (40*16) + ( (horasTrabajadas - 40)*20 );
			System.out.println("\nSalario semanal: $" + sueldo);
		}
	}

}
