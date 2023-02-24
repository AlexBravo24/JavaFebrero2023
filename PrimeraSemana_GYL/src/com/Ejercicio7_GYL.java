package com;

import java.util.Scanner;
public class Ejercicio7_GYL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		/*El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
//debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de 
//cobrar es la siguiente:
//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de 
//alumnos.
//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
//pagar cada alumno por el viaje

		int Alumnos;
		
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("El numero de alumnos que asistera es de:");
		Alumnos=entrada.nextInt();
		
		if (Alumnos>=100) {
			System.out.println("El pago a la compañia es de: "+Alumnos*65+". El costo por alumno es de 65 euros.");
		}else if(Alumnos>=50) {
			System.out.println("El pago a la compañia es de: "+Alumnos*70+". El costo por alumno es de 70 euros.");
		}else if(Alumnos>=30) {
			System.out.println("El pago a la compañia es de: "+Alumnos*95+". El costo por alumno es de 95 euros.");
		}else {
			System.out.println("El pago a la compañia es de 4000 euros por la tanto cada alumno debe: "+4000/Alumnos);
		}
		
		
		
}

}
