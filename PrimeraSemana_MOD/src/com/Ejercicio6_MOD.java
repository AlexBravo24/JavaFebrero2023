package com;

import java.util.Scanner;

public class Ejercicio6_MOD {

	public static void main(String[] args) {
		// Ejercicio 6 
		/*La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), 
		 * y adem�s en tama�os (1 y 2). 
		 * Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, 
		 * se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente: 
		 * * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. 
		 * * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. 
		 * Precio inicial se recibe desde teclado
		 * */
		
		double precioInicial;
		String tipo;
		int tamanio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------------------------------------------");
		System.out.println("|           Precio kilo de uva            |");
		System.out.println("-------------------------------------------\n");
		
		System.out.print("Ingrese el precio inicial: ");
		precioInicial = entrada.nextDouble();
		
		System.out.print("Ingrese el tipo (A o B): ");
		tipo = entrada.next();
		
		System.out.print("Ingrese el tama�o (1 o 2): ");
		tamanio = entrada.nextInt();
		entrada.close();
		
		// Establece precio de uva por kilo si es tipo A	
		if (tipo.equalsIgnoreCase("A") && tamanio == 1) {
			System.out.println("\nEl precio de uva por kilo es: " + (precioInicial + .20));	
		} else if(tipo.equalsIgnoreCase("A") && tamanio == 2) {
			System.out.println("\nEl precio de uva por kilo es: " + (precioInicial + .30));
		}
		
		// Establece precio por kilo si es tipo B
		if (tipo.equalsIgnoreCase("B") && tamanio == 1) {
			System.out.println("\nEl precio de uva por kilo es: " + (precioInicial - .30));	
		} else if(tipo.equalsIgnoreCase("B") && tamanio == 2) {
			System.out.println("\nEl precio de uva por kilo es: " + (precioInicial - .50));
		}
	}
}
