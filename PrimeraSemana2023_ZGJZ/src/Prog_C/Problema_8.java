package Prog_C;
import java.util.Scanner;

public class Problema_8 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	
	int cara;
	int x;

	
	 System.out.println("Introduce el numero de cara:");
	    
     x = entrada.nextInt();		 
     
		
     if( x==1 ) {
    	 
    	 System.out.println(" la cara contraria es 6");
     }

         if( x==2 ) {
        	 
        	 System.out.println(" la cara contraria es 5");
        	 
         }
        	 
             if( x==3 ) {
            	 
            	 System.out.println(" la cara contraria es 4");
            	 
             }
             
             if( x>=6 ) {
            	 
            	 System.out.println(" error");
            	 
             }
              if( x<=1 ) {
            	 
            	 System.out.println(" error");
            	 
             }
     }
             
  }

