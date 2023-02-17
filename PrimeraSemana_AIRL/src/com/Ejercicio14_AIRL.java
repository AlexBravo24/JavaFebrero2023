/*
 * 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
 * Si trabaja 40 horas o menos se le paga $16 por hora. 
 * Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y 
 * $20 por cada hora extra.
 */
package com;

import java.util.Scanner;

public class Ejercicio14_AIRL {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int horas, salario;
		
		System.out.print("Digita las horas trabajadas: ");
		horas = entrada.nextInt();
		
		if(horas <= 40) {
			salario = horas * 16;
			System.out.println("Tu salario semanal es: "+salario);
		}else {
			salario = (40 * 16) + ((horas - 40) * 20);
			System.out.println("Tu salario semanal con horas extras es de: "+salario);
		}

	}

}
