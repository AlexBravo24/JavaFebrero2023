package com;
//EJERCICIO 2
//Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.

import java.util.Scanner;

public class Ejercicio2_CHC {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in); //Se crea un objeto Scanner para poder introducir un valor por teclado 
		    int numero;
		    System.out.println("ESTE PROGRAMA TE DICE SI EL N�MERO ES PAR O IMPAR");
		    System.out.print("Introduce el n�mero: "); //Asignamos el valor del n�mero 
		    numero = scanner.nextInt();
		    
		
		    if (numero % 2 == 0){ //De esta manera se realiza la operaci�n para saber si se puede dividir entre 2, y que el residuo sea 0
		        System.out.println("El n�mero, " +numero + " es par.");
		    }else {
		        System.out.println("El n�mero " +numero + " es impar.");
		    }  
		  }
	}

