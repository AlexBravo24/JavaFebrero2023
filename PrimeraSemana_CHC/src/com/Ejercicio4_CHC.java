package com;

import java.util.Scanner;

//EJERCICIO 4
/*Realiza un programa que lea una cadena por teclado 
 * y compruebe si es una letra may�scula.

 */

public class Ejercicio4_CHC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	    String cadena;
	    String cadena2;
	    Scanner entrada= new Scanner (System.in);
	    System.out.print("Introduce la cadena que desees: ");
	    cadena = entrada.next(); //Introducir la letra 
	    cadena2= cadena.toLowerCase();
	    
	    
	    //Evaluamos si la cadena original es igual a la cadena convertida
	    
//	    if (cadena.length() != 1){ //Para los c�lculos 
//	      System.out.println("La cadena no es una letra may�scula");
//	    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
//	       System.out.println("La cadena es una letra may�scula.");
//	    }else {
//	        System.out.println("La cadena no es una letra may�scula.");
//	    }
	    
	    if(cadena.equals(cadena2)) {
	    	System.out.println("El texto est� en min�sculas");
	    } else {
	    	System.out.println("El texto est� en may�sculas");
	    }
	  }
		
		

}


