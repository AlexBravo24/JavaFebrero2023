package com;

import java.util.Scanner;

public class Ciclos9_avt {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int A, B;

	        //Lectura de dos n?meros enteros A Y B
	        //A debe ser menor que B
	        do {
	            System.out.println("Introduce un n?mero entero: ");
	            A = sc.nextInt();
	            System.out.println("Introduce otro n?mero entero mayor que el anterior: ");
	            B = sc.nextInt();
	            if (A >= B) {
	                System.out.println("El segundo n?mero debe ser mayor que el primero");                  
	            }
	        } while (A >= B);


	        //Mostrar los n?meros pares entre A y B.
	        System.out.println("\nN?meros pares desde " + A + " hasta " + B + " : ");
	        for (int i = A; i <= B; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }

	}

}
