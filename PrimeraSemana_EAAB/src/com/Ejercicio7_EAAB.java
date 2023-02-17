package com;

import java.util.Scanner;

public class Ejercicio7_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int alumnos, costo1, costoTotal;
		
		System.out.print("Introduzca la cantidad de alumnos: ");
		alumnos = entrada.nextInt();
		entrada.close();
		
		if(alumnos >= 100) {
			costo1=65;
			costoTotal= alumnos * costo1;
		}
		
		else if(alumnos >=50 && alumnos<100) {
			costo1= 70;
			costoTotal= alumnos * costo1;
		}
		else if(alumnos >=30 && alumnos<50) {
			costo1=95;
			costoTotal= alumnos * costo1;
		}
		else {
			costoTotal= 4000;
			costo1= costoTotal/alumnos;
		}
		
		System.out.println("El costo total a pagar a la compañia es de: " +costoTotal);
		System.out.println("Cada alumno debe pagar: "+(costo1));
		
		

	}

}
