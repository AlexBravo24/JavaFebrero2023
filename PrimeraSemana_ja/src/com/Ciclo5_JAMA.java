package com;

public class Ciclo5_JAMA {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		for (int h=0; h <= 23; h++) {
			for (int m=0; m <= 59; m++) {
				for (int s=0; s <= 59; s++) {
			System.out.println(h +":"+ m +":"+ s+":"); // Imprime la hora
		 try {
             Thread.sleep(1000); //El valor es en milisegundos y sirve para descansa un segundo
         } catch(InterruptedException espera) {
		espera.printStackTrace();
         }

				}
			}
		}
	}
}
