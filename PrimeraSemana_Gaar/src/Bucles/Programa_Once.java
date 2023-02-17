package Bucles;

import java.util.Scanner;

public class Programa_Once {
   public static void main(String[] args) {
	 @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	 int Alto, Ancho;
	  System.out.println("Ingrese El Alto : ");
	  Alto = sc.nextInt();
	  System.out.println("Ingrese El Ancho : ");
	  Ancho = sc.nextInt();
	   
   	 for(int i=0; i<=Alto; i++)
   	 {
   	  for(int j=0; j<=Ancho; j++)
   	  {
   		 System.out.print("* "); 
   	  }
   	  System.out.println();
   	 }
 	   
 }
}
