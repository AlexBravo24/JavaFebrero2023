package Uni;

import java.util.Scanner;

//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
//1 al 100. Obt�n la suma de todos ellos y la media
public class Programados {
   public static void main(String[] args) {
	   @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float num[] = new  float[100];
		float acum=0;
		for(int i = 0; i<5; i++)
		{
			System.out.println("Ingresa Numero "+(i+1)+" :");
			num[i]= sc.nextFloat();
			acum += (num[i]);
			
		}
		System.out.println("La Suma Total Es : "+acum+ " Y La Media Es : "+(acum /= 5));
		
  }
}
