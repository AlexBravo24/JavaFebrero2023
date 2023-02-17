package com;

import java.util.Scanner;

public class Ejercicio11_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int kilos=0, zona, cobro=0;
		
		System.out.println("Cotizador de precios de envio \n\nIntroduzca la opcion de acuerdo a la zona a donde realizará el envio:\n");
		System.out.println("1 - America del Norte \n2 - America Central \n3 - America del Sur \n4 - Europa \n5 - Asia");
		
		zona = entrada.nextInt();
		
		if(zona>=1 && zona<=5) {
			System.out.print("ingrese los kilogramos a de su paquete: ");
			kilos = entrada.nextInt();
			entrada.close();
		
		if(kilos <= 5) {
			
			switch (zona) {
			
			case 1: cobro= 24*kilos;
					System.out.println("El costo por envio de paquete de "+kilos +"Kg es de "+cobro+" euros");
					break;
			case 2: cobro = 20*kilos;
					System.out.println("El costo por envio de paquete de "+kilos +"Kg es de "+cobro+" euros");
					break;
			case 3: cobro = 21*kilos;
					System.out.println("El costo por envio de paquete de "+kilos +"Kg es de "+cobro+" euros");
					break;
			case 4: cobro = 10*kilos;
					System.out.println("El costo por envio de paquete de "+kilos +"Kg es de "+cobro+" euros");
					break;
			case 5: cobro = 18*kilos;
					System.out.println("El costo por envio de paquete de "+kilos +"Kg es de "+cobro+" euros");
					break;
			}
			
			
		}
		else {
			System.out.println("RECHAZO, El paquete excede el peso permitido por politicas de la empresa");
		}
		
		}
		else {
			System.out.println("ERROR, valor no valido!!");
		}
		
		

	}

}
