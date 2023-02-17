package com;

public class Ciclos5_MOD {

	public static void main(String[] args) {
		// Ejercicio 5 - Simular el comportamiento de un reloj digital, 
		// imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		int horas, minutos, segundos;
		
		System.out.println("----------------------------------");
		System.out.println("|      Reloj Digital 24 hrs      |");
		System.out.println("----------------------------------\n");
		
		for (horas=0; horas < 24; horas++) {
			for (minutos=0; minutos < 60; minutos++) {
				for (segundos=0; segundos < 60; segundos++) {
					System.out.printf("%02d:", horas);
					System.out.printf("%02d:", minutos);
					System.out.printf("%02d\n", segundos);
					
					//Ejecuta las funciones cada segundo
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}

}
