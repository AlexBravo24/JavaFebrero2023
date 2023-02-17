package com;

import java.util.Scanner;

public class Ejercicio13_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		float donacion, salud, comedor, bolsa;
		
		System.out.print("Ingrese la cantidad recibida de la donación anual: ");
		donacion = entrada.nextFloat();
		entrada.close();
		
		if( donacion >= 10000) {
			salud= donacion*0.3f;
			comedor= donacion*0.5f;
			bolsa= donacion*0.2f;
			
		}
		else {
			salud= donacion*0.25f;
			comedor= donacion*0.6f;
			bolsa= donacion*0.15f;
		}
		
		
		System.out.println("Éste año el recurso se destinará:\n"
				+ "Centro de salud - $"+salud +"\nComedor infantil - $"+comedor+"\n"
						+ "Inversion bolsa - $"+bolsa);

	}

}
