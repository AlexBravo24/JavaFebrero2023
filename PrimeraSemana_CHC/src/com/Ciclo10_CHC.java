package com;
//EJERCICIO 10

import java.util.Scanner;

//Programa que lea 20 n�meros e indique si son positivos o negativos y pares o 
//impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares

public class Ciclo10_CHC {

	public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	int numero; //Declaramos que la variable n�mero es de tipo entero 
	
	System.out.println("Introduce un n�mero: ");
	numero=entrada.nextInt(); //Pedimos al usuario que inserte el n�mero 
	
	while (numero!=0 ) {
		
		if (numero>0) { //Condicionamos que si en n�mero es mayor a 0, imprimir mensaje de que es positivo
			System.out.println("El n�mero es Positivo");
			
		} else {
	System.out.println("El n�mero es Negativo"); //En caso contrario, el n�mero ser� negativo 
		}
	if (numero % 2 == 0) {  //Si el n�mero se puede dividir entre dos sin dejar residuo, ser� n�mero par 
		System.out.println("El n�mero es Par");
		
	} else { 
		System.out.println("El n�mero es Impar"); //En caso contrario, el n�mero ser� impar 

	}	System.out.println("Introduce un n�mero (0 detiene el ciclo): ");
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
