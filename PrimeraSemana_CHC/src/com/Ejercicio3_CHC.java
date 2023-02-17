package com;

import java.util.Scanner;

public class Ejercicio3_CHC {

		/* Crea un programa que pida al usuario dos n�meros y 
		 * /muestre el resultado de su divisi�n. Si el 
		 * segundo n�mero es 0, debe mostrar un mensaje de error.
		 */
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int numerador; //Parte de la divisi�n
	    int denominador;
	    System.out.print("Introduce el primer n�mero: ");
	    numerador = scanner.nextInt(); //Escribir el n�mero a dividir
	    System.out.print("Introduce el segundo n�mero: ");
	    denominador = scanner.nextInt(); //Escribir entre cuantas partes dividir
	    
	
	    if (denominador != 0){ //Para realizar la divisi�n, se indica que el denominador debe ser diferente de 0
	        System.out.println((double)numerador/(double)denominador);
	    }else {
	        System.out.println("Error, el denominador no puede ser 0. "
	            + "Reinicie el programa e introduzca un valor v�lido."); //En caso de introducir un 0, marca error
	    }  
	  }
	}
