/*6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial
 
 * al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
 * Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, 
 * se requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
 * embarque considerando lo siguiente: 
 * * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. 
 * * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. 
 * Precio inicial se recibe desde teclado
 */
package com;

import java.util.Scanner;

public class Ejercicio6_MGAV {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double precio_in, kilos, precio_fin = 0;
		String tipo;
		int tama�o;
		
		System.out.print("Digita el precio inicial: ");
		precio_in = entrada.nextFloat();
		System.out.print("Tipo A | B: ");
		tipo = entrada.next();
		System.out.print("Tama�o 1 | 2:");
		tama�o = entrada.nextInt();
//		System.out.print("N�mero de kilos: ");
//		kilos = entrada.nextInt();
		
		if(tipo.equalsIgnoreCase("a") && tama�o == 1) {
			precio_fin = (precio_in * 1.2);
		}else if(tipo.equalsIgnoreCase("a") && tama�o == 2) {
			precio_fin = (precio_in * 1.3);
		}else if(tipo.equalsIgnoreCase("b") && tama�o == 1) {
			precio_fin = (precio_in * 0.7);
		}else if(tipo.equalsIgnoreCase("b") && tama�o == 2) {
			precio_fin = (precio_in * 0.5);
		}else {
			System.out.println("Ingresaste los par�metros de forma incorrecta ");
		}
		
		System.out.println(precio_fin);
		

	}

}
