package com;

import java.util.Scanner;

public class Ejercicio13_MOD {

	public static void main(String[] args) {
		// Ejercicio 13 -
		/*
		 * Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños y el resto se invierte en la bolsa.
			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños y el resto se invierte en la bolsa.
			La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		 */
		double donativo, salud, comedor, bolsa;
		
		System.out.println("-------------------------------------------");
		System.out.println("|      Distribución de los donativos      |");
		System.out.println("-------------------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el donativo recibido: ");
		donativo = entrada.nextDouble();
		
		entrada.close();
		
		if (donativo >= 10000) {
			salud = donativo * 0.3;
			comedor = donativo * 0.5;
			bolsa = donativo - salud - comedor;
			System.out.println("\nDistribución de fondos\n" + 
								"\nLos fondos destinados a servicios de sslud: $" + salud + 
								"\nLos fondos destinados al servicio de comedor: $" + comedor + 
								"\nLos fondos para la bolsa: $" + bolsa);
		} else if(donativo > 0 && donativo < 10000) {
			salud = donativo * 0.25;
			comedor = donativo * 0.6;
			bolsa = donativo - salud - comedor;
			System.out.println("\nDistribución de fondos\n" + 
								"\nLos fondos destinados a servicios de sslud: $" + salud + 
								"\nLos fondos destinados al servicio de comedor: $" + comedor + 
								"\nLos fondos para la bolsa: $" + bolsa);
		}else {
			System.out.println("\nError: verifique sus datos!");
		}
		
	}

}
