package com;

import java.util.Scanner;

public class Ejercicio6_MOD {

	public static void main(String[] args) {
		// Ejercicio 6 
		/*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), 
		 * y además en tamaños (1 y 2). 
		 * Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, 
		 * se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente: 
		 * * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. 
		 * * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
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
		
		System.out.print("Ingrese el tamaño (1 o 2): ");
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
