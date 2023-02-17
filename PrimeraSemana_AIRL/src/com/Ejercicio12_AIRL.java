/*
 * 12.Construir un programa que calcule el índice de masa corporal de una persona
 *  (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa
 *   persona en función del valor de IMC:
 *   Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
 *   Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
 */
package com;

import java.util.Scanner;

public class Ejercicio12_AIRL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float peso, altura, imc;
		
		System.out.print("Digite su peso: ");
		peso = entrada.nextFloat();
		System.out.print("Digite su altura en m: ");
		altura = entrada.nextFloat();
		
		imc = (float) (peso / (Math.pow(altura, 2)));
		
		if(imc < 16) {
			System.out.println("Su IMC es de: "+imc+" Criterio de ingreso en hospital");
		}else if(imc > 16 && imc < 17) {
			System.out.println("Su IMC es de: "+imc+" Infrapeso");
		}else if(imc > 17 && imc < 18) {
			System.out.println("Su IMC es de: "+imc+" Bajo Peso");
		}else if(imc > 18 && imc < 25) {
			System.out.printf("Su IMC es de: "+imc+" Peso Normal (Saludable)");
		}else if(imc > 25 && imc < 30) {
			System.out.println("Su IMC es de: "+imc+" Sobrepeso (Obesidad grado I)");
		}else if(imc > 30 && imc < 35) {
			System.out.println("Su IMC es de: "+imc+" Sobrepeso Crónico (Obesidad de grado II)");
		}else if(imc > 35 && imc < 40) {
			System.out.println("Su IMC es de: "+imc+" Obesidad Premórbida (Obesidad de grado III)");
		}else {
			System.out.println("Su IMC es de: "+imc+" Obesidad Mórbida (Obesidad de grado IV)");
		}
		System.out.printf("%.2f", imc);
	

	}

}
