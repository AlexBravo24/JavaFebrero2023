package com;

import java.util.Scanner;

//EJERCICIO 10
//Realiza un programa que pida un n?mero entero entre uno y doce e imprima el n?mero de d?as que tiene el 
//mes correspondiente.



    public class Ejercicio10_CHC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int mes;
	    System.out.println("El programa te devuelve el n?mero de d?as del mes seleccionando:"); 
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
	    System.out.println("Inserta un n?mero del 1 al 12: ");
	    mes = scanner.nextInt();
	// Realizamos comparaciones y mostramos el resultado
	    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){ //Esos meses tienen 31 d?as
	      System.out.println("El mes seleccionado tiene 31 d?as");
	    } else if (mes ==2){
	      System.out.println("Febrero tiene 28 d?as"); // Se especifica que febrero es el ?nico mes que tiene 28d?as
	    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
	      System.out.println("El mes seleccionado tiene 30 d?as"); //Los meses con esos n?meros tienen 30 d?as
	    } else {
	      System.out.println("Error, el mes debe estar entre 1-12."); //Si se ingresa un n?mero mayor a 12 marcar? error.
	    } 

	}

}
