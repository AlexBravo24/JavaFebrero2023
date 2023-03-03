package com;

import java.util.Scanner;

public class Ciclos8_avt {

	public static void main(String[] args) {
		int numero1=0;
		int numero2=0;
		int mayor=0;
		int menor=0;
		Scanner entrada = new Scanner(System.in);
		
		 do {
	            System.out.println("Introduce un número entero: ");
	            numero1 = entrada.nextInt();
	            System.out.print("Introduce un segundo número entero distinto del anterior: ");                   
	            numero2 = entrada.nextInt();
	            if(numero1 == numero2){
	                System.out.println("Debes introducir dos números distintos");
	            }
	        } while (numero1 == numero2);
	       
	        //Calcular cuál de los números es el mayor y cuál el menor
	        if (numero1 > numero2) {
	            mayor = numero1;
	            menor = numero2;
	        } else {
	            mayor = numero2;
	            menor = numero1;
	        }
	       
	        //Mostrar por pantalla los números desde el menor hasta el mayor.
	        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : " );
	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }

	}

}
