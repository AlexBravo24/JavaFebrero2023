package Programas;
//realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado 
//obtenido.
//Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
//�ERROR: n�mero incorrecto�.

import java.util.Scanner;

public class Programaocho {

	  public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dado;
		System.out.println("Ingresa Un Numero Del 1 - 6 :");
		dado = sc.nextInt();
		
		switch(dado){
			case 1:  System.out.println("6"); break;
			case 2:  System.out.println("5"); break;
			case 3:  System.out.println("4"); break;
			case 4:  System.out.println("3"); break;
			case 5:  System.out.println("2"); break;
			case 6:  System.out.println("1"); break;
			default: System.out.println("ERROR DATO NO VALIDO"); break;
		}
		
	}
	
}
