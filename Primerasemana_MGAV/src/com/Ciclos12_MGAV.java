/*12.Se ingresan un conjunto de n edades de personas por teclado. 
 * El programa finalizara cuando el promedio de las edades sea superior a 25.
 */
package com;

import java.util.Scanner;

public class Ciclos12_MGAV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int edad, cont=0, sum=0;
		double promedio;
		
		do {
			System.out.print("Digita tu edad: ");
			edad = entrada.nextInt();
			cont++;
			sum+=edad;
			promedio = sum/cont;		
		}while(promedio < 25);
		
		System.out.println("Ingresaste "+cont+" edades y el promedio es: "+promedio);
	}

}
