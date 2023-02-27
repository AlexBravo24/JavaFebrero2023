/*9.Realiza un programa que pida el día de la semana (del 1 al 7) 
 * y escriba el día correspondiente. Si introducimos otro número nos da un error.
 */
package com;

import java.util.Scanner;

public class Ejercicio9_MGAV {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digita un numero: ");
		num = entrada.nextInt();
		
		
		switch(num) {
			
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
				default:
					System.out.println("Debes ingresar un número entre 1 y 7");			
		}

	}

}
