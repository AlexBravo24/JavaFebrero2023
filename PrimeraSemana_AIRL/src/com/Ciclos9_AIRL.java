/*9. Programa Java que lea dos números y muestre los números pares entre ellos*/
package com;

import java.util.Scanner;

public class Ciclos9_AIRL {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		int n1, n2, menor, mayor;
		
		System.out.print("Digita el primer número: ");
		n1 = entrada.nextInt();
		System.out.print("Digita el segundo número: ");
		n2 = entrada.nextInt();
		
		if(n1 > n2) {
			mayor = n1;
			menor = n2;
			for(int i=menor; i<=mayor; i++) {
				if(i%2 == 0) {
				   System.out.println(i);
				}
			}
		}else if(n2 > n1){
			mayor = n2;
			menor = n1;
			for(int i=menor; i<=mayor; i++) {
				if(i%2 == 0) {
					   System.out.println(i);
					}
			}
		}else {
			System.out.println("Los numeros tienen que se diferentes");
		}
	}

}
