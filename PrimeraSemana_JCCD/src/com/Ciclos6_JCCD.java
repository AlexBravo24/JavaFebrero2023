package com;

public class Ciclos6_JCCD {

	public static void main(String[] args) {
		// Ejercicio Ciclos 6
		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		//todo el dinero lo reinvierte?
		
		double deposito = 1000;
		int mes = 1;
		
		while (mes<12) {
			
			deposito = deposito*1.02;
			
			mes++;
		}
		
		System.out.println("El total ganado despues de un mes es: " + deposito);
		
//		for (int i = 0; i<=12; i++) {
//			
//			
//		}

	}

}
