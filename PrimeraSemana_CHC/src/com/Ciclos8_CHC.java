package com;

import java.util.Scanner;

//EJERCICIO 8
//Programa Java que lea dos números y muestre los números desde el menor hasta el 
//mayor
      public class Ciclos8_CHC {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	 int numero1, numero2, menor, mayor;
	       
        do { //Lectura de dos números enteros distintos
            System.out.print("Introduce un número entero: ");
            numero1 = entrada.nextInt();
            System.out.print("Introduce otro número entero distinto del anterior: ");                   
            numero2 = entrada.nextInt();
            if(numero1 == numero2){ //En caso de que los 2 números sean iguales, se debe lanzar un mensaje 
                System.out.println("Debes introducir dos números distintos");
            }
        } while (numero1 == numero2);
       
        //Calcular cuál de los números es el mayor y cuál el menor
        if (numero1 > numero2) {//si el numero 1 es mayor al número 2 entonces el número 1 es mayor
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2; //Si el número 2 es mayor al número 1 entonces el número 2 es mayor 
            menor = numero1;
        }
       
        
        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");// Para mostrar por pantalla los números desde el menor hasta el mayor.
        for (int i = menor; i <= mayor; i++) { //Mostrará los números ordenados desde el menor hasta el mayor 
            System.out.println(i);
        }
    }


	}


