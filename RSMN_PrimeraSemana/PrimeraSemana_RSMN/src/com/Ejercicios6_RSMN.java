package com;

import java.util.Scanner;

public class Ejercicios6_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
		entrega en un embarque considerando lo siguiente:
		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
		es de tama�o 2.
		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
		tama�o 2.
		Precio inicial se recibe desde teclado */

		double Precio;
		String Tipo;
		int tama�o;
		
		
				Scanner entrada_uno = new Scanner(System.in);
				Scanner entrada_dos = new Scanner(System.in);
				Scanner entrada_tres = new Scanner(System.in);
				
				double centimos;
				
				System.out.print("agrega el precio: ");
				 Precio = entrada_uno.nextDouble();
				
				System.out.print("agrega el tipo: ");
				 Tipo = entrada_dos.nextLine();
				
				System.out.print("indique el tama�o: ");
				 tama�o = entrada_tres.nextInt();
				
				if ( Tipo.equalsIgnoreCase("A") && tama�o == 1 ) {
					
					centimos = Precio + 0.20;
					System.out.println("El precio total es: "+centimos);
					
				} else if ( Tipo.equalsIgnoreCase("B") && tama�o == 1 ) {
					
					centimos = Precio + 0.30;
					System.out.println("El precio total es: "+centimos);
					
				} else if ( Tipo.equalsIgnoreCase("A") && tama�o == 2 ) {
					
					centimos = Precio - 0.30;
					System.out.println("El precio total es: "+centimos);
					
				} else if ( Tipo.equalsIgnoreCase("B") && tama�o == 2 ) {
					
					centimos = Precio - 0.50;
					System.out.println("El precio total es: "+centimos);
					
				} else {
					
					System.out.println("hay un error ");
					
				}
			}
		}		
	


