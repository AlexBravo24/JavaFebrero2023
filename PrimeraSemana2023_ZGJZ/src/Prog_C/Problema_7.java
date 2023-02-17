package Prog_C;
import java.util.Scanner;

public class Problema_7 {
		
		public static void main(String[] args) {
			
			try (Scanner entrada = new Scanner(System.in)) {
				
				  int alumnos;
				  int costo= 4000;
				  int x;
				  
				  System.out.println("\n Introduce el numero de alumnos :");
				  alumnos = entrada.nextInt();
				  
				  
				  if (alumnos >= 100){
					  		       
				       System.out.println("el costo es de 65 euros");
				  }
				          
				  if (alumnos <= 30 ){
				       
					  System.out.println("el costo es de $ "+costo);
				       
				  }
				  if(alumnos>=50 && alumnos<99)
				 {
					  System.out.println("el costo es de 70 euros");
				 }
				  if(alumnos>=39 && alumnos<49)
				     {
				    	  System.out.println("el costo es de 95 euros");
				     }
			}


		}


	}






