/*3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
segundo número es 0, debe mostrar un mensaje de error.
 */
package Prog_C;
import java.util.Scanner;

public class Problema_3 {

	
	 public static void main(String[] args) {
		 
		 Scanner entrada = new Scanner(System.in);
		 
			 
	     float num1,num2;
	     float div;
	     
			 
	     System.out.println("Introduce dos numeros:");
			    
	     num1 = entrada.nextFloat();		   
	     num2 = entrada.nextFloat();	
	     
	     div= num1/num2;
	     
	     System.out.println(" el resultado de la division es:\n "+ div);
	     
	     if(num2 == 0) {
	 		
	 		System.out.println("error");
	 		
	 	}
	 	
	
	 }
}
