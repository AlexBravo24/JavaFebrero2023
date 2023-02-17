package Prog_C;
import java.util.Scanner;


public class Problema_12 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);

		
		float peso, altura;
		float x;
		
		 System.out.println("Introduce tu peso:\n");
		peso  = entrada.nextFloat();
		
		 System.out.println("Introduce tu altura:\\n");
		altura  = entrada.nextFloat();
		
		x = peso / altura * 2;
		
	
		if( x >=16 && x<17){
			
			System.out.println("criterio de uingreso al hospital");
		}
		
		if(x ==16 ) {
			
			System.out.println("criterio de uingreso al hospital");
			
		}
		
	   if(x >=16 && x <17) {
			
			System.out.println(" bajo peso");
			
		}
	   
	   if(x >=18 && x <25) {
			
			System.out.println(" peso normal ");
			
		}
	   
	   if(x >=25 && x <30) {
			
			System.out.println(" sobre peso ");
			
		}
	   
	   if(x >=30 && x <35) {
			
			System.out.println(" sobre peso cronico ");
			
		}
	   
	   
	   if(x >=35 && x <40) {
			
			System.out.println("obesidad premorbida");
			
		}
	   
	   if(x >40) {
			
			System.out.println("obesidad moorbida");
			
		}
	}


	
	
}
