package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner entrada = new Scanner(System.in); //iniciar objeto scanner que nos permite introducir datos por teclado
		entrada.close();
//		System.out.println("introduce un numero: "); // solicitar captura de numero
//		numero = entrada.nextInt(); //guardar el numero ingresado en la variable numero
//		
//		System.out.println("el numero ingresado es: "+numero);
//		
		//System.out.println("su raiz es " +Math.sqrt(numero));
		
		//imprimir en pantalla con cierto formato en decimales
		
		//System.out.printf("%.3f", Math.sqrt(numero));
		
		// Operador modulo (residuo de una division)
		
		int n = 8;
		int resultado;
		
		resultado = n%3;
		
		System.out.println(resultado);

	}

}
