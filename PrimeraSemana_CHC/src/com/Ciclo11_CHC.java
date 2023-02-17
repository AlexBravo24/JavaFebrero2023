package com;

import java.util.Scanner;

//EJERCICIO 11
//1.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
//ancho y el alto. Ejemplo: 8 x 8 


public class Ciclo11_CHC {

	public static void main(String[] args) {
	
 int valor;
 System.out.println("Ingrese el tamaño del cuadrado: ");
 Scanner entrada= new Scanner(System.in);
 valor= entrada.nextInt();
 
 if(valor >=2 && valor<=50) {
     
     for(int i=0; i<valor; i++) {
    	 for(int lado = 0; lado <valor ; lado++) {
    	 System.out.print("*"); 	 
     }
     System.out.println("");// salto de línea 
	}			

 }
	}
}

	


