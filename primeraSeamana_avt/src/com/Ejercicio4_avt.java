package com;

import java.util.Scanner;

public class Ejercicio4_avt {

	public static void main(String[] args) {
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		 Scanner Entrada = new Scanner (System.in);
		    String cadena;
	
		 System.out.println("Introduce una palabra que desees: ");
		    cadena = Entrada.nextLine();
		    
		
		   // if (cadena.length() != 1){
		    //  System.out.println("La cadena es correcta");
		 
		     if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		       System.out.println("La cadena es una letra mayúscula.");
		   
		    }else {
		        System.out.println("La cadena no es una letra mayúscula.");
		    }

	}

}
