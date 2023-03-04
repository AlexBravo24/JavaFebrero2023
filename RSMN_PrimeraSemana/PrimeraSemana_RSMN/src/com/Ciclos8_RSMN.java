package com;

import java.util.Scanner;

public class Ciclos8_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);
	        int numero1, numero2, menor, mayor;
	       
	        
	        do {
	            System.out.print("Introduce un número entero: ");
	            numero1 = sc.nextInt();
	            System.out.print("Introduce otro número entero distinto del anterior: ");                   
	            numero2 = sc.nextInt();
	            if(numero1 == numero2){
	                System.out.println("Debes introducir dos números distintos");
	            }
	        } while (numero1 == numero2);
	       
	        
	        if (numero1 > numero2) {
	            mayor = numero1;
	            menor = numero2;
	        } else {
	            mayor = numero2;
	            menor = numero1;
	        }
	       
	       
	        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }
	    
	
	}

	public static void imprime(String mt_text){
		System.out.println(mt_text);
	}
}
