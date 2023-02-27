/*
 * 7. El director de una escuela está organizando un viaje de estudios y requiere determinar

 *  cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. 
 *  La forma de cobrar es la siguiente: 
 *  * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
 *  * De 50 a 99 alumnos, el costo es de 70 euros. 
 *  * De 30 a 49 alumnos, el costo es de 95 euros. 
 *  * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar 
 *  el número de alumnos. Realiza un algoritmo que permita determinar el pago a la 
 *  compañía de autobuses y lo que debe pagar cada alumno por el viaje.
 */
package com;

import java.util.Scanner;

public class Ejercicio7_MGAV {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 int alumnos;
		 double pago;
		 
		 System.out.print("Digita el número de alumnos: ");
		 alumnos = entrada.nextInt();
		 
		 if(alumnos >= 100) {
			 pago = alumnos * 75;
			 System.out.println("El pago de la compañia es: "+pago+" euros");
			 System.out.println("El costo por alumnos es: "+75+" euros");
		 }else if(alumnos >= 50 && alumnos <= 99) {
			 pago = alumnos * 70;
			 System.out.println("El pago de la compañia es: "+pago+" euros");
			 System.out.println("El costo por alumnos es: "+70+" euros");
		 }else if(alumnos >= 30 && alumnos <= 49) {
			 pago = alumnos * 95;
			 System.out.println("El pago de la compañia es: "+pago+" euros");
			 System.out.println("El costo por alumnos es: "+95+" euros");
		 }else {
			 pago = 4000.0/alumnos;
			 System.out.println("El pago de la compañia es: 4000 euros");
			 System.out.printf("El costo por alumno es: "+pago);
		 }

	}

}
