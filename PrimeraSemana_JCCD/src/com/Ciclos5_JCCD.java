package com;

public class Ciclos5_JCCD {

	public static void main(String[] args) {
		// Ejercicio Ciclos 5
		//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas 
		
		for (int H = 0; H<=23; H++) {
			for (int M = 0; M<=59; M++) {
				for(int S = 0; S<=59; S++) {
					System.out.println(H + ":"+ M + ":" + S);
				}
				
			}
		}
		
	}

}
