package com;

import java.util.Scanner;

public class Ejercicio12_MOD {

	public static void main(String[] args) {
		// Ejercicio 12 -Construir un programa que calcule el índice de masa corporal de una persona 
		// (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		
		double peso, altura, imc;
		
		System.out.println("-------------------------------------------");
		System.out.println("|            Calculadora - IMC            |");
		System.out.println("-------------------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la altura en m: ");
		altura = entrada.nextDouble();
		
		System.out.print("Ingrese el peso en kg: ");
		peso = entrada.nextDouble();
		
		entrada.close();
		
		imc = peso/(altura*altura);
		
		if (imc < 16) {
			System.out.println("\nEl IMC es: " + imc);
			System.out.println("Diagnóstico: Criterio de ingreso en hospital.");
		} else if(imc >= 16 && imc <17) {
			System.out.println("\nEl IMC es: " + imc);
			System.out.println("Diagnóstico: infrapeso.");
		}else if (imc >= 17 && imc <18 ) {
			System.out.println("\nEl IMC es: " + imc);
			System.out.println("Diagnóstico: bajo peso.");
		}else if (imc >= 18 && imc <25 ) {
			System.out.println("\nEl IMC es: " + imc);
			System.out.println("Diagnóstico: peso normal (saludable)");
		}else if (imc >= 25 && imc <30 ) {
			System.out.println("\nEl IMC es: " + imc);
			System.out.println("Diagnóstico: sobrepeso (obesidad de grado I)");
		}else if (imc >= 30 && imc <35 ) {
			System.out.println("\nEl IMC es: " + imc);
			System.out.println("Diagnóstico: sobrepeso crónico (obesidad de grado II)");
		}else if (imc >= 35 && imc <40 ) {
			System.out.println("\nEl IMC es: " + imc);
			System.out.println("Diagnóstico: obesidad premórbida (obesidad de grado III)");
		}else if (imc >= 40 ) {
			System.out.println("\nEl IMC es: " + imc);
			System.out.println("Diagnóstico: obesidad mórbida (obesidad de grado IV)");
		}
		
	}

}
