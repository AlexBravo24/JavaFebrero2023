package com;

import java.util.Scanner;

public class Ejercicios6_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		entrega en un embarque considerando lo siguiente:
		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
		es de tamaño 2.
		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		tamaño 2.
		Precio inicial se recibe desde teclado */

		double Precio;
		String Tipo;
		int tamaño;
		
		
				Scanner entrada_uno = new Scanner(System.in);
				Scanner entrada_dos = new Scanner(System.in);
				Scanner entrada_tres = new Scanner(System.in);
				
				double centimos;
				
				System.out.print("agrega el precio: ");
				 Precio = entrada_uno.nextDouble();
				
				System.out.print("agrega el tipo: ");
				 Tipo = entrada_dos.nextLine();
				
				System.out.print("indique el tamaño: ");
				 tamaño = entrada_tres.nextInt();
				
				if ( Tipo.equalsIgnoreCase("A") && tamaño == 1 ) {
					
					centimos = Precio + 0.20;
					System.out.println("El precio total es: "+centimos);
					
				} else if ( Tipo.equalsIgnoreCase("B") && tamaño == 1 ) {
					
					centimos = Precio + 0.30;
					System.out.println("El precio total es: "+centimos);
					
				} else if ( Tipo.equalsIgnoreCase("A") && tamaño == 2 ) {
					
					centimos = Precio - 0.30;
					System.out.println("El precio total es: "+centimos);
					
				} else if ( Tipo.equalsIgnoreCase("B") && tamaño == 2 ) {
					
					centimos = Precio - 0.50;
					System.out.println("El precio total es: "+centimos);
					
				} else {
					
					System.out.println("hay un error ");
					
				}
			}
		}		
	


