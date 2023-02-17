package Bucles;

import java.util.Scanner;

public class Programa_Doce_Doce {
	 public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			 float prom=0,edad=0,Operacion=0;
			 int personas;
			    System.out.println("Ingresa El Numero De Personas : ");
			    personas = sc.nextInt();
			    for(int i=1; i<=personas; i++)
			    {
				System.out.println("Ingresa Edad "+i+" :");
				edad = sc.nextInt();
				Operacion = Operacion + edad;
				prom=Operacion / personas;
				
			    if ( prom >= 25)
			    {
			    	 System.out.println("Promedio Total : "+Operacion+" / "+personas+ " = "+prom);
			    	 
			    }
			   
		    }
		}
}
