package Programas;
//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
//parámetros: edad, nota y sexo.
//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//* Otros casos -> NO ACEPTADA

import java.util.Scanner;

public class Programacinco {
	
	public static void main(String [] args) {
		 @SuppressWarnings({ "resource" })
	Scanner sc = new Scanner(System.in);
	  
	int Edad=0, Nota=0;
	char Sexo;
	 
	 
	 System.out.println("Ingresa Edad : ");
	 Edad = sc.nextInt();
	 System.out.println("Ingresa Nota : ");
	 Nota = sc.nextInt();
	 System.out.println("Ingresa Sexo : ");
	 Sexo = sc.next().charAt(0);
	   
	 if(Nota >=5 && Edad==18 && Character.compare(Sexo,'M') == 0 )
	 {
		 System.out.println("POSIBLE ");
	 }
	 else if(Nota >=5 && Edad==18 && Character.compare(Sexo,'F') == 0 )
	 {
		 System.out.println("ACEPTADA ");
	 }
	 else
	 { 
		 System.out.println(" NO ACEPTADA ");
	 }

  }
}
