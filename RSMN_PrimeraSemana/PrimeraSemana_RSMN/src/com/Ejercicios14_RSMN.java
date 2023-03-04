package com;

import java.util.Scanner;

public class Ejercicios14_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
		horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
		primeras 40 horas y $20 por cada hora extra. */

				
		Scanner entrada = new Scanner(System.in);
	     
	     int horastrabajadas,total,horasex;
	    
	     System.out.println("Ingrese el número de horas trabajadas");
	     horastrabajadas=entrada.nextInt();
	   
	     if(horastrabajadas <= 40){
	         total= horastrabajadas*16;
	         
	         System.out.println("Su sueldo es de $:"+total);
	     }else{
	         horasex=horastrabajadas-40;
	         total=(horasex*20)+(40*16);
	         System.out.println("Su sueldo es de $:"+total);
	     }
	         
			
	}
}

