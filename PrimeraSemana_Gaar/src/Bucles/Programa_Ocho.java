package Bucles;

import java.util.Scanner;

//. Programa Java que lea dos números y muestre los números desde el menor hasta el 
//mayor 
public class Programa_Ocho {
	public static void main(String[] args) {
	 @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	 int Numero1, Numero2;
	 
     System.out.println("Ingresa El Primer Numero : ");
     Numero1 = sc.nextInt();
     System.out.println("Ingresa El Segundo Numero : ");
     Numero2 = sc.nextInt();
     System.out.println("\n\n\n");
		if(Numero1 >= Numero2)
		{
			for(int i=Numero2; i<=Numero1; i++)
			{
				System.out.println(i);
			}
		}
		else
		{
			for(int i=Numero1; i<=Numero2; i++)
			{
				System.out.println(i);
			}
		}
		
	}
}
