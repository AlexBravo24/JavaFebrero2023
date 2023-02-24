package com;

import java.util.Scanner;

//EJERCICIO 14

////Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//primeras 40 horas y $20 por cada hora extra

public class Ejercicio14_CHC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	     int horastrabajadas;
	     int total;
	     int horasextra;
	     System.out.println("Ingrese el número de horas trabajadas");
	     horastrabajadas=entrada.nextInt();
	     //proceso de condición
	     if(horastrabajadas <= 40){   //Se determina la condición de las primeras 40 horas
	         total= horastrabajadas*16; //Se multiplica por $16
	         System.out.println("Su sueldo es de: $"+ total); 
	     }else{
	         horasextra=horastrabajadas-40; //por horas extra sde pagan $20
	         total=(horasextra*20)+(40*16);
	         System.out.println("Su sueldo es de: $"+ total);
	     }
	}

}
