package Prog_C;
import java.util.Scanner;
public class Problema_10 {

	 public static void main(String[] args) {

		 Scanner entrada = new Scanner(System.in);
		 
			int x;
			 x=0;

			 System.out.println("Introduce un num para saber que dia es:\n");
			 x = entrada.nextInt();		   

			 if (x >= 8){
			 	
			 	System.out.println("error:\n");
			 }

			 switch(x)
			 {
			 case 0:
			 {
			   System.out.println("null ");
			   break;
			 }


			 case 1:
			 {
			   System.out.println(" enero ");
			   break;
			 }

			 case 2:
			 {
			   System.out.println("febrero  ");
			   break;
			 }

			 case 3:
			 {
			   System.out.println("marzo  ");
			   break;
			 }

			 case 4:
			 {
			   System.out.println("abril ");
			   break;

			 }
			 case 5:
			 {
			   System.out.println("mayo ");
			   break;

			 }
			 case 6:
			 {
			   System.out.println("junio ");
			   break;
			 }

			 case 7:
			 {
			   System.out.println("julio");
			   break;
			     }
			 case 8:
			 {
			   System.out.println("agosto");
			   break;
			     }
			 case 9:
			 {
			   System.out.println("septiembre");
			   break;
			     }
			 case 10:
			 {
			   System.out.println("octubre");
			   break;
			     }
			 case 11:
			 {
			   System.out.println("noviembre");
			   break;
			     }
			 case 12:
			 {
			   System.out.println("diciembre");
			   break;
			     }
		
	       }
	
		}
	 }
	

