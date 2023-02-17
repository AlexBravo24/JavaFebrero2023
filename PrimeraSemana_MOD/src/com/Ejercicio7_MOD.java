package com;

import java.util.Scanner;

public class Ejercicio7_MOD {

	public static void main(String[] args) {
		// Ejercicio 7 
		/*El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno 
		 * y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: 
		 * * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros. 
		 * * De 30 a 49 alumnos, el costo es de 95 euros. 
		 * * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
		 * Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
		 * 
		 */
		double costoPorAlumno, alumnosPorViaje;
		
		System.out.println("-------------------------------------------");
		System.out.println("|            Vamonos de viaje             |");
		System.out.println("-------------------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Cuantos alumnos se van de viaje?: ");
		alumnosPorViaje = entrada.nextDouble();
		entrada.close();
		
		if (alumnosPorViaje >= 100) {
			costoPorAlumno = 65;
			System.out.println("\nEl costo por alumno es: " + costoPorAlumno + " euros.");
			System.out.printf("\nEl costo total del viaje es: " + "%.2f", (costoPorAlumno * alumnosPorViaje));
		} else if(alumnosPorViaje >= 50 && alumnosPorViaje <= 99) {
			costoPorAlumno = 70;
			System.out.println("\nEl costo por alumno es: " + costoPorAlumno + " euros.");
			System.out.printf("\nEl costo total del viaje es: " + "%.2f", (costoPorAlumno * alumnosPorViaje));
		}else if(alumnosPorViaje >= 30 && alumnosPorViaje <= 49) {
			costoPorAlumno = 95;
			System.out.println("\nEl costo por alumno es: " + costoPorAlumno + " euros.");
			System.out.printf("\nEl costo total del viaje es: " + "%.2f", (costoPorAlumno * alumnosPorViaje));
		}else if(alumnosPorViaje <30 && alumnosPorViaje > 0) {
			costoPorAlumno = 4000/alumnosPorViaje;
			System.out.printf("\nEl costo por alumno es: " +  costoPorAlumno + " euros.");
			System.out.printf("\nEl costo total del viaje es: " + "%.2f", (costoPorAlumno * alumnosPorViaje));
		}
		
	}

}
      