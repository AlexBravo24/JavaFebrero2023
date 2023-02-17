package com;
//EJERCICIO 12
//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
//Valor de IMC	Diagnóstico
//< 16	Criterio de ingreso en hospital
//de 16 a 17	Infrapeso
//de 17 a 18	Bajo peso
//de 18 a 25	Peso normal (saludable)
//de 25 a 30	Sobrepeso
//de 30 a 35	Sobrepeso crónico
//de 35 a 40	Obesidad premórbida
//    > 40	         Obesidad mórbida
//Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
//ser introducidos por teclado por el usuario.
//

import java.util.Scanner;

public class Ejercicio12_CHC {

	public static void main(String[] args) {
	System.out.println("En el siguiente programa se calcula el IMC");
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduzca su peso:"); //Se pide al usuario su peso
	double peso = entrada.nextDouble(); //Para indicar que será con decimales
	System.out.println("Introduzca su altura en Metros:"); //Se pide al usuario su altura
	double altura = entrada.nextDouble();
	
	double imc = peso/(altura*altura);
	System.out.println("Su índice de masa corporal es:" +(int)imc);

	
	
	
	if(imc<16) {
		System.out.println("De acuerdo a su IMC, usted tiene riesgo de ingreso al hospital");
	}else if (imc>=16 && imc<17) { 
		System.out.println("De acuerdo a su IMC, usted tiene infrapeso");
	}else if (imc>=17 && imc<=18) {
		System.out.println("De acuerdo a su IMC, usted tiene bajo peso");
	}else if (imc>=18 && imc<=25) {
		System.out.println("Peso normal, usted está saludable");
	}else if (imc>=25 && imc<=30) {
		System.out.println("De acuerdo a su IMC, usted presenta Sobrepeso");
	}else if (imc>=30 && imc<=35) {
		System.out.println("De acuerdo a su IMC, usted presenta Sobrepeso crónico");
	}else if (imc>=35 && imc<=40) {
		System.out.println("De acuerdo a su IMC, usted presenta Obesidad Premórbida");
	}else if (imc>40) {
		System.out.println("De acuerdo a su IMC, usted presenta Obesidad Mórbida");
	}
	
	}

}
