/*
 * 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. 
 * ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?
 */
package com;

public class Ciclos7_MGAV {

	public static void main(String[] args) {
		float dinero = 700f, inversion;
		int j = 1;
		
		do {		
			inversion = ((dinero * .02f) * j)+dinero;
			j++;
			System.out.println(inversion);
		}while(inversion < 1500);
		
		System.out.println("Los meses necesarios para recibir mas de 1500 son: "+(j-1));

	}

}
