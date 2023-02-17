package com;

import java.util.Scanner;

public class Ejercicio12_GYL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
	//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC
	
		float peso;
		float altura;
		float IMC;
		
		Scanner entrada= new Scanner(System.in);
		System.out.print("Introduzca el peso: ");
		peso = entrada.nextFloat();
		
		Scanner entra= new Scanner(System.in);
		System.out.print("Introduzca la altura: ");
		altura=entra.nextFloat();
		
		IMC=peso/altura;
		System.out.println("Su IMC es de: "+IMC);
		
		if (IMC==16) {
			System.out.println("Diagnostico: Criterio de ingreso en hospital");
		}else if (IMC>16 && IMC<17) {
			System.out.println("Diagnostico: Infrapeso");
		}else if (IMC>17 && IMC<18) {
			System.out.println("Diagnostico: Bajo peso");
		}else if (IMC>18 && IMC<25) {
			System.out.println("Diagnostico: Peso normal (Saludable)");
		}else if (IMC>25 && IMC<30) {
			System.out.println("Diagnostico: Sobrepeso (Obesidad de grado 1)");
		}else if (IMC>30 && IMC<35) {
			System.out.println("Diagnostico: Sobrepeso crónico (Obesidad de grado II)");
		}else if (IMC>35 && IMC<40) {
			System.out.println("Diagnostico: Obesidad premórbida (Obesidad de grado III)");
		}else if (IMC>40) {
			System.out.println("Diagnostico: Obesidad Mórbida (Obesidad de grado IV)");
		}
	}

}
