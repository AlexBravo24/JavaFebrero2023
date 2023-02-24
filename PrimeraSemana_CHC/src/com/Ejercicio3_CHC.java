package com;

import java.util.Scanner;

public class Ejercicio3_CHC {

		/* Crea un programa que pida al usuario dos números y 
		 * /muestre el resultado de su división. Si el 
		 * segundo número es 0, debe mostrar un mensaje de error.
		 */
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int numerador; //Parte de la división
	    int denominador;
	    System.out.print("Introduce el primer número: ");
	    numerador = scanner.nextInt(); //Escribir el número a dividir
	    System.out.print("Introduce el segundo número: ");
	    denominador = scanner.nextInt(); //Escribir entre cuantas partes dividir
	    
	
	    if (denominador != 0){ //Para realizar la división, se indica que el denominador debe ser diferente de 0
	        System.out.println((double)numerador/(double)denominador);
	    }else {
	        System.out.println("Error, el denominador no puede ser 0. "
	            + "Reinicie el programa e introduzca un valor válido."); //En caso de introducir un 0, marca error
	    }  
	  }
	}
