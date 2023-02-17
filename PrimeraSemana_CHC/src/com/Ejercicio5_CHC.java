package com;

import java.util.Scanner;

public class Ejercicio5_CHC {
//EJERCICIO 5
	
	/*Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
*parámetros: edad, nota y sexo.
* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
* Otros casos -> NO ACEPTADO
	 */
/*Si (sexo es distinto a «M» y sexo es distinto a «F»)
*-> Error, el valor introducido para sexo es incorrecto.
*Si (sexo = M y nota >= 5 y edad >= 18)
*-> POSIBLE
*Si (sexo = F y nota >= 5 y edad >= 18)
*-> ACEPTADA
*Si no
* NO ACEPTADA
 */	
	
	
	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
     int nota; //DECLARAMOS LAS VARIABLES
     int edad;
     String sexo;
     System.out.print("Edad: "); //Introducir edad
     edad = scanner.nextInt();
     System.out.print("Nota: "); //Introducir Nota
     nota = scanner.nextInt(); scanner.nextLine();
     System.out.print("Sexo (M o F): "); //Introducir Sexo
     sexo = scanner.nextLine();

     if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
         System.out.println("El valor de sexo introducido es incorrecto.\n"
             + "por favor, reenvíe el formulario.");
       } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
         System.out.println("POSIBLE");
       }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
          System.out.println("ACEPTADA");
       }else {
           System.out.println("NO ACEPTADA");
       }

         }
         }
