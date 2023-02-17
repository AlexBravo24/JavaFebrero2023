package com;
//EJERCICIO 10

import java.util.Scanner;

//Programa que lea 20 números e indique si son positivos o negativos y pares o 
//impares y además muestre la sumatoria de los positivos y sumatoria de los impares

public class Ciclo10_CHC {

	public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	int numero; //Declaramos que la variable número es de tipo entero 
	
	System.out.println("Introduce un número: ");
	numero=entrada.nextInt(); //Pedimos al usuario que inserte el número 
	
	while (numero!=0 ) {
		
		if (numero>0) { //Condicionamos que si en número es mayor a 0, imprimir mensaje de que es positivo
			System.out.println("El número es Positivo");
			
		} else {
	System.out.println("El número es Negativo"); //En caso contrario, el número será negativo 
		}
	if (numero % 2 == 0) {  //Si el número se puede dividir entre dos sin dejar residuo, será número par 
		System.out.println("El número es Par");
		
	} else { 
		System.out.println("El número es Impar"); //En caso contrario, el número será impar 

	}	System.out.println("Introduce un número (0 detiene el ciclo): ");
	       numero=entrada.nextInt();
//    

	 
	//Bucle terminado, mostramos resultados

//  double SumaPar=0;
//  for (int i=0;i <Par.size(); i++) {
//	  double valor=Par.get(i);
//	  SumaPar+=valor;
//	  }
    }
   }
  }
