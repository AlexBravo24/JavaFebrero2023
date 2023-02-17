package com;

public class Ciclos5_AIRL {

	public static void main(String[] args) {
		
		int hora = 0, minutos = 0, seg = 0;
		for(int i=0; i<24; i++) {//horas
			for(int j=0; j<60; j++) {//minutos
				
				for(int k=0; k<60; k++) {//segundos
					seg = k;
					System.out.println(hora+":"+minutos+":"+seg);
				}
				
				minutos = j;
			}
			hora = i;

		}
		

	}

}
