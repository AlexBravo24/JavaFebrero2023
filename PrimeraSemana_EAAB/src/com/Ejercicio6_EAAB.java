package com;

import java.util.Scanner;

public class Ejercicio6_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		float precioInicial;
		int tamaño;
		char tipo;
		
		System.out.print("Introduzca el precio inicial de la uva: ");
		precioInicial = entrada.nextFloat();
		
		System.out.print("Ingrese el TIPO de uva (A o B): ");
		tipo = entrada.next().charAt(0);
		
		System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
		tamaño = entrada.nextInt();
		entrada.close();
		
		
		
		if ((tipo == 'A' || tipo == 'a') && tamaño == 1) {
			
			precioInicial = precioInicial + 0.20f;
			System.out.println("El precio inicial compensado de la uva debe ser de: "+precioInicial);
			
		}
		else if((tipo == 'A' || tipo == 'a') && tamaño == 2) {
			precioInicial = precioInicial + 0.30f;
			System.out.println("El precio inicial compensado de la uva debe ser de: "+precioInicial);
			
		}
		else if((tipo == 'B' || tipo == 'b') && tamaño == 1){
			precioInicial = precioInicial - 0.30f;
			System.out.println("El precio inicial compensado de la uva debe ser de: "+precioInicial);
		}
		else if((tipo == 'B' || tipo == 'b') && tamaño == 2){
			precioInicial = precioInicial - 0.50f;
			System.out.println("El precio inicial compensado de la uva debe ser de: "+precioInicial);
		}
		else {
			System.out.println("Datos incorrectos favor de revisar");
		}
	
		
		
		

	}

}
