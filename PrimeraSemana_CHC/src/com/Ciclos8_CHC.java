package com;

import java.util.Scanner;

//EJERCICIO 8
//Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
//mayor
      public class Ciclos8_CHC {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	 int numero1, numero2, menor, mayor;
	       
        do { //Lectura de dos n�meros enteros distintos
            System.out.print("Introduce un n�mero entero: ");
            numero1 = entrada.nextInt();
            System.out.print("Introduce otro n�mero entero distinto del anterior: ");                   
            numero2 = entrada.nextInt();
            if(numero1 == numero2){ //En caso de que los 2 n�meros sean iguales, se debe lanzar un mensaje 
                System.out.println("Debes introducir dos n�meros distintos");
            }
        } while (numero1 == numero2);
       
        //Calcular cu�l de los n�meros es el mayor y cu�l el menor
        if (numero1 > numero2) {//si el numero 1 es mayor al n�mero 2 entonces el n�mero 1 es mayor
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2; //Si el n�mero 2 es mayor al n�mero 1 entonces el n�mero 2 es mayor 
            menor = numero1;
        }
       
        
        System.out.println("\nN�meros desde " + menor + " hasta " + mayor + " : ");// Para mostrar por pantalla los n�meros desde el menor hasta el mayor.
        for (int i = menor; i <= mayor; i++) { //Mostrar� los n�meros ordenados desde el menor hasta el mayor 
            System.out.println(i);
        }
    }


	}


