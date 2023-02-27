/*11. Una compa��a de transporte internacional tiene servicio en algunos 
 * pa�ses de Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. 
 * El costo por servicio de transporte se basa en el peso del paquete y la zona 
 * a la que va dirigida.Parte de su pol�tica implica que los paquetes con un peso 
 * superior a 5kg no son transportados, por cuestiones de log�stica y seguridad. 
 * Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, 
 * el rechazo de la entrega.
 */
package com;

import java.util.Scanner;

public class Ejercicio11_MGAV {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String zona;
		double peso, costo;
		
		System.out.print("Digita la zona de entrega: ");
		zona = entrada.nextLine();
		System.out.print("Digita el peso del paquete: ");
		peso = entrada.nextDouble();
		
		if(peso > 5) {
			System.out.println("El paquete excede el peso permitido");
		}else {
			if(zona.equalsIgnoreCase("America del Norte")) {
				costo = peso * 2400;
				System.out.println("El costo de env�o es de: "+costo+" euros");
			}else if(zona.equalsIgnoreCase("Am�rica Central")) {
				costo = peso * 2000;
				System.out.println("El costo de env�o es de: "+costo+" euros");
			}else if(zona.equalsIgnoreCase("Am�rica del Sur")) {
				costo = peso * 2100;
				System.out.println("El costo de env�o es de: "+costo+" euros");
			}else if(zona.equalsIgnoreCase("Europa")) {
				costo = peso * 1000;
				System.out.println("El costo de env�o es de: "+costo+" euros");
			}else if(zona.equalsIgnoreCase("Asia")) {
				costo = peso * 1800;
				System.out.println("El costo de env�o es de: "+costo+" euros");
			}
		}

	}

}
