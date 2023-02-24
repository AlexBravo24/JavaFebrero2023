package com;

import java.util.Scanner;

public class Ciclo2_JAMA {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		//23 x 95 = ???
		

		
	       System.out.println("¿Que tabla quieres Realizar?");
	       try (Scanner entrada = new Scanner(System.in)) {
			int tabla ;
			   tabla = entrada.nextInt();
			
			int multiplicando;
			   System.out.println("¿Hasta que numero quieres multiplicar?");
			   multiplicando = entrada.nextInt();
			   
			   for( int base = 1 ; base<=multiplicando; base++){
			   System.out.println(tabla + " X " + base + " = " + tabla * base );
			     }
		}  
	       //METODO 2
	       
//	       System.out.println("¿Que tabla quieres Realizar?");
//	       Scanner entrada2 = new Scanner(System.in);
//	       
//	     int tabla2 ;
//	       tabla2 = entrada2.nextInt();
//	    
//	    int multiplicando2;
//	       System.out.println("¿Hasta que numero quieres multiplicar?");
//	       multiplicando2 = entrada2.nextInt();
//	       
//	       for( int base2 = 1 ; base2<=multiplicando2; base2++){
//	       System.out.println(tabla2 + " X " + base2 + " = " + tabla2 * base2 );
//	       
//	       }
	    }
	

	}

