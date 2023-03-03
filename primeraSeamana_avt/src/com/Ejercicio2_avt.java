package com;

import java.util.Scanner;

public class Ejercicio2_avt {

	public static void main(String[] args) {
		 int numero=0;
	        Scanner Entrada = new Scanner( System.in );

	        System.out.println( "Introduzca un número entero: " );
	        numero = Entrada.nextInt();

	        if ( numero % 2 == 0 )
	        {
	            System.out.println( "ES PAR" );
	        }
	        else
	        {
	            System.out.println( "ES IMPAR" );
	        }
	    }

	}


