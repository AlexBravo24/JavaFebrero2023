package com;

import java.util.Scanner;

public class Ejercicio3_JAMA {

	public static void main(String[] args) {
		//EJERCICIO 3 - Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
		//segundo número es 0, debe mostrar un mensaje de error
		
		int numero; 
		int numero2;
		int resultado;

		
	
		//introducir el primer numero
		Scanner entrada = new Scanner (System.in); 
		System.out.println("introduce el primer numero"); 
		numero = entrada.nextInt();
						
		//introducir el segundo numero
		Scanner entrada2 = new Scanner (System.in); 
		System.out.println("introduce el siguiente numero"); 
		numero2 = entrada2.nextInt();
		
		resultado = numero/numero2;
		if(resultado<=0) {
			System.out.println("!ALERTA EL RESULTADO ES 0 O MENOR¡ ");
		}else {
			System.out.println("La division de"  + numero + " / " + numero2 + " = " + resultado);
		}
		
		
		
		
		
		
		
		

	}

}
