/*1.1.Realiza un programa que reciba dos números por teclado e
 *  indique cuál es mayor o si son iguales.
 */

 
package Prog_C;

import java.util.Scanner;

public class Problema_1 {
	
	
	
	 public static void main(String[] args) {
		 
	 Scanner entrada = new Scanner(System.in);
	 
		 
		 int num1,num2;
		 
		
		    System.out.println("Introduce dos numeros:");
		    
            num1 = entrada.nextInt();		   
            num2 = entrada.nextInt();	
       
            
		 if(num1 > num2) {
			 
			System.out.println("El numero  1 es mayor que el 2");
			
		 }if(num2 > num1){
				
			 System.out.println("el numero 2 es mayor que el numero 1:");
			 
			    }	
		 	
		    if(num1 == num2) {
	       		 
	       		 System.out.println("ambos numeros son iguales");
	       	      }
	            else {
	             System.out.println("ambos numeros son diferentes");
	            }
	       	    
	            
	
}
		 
}
		 
		 

	 
	
	 
	


