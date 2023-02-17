package Bucles;

import java.util.Scanner;

public class Programa_Tres {
   public static void main(String[] args) {
     @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
     
     String Cadena1,Cadena2;
     System.out.println("Ingresa Cadena De Texto ");
     Cadena1 = sc.nextLine();
     Cadena2 = Cadena1.replaceAll(" ","");
     String Inversion = new StringBuilder(Cadena2.toUpperCase()).reverse().toString(); // Inversion de la cadena como OBJETO
     //System.out.println(Cadena2.toUpperCase()+"  "+Inversion);
     if(Cadena2.toUpperCase().equals(Inversion))
     {
    	 System.out.println("\n Es Palindromo ");
     }
     else
     {
    	 System.out.println(" \n No Es Palindromo ");
     }
     
	   
   //Ateo poco poeta , Sometamos o matemos
	   
   }
}
