package com;
//EJERCICIO 9
//Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
//
import java.util.Scanner;

public class Ciclos9_CHC {

	public static void main(String[] args) {
			 Scanner entrada = new Scanner(System.in);
			    int numero1;
			    int numero2;
			    int menor;
			    int mayor;
			 
			    
			    System.out.println("El programa imprimir� todos los n�meros pares entre los n�meros indicados.");
			    //Solicitamos datos al usuario
			    System.out.print("Introduce el primer n�mero: ");
			    numero1 = entrada.nextInt();
			    System.out.print("Introduce el segundo n�mero: ");
			    numero2 = entrada.nextInt();
			    
			    
			    if (numero1 < numero2) { //Se hacen las comparaciones 
			      menor = numero1;
			      mayor = numero2;
			    } else {
			      menor = numero2;
			      mayor = numero1;
			    }
			   
			    for (int i=menor+1; i < mayor; i++){ //El ciclo para mostrar los n�meros pares entre los n�meros
			      if (i%2==0){
			        System.out.println(i); 
			      }
			    }
			  }
			}
		
