package Bucles;

import java.util.Scanner;

//programa que lea 20 números e indique si son positivos o negativos y pares o 
//impares y además muestre la sumatoria de los positivos y sumatoria de los impares
public class Programa_Diez {
    public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numero=0, sumpos=0, sumimp=0;
    	
    	for(int i =1; i<=20; i++)
    	{
    		System.out.println("Ingresa Numero "+numero+" :");
    		numero = sc.nextInt();
    		
    		if(numero>0)
    		{
    			System.out.println("El numero : "+numero+" Es Positivo");
    			sumpos += numero;
    		}
    		else
    		{
    			System.out.println("El numero : "+numero+" Es negativo");
    		}
    		
    		if( numero % 2 == 0 )
    		{
    			System.out.println("El numero : "+numero+" Es Par");
    			
    		}
    		else
    		{
    			System.out.println("El numero : "+numero+" Es ImPar");
    			sumimp += numero;
    		}
    		
    	}
    	
    	System.out.println("\n\n\n\nSumatoria Total De Impares : "+sumimp);
    	System.out.println("Sumatoria Total De Positivos : "+sumpos);
    	
	}
}
