package Programas;
//.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

import java.util.Scanner;

public class Programadoce {
  public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    float peso,altura,Imc;
        
	    System.out.println("Ingresa El Peso (Ejemplo 76) :");
	    peso = sc.nextFloat();
	    System.out.println("Ingresa La Altura (cm)(Ejemplo 1.89) :");
	    altura = sc.nextFloat();
	    
	    Imc = (peso)/(altura*altura);
		System.out.println(Imc);
		
		if(Imc > 40)
		{
			System.out.println("OBESIDAD MORBIDA GRADO IV ");
		}
		else if(Imc >= 35 && Imc <=40 )
		{
			System.out.println("OBESIDAD PREMORBIDA GRADO III");
		}
		else if(Imc >= 30 && Imc <35 )
		{
			System.out.println("SOBREPESO CRONICO GRADO II");
		}
		else if(Imc >= 25 && Imc <=30 )
		{
			System.out.println("SOBREPESO GRADO I");
		}
		else if(Imc >= 18 && Imc <25 )
		{
			System.out.println("PESO NORMAL ");
		}
		else if(Imc >= 17 && Imc <18 )  // Imc == 17
		{
			System.out.println("BAJO PESO ");
		}
		else if(Imc >= 16 && Imc <17 )     // Imc == 16
		{
			System.out.println("INFRAPESO");
		}
		else if(Imc < 16 )  
		{
			System.out.println("CRITERIO DE INGRESO A HOSPITAL");
		}
		else
		{
			System.out.println("Datos No Validos");
		}
		
} 	
 
}
