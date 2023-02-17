package com;

import java.util.Scanner;

//EJERCICIO 10
//Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
//mes correspondiente.



    public class Ejercicio10_CHC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int mes;
	    System.out.println("El programa te devuelve el número de días del mes seleccionando:"); 
	    System.out.println(" 1.- Enero.");
	    System.out.println(" 2.- Febreo.");
	    System.out.println(" 3.- Marzo.");
	    System.out.println(" 4.- Abril.");
	    System.out.println(" 5.- Mayo.");
	    System.out.println(" 6.- Junio.");
	    System.out.println(" 7.- Julio.");
	    System.out.println(" 8.- Agosto.");
	    System.out.println(" 9.- Septiembre.");
	    System.out.println("10.- Octubre.");
	    System.out.println("11.- Noviembre.");
	    System.out.println("12.- Diciembre.");
	    System.out.println("Inserta un número del 1 al 12: ");
	    mes = scanner.nextInt();
	// Realizamos comparaciones y mostramos el resultado
	    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){ //Esos meses tienen 31 días
	      System.out.println("El mes seleccionado tiene 31 días");
	    } else if (mes ==2){
	      System.out.println("Febrero tiene 28 días"); // Se especifica que febrero es el único mes que tiene 28días
	    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
	      System.out.println("El mes seleccionado tiene 30 días"); //Los meses con esos números tienen 30 días
	    } else {
	      System.out.println("Error, el mes debe estar entre 1-12."); //Si se ingresa un número mayor a 12 marcará error.
	    } 

	}

}
