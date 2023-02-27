/*6. La asociación de vinicultores tiene como política fijar un precio inicial
 
 * al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
 * Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, 
 * se requiere determinar cuánto recibirá un productor por la uva que entrega en un 
 * embarque considerando lo siguiente: 
 * * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. 
 * * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
 * Precio inicial se recibe desde teclado
 */
package com;

import java.util.Scanner;

public class Ejercicio6_MGAV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double precio_in, kilos, precio_fin = 0;
		String tipo;
		int tamaño;
		
		System.out.print("Digita el precio inicial: ");
		precio_in = entrada.nextFloat();
		System.out.print("Tipo A | B: ");
		tipo = entrada.next();
		System.out.print("Tamaño 1 | 2:");
		tamaño = entrada.nextInt();
//		System.out.print("Número de kilos: ");
//		kilos = entrada.nextInt();
		
		if(tipo.equalsIgnoreCase("a") && tamaño == 1) {
			precio_fin = (precio_in * 1.2);
		}else if(tipo.equalsIgnoreCase("a") && tamaño == 2) {
			precio_fin = (precio_in * 1.3);
		}else if(tipo.equalsIgnoreCase("b") && tamaño == 1) {
			precio_fin = (precio_in * 0.7);
		}else if(tipo.equalsIgnoreCase("b") && tamaño == 2) {
			precio_fin = (precio_in * 0.5);
		}else {
			System.out.println("Ingresaste los parámetros de forma incorrecta ");
		}
		
		System.out.println(precio_fin);
		

	}

}
