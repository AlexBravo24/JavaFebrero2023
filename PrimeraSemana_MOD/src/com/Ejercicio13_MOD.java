package com;

import java.util.Scanner;

public class Ejercicio13_MOD {

	public static void main(String[] args) {
		// Ejercicio 13 -
		/*
		 * Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os y el resto se invierte en la bolsa.
			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de ni�os y el resto se invierte en la bolsa.
			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		 */
		double donativo, salud, comedor, bolsa;
		
		System.out.println("-------------------------------------------");
		System.out.println("|      Distribuci�n de los donativos      |");
		System.out.println("-------------------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el donativo recibido: ");
		donativo = entrada.nextDouble();
		
		entrada.close();
		
		if (donativo >= 10000) {
			salud = donativo * 0.3;
			comedor = donativo * 0.5;
			bolsa = donativo - salud - comedor;
			System.out.println("\nDistribuci�n de fondos\n" + 
								"\nLos fondos destinados a servicios de sslud: $" + salud + 
								"\nLos fondos destinados al servicio de comedor: $" + comedor + 
								"\nLos fondos para la bolsa: $" + bolsa);
		} else if(donativo > 0 && donativo < 10000) {
			salud = donativo * 0.25;
			comedor = donativo * 0.6;
			bolsa = donativo - salud - comedor;
			System.out.println("\nDistribuci�n de fondos\n" + 
								"\nLos fondos destinados a servicios de sslud: $" + salud + 
								"\nLos fondos destinados al servicio de comedor: $" + comedor + 
								"\nLos fondos para la bolsa: $" + bolsa);
		}else {
			System.out.println("\nError: verifique sus datos!");
		}
		
	}

}
