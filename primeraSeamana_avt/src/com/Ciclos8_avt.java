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
	            System.out.println("Introduce un n�mero entero: ");
	            numero1 = entrada.nextInt();
	            System.out.print("Introduce un segundo n�mero entero distinto del anterior: ");                   
	            numero2 = entrada.nextInt();
	            if(numero1 == numero2){
	                System.out.println("Debes introducir dos n�meros distintos");
	            }
	        } while (numero1 == numero2);
	       
	        //Calcular cu�l de los n�meros es el mayor y cu�l el menor
	        if (numero1 > numero2) {
	            mayor = numero1;
	            menor = numero2;
	        } else {
	            mayor = numero2;
	            menor = numero1;
	        }
	       
	        //Mostrar por pantalla los n�meros desde el menor hasta el mayor.
	        System.out.println("\nN�meros desde " + menor + " hasta " + mayor + " : " );
	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }

	}

}
