/*1.- Programa un algoritmo que realice la tabla de multiplicar del 12 */
package com;

public class Ciclos1_MGAV {

	public static void main(String[] args) {
		int numero=12, mult;
		
		for(int i=0; i<11; i++) {
			mult = numero * i;
			System.out.println(numero+" x " +i+ "= "+mult);
		}

	}

}
