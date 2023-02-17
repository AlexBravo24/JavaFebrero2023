package com;

public class Ciclos6_EAAB {

	public static void main(String[] args) {
//		Una persona desea invertir $1000.00 en un banco, 
//		el cual le otorga un 2% de interés mensual. ¿Cuál será la 
//		cantidad de dinero que esta persona tendrá al cabo de un año 
//		si todo el dinero lo reinvierte?
		float capital=1000;
		
		
		System.out.println("Con inversion inicial: $1000.00 al 2% mensual de rendimientos,");
		
		
		for(int i = 1; i<=12;i++) {
			capital= capital + (capital*0.02f);
			System.out.println("Capital al mes "+i+": $"+capital);
		}
		
		System.out.println("\nAl cabo de un año el capital sera de $"+capital);
	}

}
