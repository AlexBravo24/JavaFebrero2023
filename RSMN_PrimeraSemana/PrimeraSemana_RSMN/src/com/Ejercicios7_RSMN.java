package com;

import java.util.Scanner;

public class Ejercicios7_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* 7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
		cobrar es la siguiente:
		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		* De 50 a 99 alumnos, el costo es de 70 euros.
		* De 30 a 49 alumnos, el costo es de 95 euros.
		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
		alumnos.
		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
		pagar cada alumno por el viaje. */

					
					
					int precio;
					int Alumnos;
					
					Scanner entrada = new Scanner(System.in);
					
					System.out.print("agrega el n�mero de alumnos: ");
					 Alumnos = entrada.nextInt();
					
					if ( Alumnos >= 100 ) {
						
						precio = Alumnos * 65;
						
						System.out.println("El precio por alumno es de 65 euros, por lo que el total es: "+precio);
						
					} else if ( Alumnos >= 50 && Alumnos <= 99 ) {
						
						precio = Alumnos * 70;
						
						System.out.println("El precio por alumno es de 70 euros, por lo que el total es: "+precio);
						
					} else if ( Alumnos >= 30 && Alumnos <= 49 ) {
						
						precio = Alumnos * 95;
						
						System.out.println("El precio por alumno es de 95 euros, por lo que el total es: "+precio);
						
					} else {
						
						System.out.println("El precio es de 4000 euros");
						
					}
					
				}
		}