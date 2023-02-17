package com;

import java.util.Scanner;

public class Ejercicio12_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float peso, altura, imc;
		
		System.out.print("ingrese su peso (kg): ");
		peso= entrada.nextFloat();
		System.out.print("ingrese su altura (m): ");
		altura = entrada.nextFloat();
		
		entrada.close();
		
		imc= peso/(altura*altura);
		
		if(imc <16) {
			System.out.println("CRITERIO DE INGRESO EN HOSPITAL");
		}
		else if(imc>= 16 && imc<17) {
			System.out.println("INFRAPESO");
		}
		else if(imc>= 17 && imc<18) {
			System.out.println("BAJO PESO");
		}
		else if(imc>= 18 && imc<25) {
			System.out.println("PESO NORMAL (SALUDABLE)");
		}
		else if(imc>= 25 && imc<30) {
			System.out.println("SOBREPESO (OBESIDAD GRADO I)");
		}
		else if(imc>= 30 && imc<35) {
			System.out.println("SOBREPESO CRONICO (OBESIDAD GRADO II)");
		}
		else if(imc>= 35 && imc<40) {
			System.out.println("OBESIDAD PREMORBIDA (OBESIDAD GRADO III)");
		}
		else if(imc> 40) {
			System.out.println("OBESIDAD MORBIDA (OBESIDAD GRADO IV)");
		}
		
		
		
		

	}

}
