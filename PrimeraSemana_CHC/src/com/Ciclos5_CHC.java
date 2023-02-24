package com;
//PROBLEMA 5

// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
//de un día desde las 00:00:00 horas hasta las 23:59:59 horas
public class Ciclos5_CHC {

	public static void main(String[] args) {
		for (int h=0; h <= 23; h++) //Para el formato de horas
		for (int m=0; m <= 59; m++) //Para minutos
		for (int s=0; s <= 59; s++) //Para segundos
		System.out.println(h +"h "+ m +"m "+ s+"s"); //Imprimirá la hora en minutos,segundos y horas.
		}
				

	}


