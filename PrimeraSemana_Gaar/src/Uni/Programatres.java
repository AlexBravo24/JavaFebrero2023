package Uni;

import java.util.Scanner;

//Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//caracteres.
public class Programatres {
   public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	   String frase;
	   
	   System.out.println("Ingresa Una Frase : ");
		frase = sc.nextLine();
		char vec[] = new char[frase.length()];
		  
	     for (int i = 0; i < frase.length(); i++) {
	    	
	    	  vec[i]=frase.charAt(i);
	                                               }
            System.out.println(vec);	    

   }
}
