package com;

import java.util.Scanner;

public class Ejercicio8_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int dado;
		
		
		System.out.print("Lance un dado e introduzca el valor obtenido (1 - 6):");
		dado= entrada.nextInt();
		entrada.close();
		
		switch (dado) {
		
		case 1: System.out.println("El lado opuesto es SEIS");
				break;
		case 2: System.out.println("El lado opuesto es CINCO");
				break;
				
		case 3: System.out.println("El lado opuesto es CUATRO");
				break;
		
		case 4: System.out.println("El lado opuesto es TRES");
				break;
		
		case 5: System.out.println("El lado opuesto es DOS");
				break;
		
		case 6: System.out.println("El lado opuesto es UNO");
				break;
		default: System.out.println("ERROR, numero incorrecto");
		
		
		
		
		
		}

	}

}
