package com;

import java.util.Scanner;

public class Ejercicio1_JAMA {

	public static void main(String[] args) {
		//EJERCICIO 1 - Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
		
		//introducir numeros por teclado
		
		int numero; 
		int numero2;
	
		//introducir el primer numero
		Scanner entrada = new Scanner (System.in); 
		System.out.println("introduce el primer numero"); 
		numero = entrada.nextInt();
						
		//introducir el segundo numero
		Scanner entrada2 = new Scanner (System.in); 
		System.out.println("introduce el siguiente numero"); 
		numero2 = entrada2.nextInt();
		
		//detecta el numero que es mayo y muestra cual es el numero mayo o igual que se a introducido
		if((numero)>(numero2)){
			System.out.println("es mayor el primer numero que es" + numero);
		}else if (numero==numero2){
			System.out.println("El numero introducido es igual, NINGUNO ES MAYOR");
		}else {
			System.out.println("es mayor el segundo numero que es" + numero2);
		}
									
		

		
		
		
		
		
		
		

	}

}
