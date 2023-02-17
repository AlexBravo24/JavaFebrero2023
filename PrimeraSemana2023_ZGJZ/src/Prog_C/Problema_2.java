/*Realiza un programa que pida un número por teclado y nos indique si es par o impar*/

package Prog_C;
import java.util.Scanner;


public class Problema_2 {


	 public static void main(String[] args) {
		 
	 Scanner entrada = new Scanner(System.in);
	 
		 
		 int num1,num2;
		 
		
		    System.out.println("Introduce dos numeros:");
		    
           num1 = entrada.nextInt();		   
           num2 = entrada.nextInt();	
	
           if(num1 % 2 ==0){
        	   System.out.println("el numero 1 es par");
        	   }
        	   else{

        	   System.out.println("el numero 1 no es par");

        	   }
           
           if(num2 % 2 ==0){
        	   System.out.println("el numero 2 es par");
        	   }
        	   else{

        	   System.out.println("el numero 2 no es par");

        	   }

     }  
}
