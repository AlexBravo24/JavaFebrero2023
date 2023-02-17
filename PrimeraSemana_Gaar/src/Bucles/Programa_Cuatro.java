package Bucles;
//Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//“Carácter no encontrado”. 
import java.util.Scanner;

public class Programa_Cuatro {
  public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	String frase;
	char letra;
	int total = 0;
	
	System.out.println("Ingresa Una Frase : ");
	frase = sc.nextLine();
	System.out.println("Ingresa Una letra : ");
	letra = sc.next().charAt(0);
	  
     for (int i = 0; i < frase.length(); i++) {
    	 
         if (frase.charAt(i) == letra)
         {
             total++;
         }
                                               }
     System.out.println("Total De Veces : "+total);

   }
}
