package com;

import java.util.Scanner;

public class Ejercicios12_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
		[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

		Valor del IMC   Diágnostico

		<16				Criterio de ingreso en hospital
		de 16 a 17		infrapeso
		de 17 a 18		bajo peso
		de 18 a 25		peso normal (saludable)
		de 25 a 30		sobrepeso (obesidad de grado I)
		de 30 a 35		sobreso crónico (obesidad de grado II)
		de 35 a 40		obesidad premórbida (obesidad de grado III)
		>40				obesidad emórbida (obesidad de grado IV)

		Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
		ser introducidos por teclado por el usuario.

		 */
				
				Scanner entrada_uno = new Scanner(System.in);
				Scanner entrada_dos = new Scanner(System.in);
				
				System.out.print("Ingrese su peso (kg): ");
				double peso = entrada_uno.nextDouble();
				System.out.print("Ingrese su altura: ");
				double altura = entrada_dos.nextDouble();
				
				double raiz_cuadrada = Math.pow(altura, 2);
				
				double IMC = peso / raiz_cuadrada;
				
				
				if ( IMC < 16 ) {
					
					System.out.println("Criterio de ingreso en hospital");
					
				} else if ( IMC >= 16 || IMC <= 17 ) {
					
					System.out.println("Usted sufre de infrapeso");
					
				} else if ( IMC >= 17 || IMC <= 18 ) {
					
					System.out.println("Usted sufre de bajo peso");
					
				} else if ( IMC >= 18 || IMC <= 25 ) {
					
					System.out.println("Usted tiene un peso normal");
					
				} else if ( IMC >= 25 || IMC <= 30 ) {
					
					System.out.println("Usted tiene sobre peso");
					
				} else if ( IMC >= 30 || IMC <= 35 ) {
					
					System.out.println("Usted tiene sobre peso crónico");
					
				} else if ( IMC >= 35 || IMC <= 40 ) {
					
					System.out.println("Usted sufre de obesidad premórbida");
					
				} else {
					
					System.out.println("Usted sufre de obesidad mórbida");
					
				}
			}

		}