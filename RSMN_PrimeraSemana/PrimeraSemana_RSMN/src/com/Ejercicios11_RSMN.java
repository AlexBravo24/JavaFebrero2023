package com;

import java.util.Scanner;

public class Ejercicios11_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
		Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

		Zona ubicacion			Costo/Kilo

		America del norte		24
		America central			20
		America del sur			21
		Europa					10
		Asia					18

		Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
		cuestiones de logística y seguridad.
		Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
		de la entrega.
		 
		 */
				
				Scanner entrada_uno = new Scanner(System.in);
				Scanner entrada_dos = new Scanner(System.in);
				
				double precio;
				
				System.out.print("Ingrese el destino: ");
				String Destino = entrada_uno.nextLine();
				System.out.print("Ingrese el peso: ");
				double Peso = entrada_dos.nextDouble();
				
				if ( Peso <= 5.0 ) {
					
					if ( Peso <= 5.0 && Destino.equalsIgnoreCase("America del norte") ) {
						
						precio = Peso * 24.00;
						
						System.out.println("El precio por kilo es de 24.00 euros, el total a pagar es de: "+precio);
						
					} else if ( Peso <= 5.0 && Destino.equalsIgnoreCase("America central") ) {
						
						precio = Peso * 20.00;
						
						System.out.println("El precio por kilo es de 20.00 euros, el total a pagar es de: "+precio);
						
					} else if ( Peso <= 5.0 && Destino.equalsIgnoreCase("America del sur") ) {
						
						precio = Peso * 21.00;
						
						System.out.println("El precio por kilo es de 21.00 euros, el total a pagar es de: "+precio);
						
					} else if ( Peso <= 5.0 && Destino.equalsIgnoreCase("Europa") ) {
						
						precio = Peso * 10.00;
						
						System.out.println("El precio por kilo es de 10.00 euros, el total a pagar es de: "+precio);
						
					} else if ( Peso <= 5.0 && Destino.equalsIgnoreCase("Asia") ) {
						
						precio = Peso * 18.00;
						
						System.out.println("El precio por kilo es de 18.00 euros, el total a pagar es de: "+precio);
						
					} else {
						
						System.out.println("El destino no existe: ");
						
					}
					
				} else {
					
					System.out.println("El peso no debe exceder los 5kg");
					
				}
				
			}
			
		}

