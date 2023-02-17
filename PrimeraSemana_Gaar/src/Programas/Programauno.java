package Programas;

import java.util.Scanner;

//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales

public class Programauno {
 
	public static void main(String [] args) {
		 @SuppressWarnings({ "resource" })
	Scanner sc = new Scanner(System.in);
	  
	int Numero1=0, Numero2=0;
	 
	 
	 System.out.println("Ingresa Numero uno : ");
	 Numero1= sc.nextInt();
	 System.out.println("Ingresa Numero Dos : ");
	 Numero2= sc.nextInt();
	 
	   if(Numero1 == Numero2)
	   {
		   System.out.println("Los Numeros Tienen El Mismo Valor : "+ "Numero Uno "+ Numero1 +" Y Numero Dos "+ Numero2);
	   }
	   else if(Numero1>Numero2)
	   {
		   System.out.println("El Numero Uno "+ Numero1 + "Es Mayor Al Numero Dos " + Numero2);
	   }
	   else
	   {
		   System.out.println("El Numero Dos "+ Numero2 + "Es Mayor Al Numero Uno " + Numero1);
	   }
	 
	 
                                            }
}
