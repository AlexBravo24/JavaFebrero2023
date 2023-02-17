package com;

import java.util.Scanner;

public class Ejercicio12_JCCD {

	public static void main(String[] args) {
		// Ejercicio 12
		
		Scanner entrada = new Scanner(System.in);
		
		double peso;
		double altura;
		
		System.out.println("Cual es tu peso?");
		peso = entrada.nextDouble();
		
		System.out.println("Cual es tu altura?");
		altura = entrada.nextDouble();
		
//		double metros = Math.pow(altura, 2);
		double metros = altura * altura;
		
		double IMC = peso/metros;
		
		System.out.println("Tu IMC es:" + IMC);
		
		if (IMC>16 && IMC<17) {
			System.out.println("Tienes infrapeso");
		}else if(IMC>17 && IMC<18) {
			System.out.println("Tienes bajo peso");
		}else if(IMC>18 && IMC<25) {
			System.out.println("Tienes peso normal");
		}else if(IMC>25 && IMC<30) {
			System.out.println("Tienes sobrepeso");
		}else if(IMC>30 && IMC<35) {
			System.out.println("Tienes sobrepeso cronico");
		}else if(IMC>35 && IMC<40) {
			System.out.println("Tienes obesidad premorbida");
		}else if(IMC>40) {
			System.out.println("Tienes obesidad morbida");
		}
		

	}

}
