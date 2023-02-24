package com;
//PROBLEMA 1

import java.util.Scanner;

//Programa un algoritmo que realice la tabla de multiplicar del 12
public class Ciclos1_iniciales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero positivo: ");    //Entrada del usuario            
        n = entrada.nextInt(); //Variable n 
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){ //Incrementar en 1 el valor de la variable i 
             System.out.println(n + " * " + i + " = " + n*i);// concatenación para dar formato al resultado                                                    
        }
    }
}