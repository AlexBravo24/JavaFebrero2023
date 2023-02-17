package com;

import java.util.Scanner;

public class Ciclos12_EAAB {

	public static void main(String[] args) {
	// Se ingresan un conjunto de n edades de personas por teclado. 
	//El programa finalizara cuando el promedio de las edades sea superior a 25.
		
		Scanner entrada = new Scanner(System.in);
		
		int edad, suma=0, cont=0;
		float promedio;
		
		System.out.print("Ingrese una edad: "); //se pide primeramente la edad y se almacena
		edad= entrada.nextInt();				//no se evalua ya que para realizar el promedio
		cont++;									// se requiere almenos 2 valores
		suma = suma + edad;
		
		
		do {
		System.out.print("Ingrese una edad: ");
		edad= entrada.nextInt();
		cont++;
		suma = suma + edad;
		promedio = suma/cont;
		
		System.out.println("* El promedio es "+promedio);
		
		}while(promedio<=25);
		entrada.close();
		System.out.println("FIN. promedio "+promedio+" mayor a 25");
		

	}

}
