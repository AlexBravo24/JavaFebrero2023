package com;

import java.util.Scanner;

public class Ejercicio9_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		int dia;
		
		
		System.out.print("Escriba un dia de la semana en numero (1 - 7): ");
		dia= entrada.nextInt();
		entrada.close();
		
		switch (dia) {
		
		case 1: System.out.println("el dia "+dia +" corresponde a LUNES");
				break;
		case 2: System.out.println("el dia "+dia +" corresponde a MARTES");
				break;
				
		case 3: System.out.println("el dia "+dia +" corresponde a MIERCOLES");
				break;
		
		case 4: System.out.println("el dia "+dia +" corresponde a JUEVES");
				break;
		
		case 5: System.out.println("el dia "+dia +" corresponde a VIERNES");
				break;
		
		case 6: System.out.println("el dia "+dia +" corresponde a SABADO");
				break;
				
		case 7: System.out.println("el dia "+dia +" corresponde a DOMINGO");
				break;		
		default: System.out.println("ERROR, no existe dia " +dia +" en una semana");
		
		
		
		
		
		}
		
		

	}

}
