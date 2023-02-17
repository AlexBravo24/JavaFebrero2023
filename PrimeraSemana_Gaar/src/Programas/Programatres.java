package Programas;

import java.util.Scanner;

//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
//segundo número es 0, debe mostrar un mensaje de error.
public class Programatres {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);
		float Numero1 = 0, Numero2 = 0; 
		
		System.out.println("Ingresa Numero Uno :");
		Numero1 = sc.nextFloat();
		System.out.println("Ingresa Numero Dos :");
		Numero2 = sc.nextFloat();
		
		if(Numero2 == 0)
		{
			System.out.println("No Se Puede Realizar Division Devirdo A Una Indeterminacion Aritmetica");
		}
		else
		{
			System.out.println("Resultado es : "+Numero1/Numero2);
		}
		
	}
	
}
