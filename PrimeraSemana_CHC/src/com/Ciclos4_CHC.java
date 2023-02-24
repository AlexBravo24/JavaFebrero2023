package com;

import java.util.Scanner;

//EJERCICIO 4
// 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//“Carácter no encontrado”. 

public class Ciclos4_CHC {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
  String frase;
  char letra;
  int total= 0;
  
  System.out.println("Ingrese una frase: ");
  frase= entrada.nextLine();
  System.out.println("Ingresa la letra que quieres contar:");
  letra=entrada.next().charAt(0);
  
  for (int i=0; i< frase.length(); i++);{
	  
  }
  total++;
  
  System.out.println("La letra " + letra + "  aparece " +total +" veces");
}
}

	


