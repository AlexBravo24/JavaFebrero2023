package Programas;

import java.util.Scanner;

//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
//primeras 40 horas y $20 por cada hora extra.
public class Programacatorce {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int total_horas;
		
		System.out.println("Ingresa EL Total De horas :");
		total_horas = sc.nextInt();
		
		if(total_horas > 40)
		{
			System.out.println("TOTAL A PAGAR : "+((40*16)+((total_horas-40)*20)));
		}
		else if(total_horas <=40 && total_horas >=1 )
		{
			System.out.println("TOTAL A PAGAR : "+total_horas*16);
		}
		else
		{
			System.out.println("DATOS NO VALIDOS");
		}
		
	}

}
