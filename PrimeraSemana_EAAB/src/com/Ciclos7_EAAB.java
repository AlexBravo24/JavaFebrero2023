package com;

public class Ciclos7_EAAB {

	public static void main(String[] args) {
//		Una persona desea invertir $700.00 en un banco, 
//		el cual le otorga un 2% de interés mensual. 
//		¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?

		float capital=700;
		int i=1;
		
		
		System.out.println("Con inversion inicial: $700.00 al 2% mensual de rendimientos,");
		
		
		while(capital<1500) {
			capital= capital + (capital*0.02f);
			System.out.println("Capital al mes "+i+": $"+capital);
			i++;
		}
		
		System.out.println("\nAl cabo de "+(i-1)+" meses el capital sera de $"+capital);
		
	}

}
