package com;

import java.util.Scanner;

public class Ejercicio11_MOD {

	public static void main(String[] args) {
		// Ejercicio 11 - Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, 
		// América Central, América del Sur, Europa y Asia. 
		// El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida.
		
		double pesoPaquete;
		int zonaUbicacion;
		
		System.out.println("-------------------------------------------");
		System.out.println("|         Transporte Internacional        |");
		System.out.println("-------------------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el peso de su paquete en Kg: ");
		pesoPaquete = entrada.nextDouble();
	
		System.out.println("\nZONA UBICACIÓN           |   COSTO/KILOGRAMO");
		System.out.println("--------------------------------------------");
		System.out.println("1 América del Norte      |   24.00 euros");
		System.out.println("2 América Central        |   20.00 euros");
		System.out.println("3 América del sur        |   21.00 euros");
		System.out.println("4 Europa                 |   10.00 euros");
		System.out.println("5 Asia                   |   18.00 euros");
		System.out.println("--------------------------------------------");
		
		System.out.print("\nIngrese el número de la zona de ubicacion: ");
		zonaUbicacion = entrada.nextInt();
		entrada.close();
		
		System.out.println("");
		
		if (pesoPaquete <= 5 && pesoPaquete > 0) {
			switch(zonaUbicacion) {
			case 1:
				System.out.println("El costo por el envio de su paquete es: " + (pesoPaquete * 24) + " euros");
				break;
			case 2:
				System.out.println("El costo por el envio de su paquete es: " + (pesoPaquete * 20) + " euros");
				break;
			case 3:
				System.out.println("El costo por el envio de su paquete es: " + (pesoPaquete * 21) + " euros");
				break;
			case 4:
				System.out.println("El costo por el envio de su paquete es: " + (pesoPaquete * 10) + " euros");
				break;
			case 5:
				System.out.println("El costo por el envio de su paquete es: " + (pesoPaquete * 18) + " euros");
				break;
			default:
				System.out.println("Zona no valida para realizar envios");
			}
		}else {
			System.out.println("Lo sentimos: "
					+ "\nSu paquete no cumple con los requisitos de peso."
					+ "\nPeso maximo 5kg");
		}
	}

}
