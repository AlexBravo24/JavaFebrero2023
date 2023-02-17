package com;

import java.util.Scanner;

//EJERCICIO 11
//Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
//Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

//ZONA    UBICACIÓN            COSTO/KILOGRAMO
//1        América del Norte      24.00 euros
//2        América Central        20.00 euros
//3        América del Sur        21.00 euros
//4        Europa                10.00 euros
//5        Asia                  18.00 euros

//Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
//cuestiones de logística y seguridad.
//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
//de la entrega

public class Ejercicio11_CHC {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    int peso;
		    int zona;
		    System.out.println("Las zonas de envío son:");
		    System.out.println("1.- América del Norte");
		    System.out.println("2.- América Central");
		    System.out.println("3.- América del Sur");
		    System.out.println("4.- Europa");
		    System.out.println("5.- Asia");
		    System.out.println("Introduzca el número de destino: ");
		    zona = scanner.nextInt();
		    System.out.println("Introduzca el peso del paquete en Kg: ");
		    peso = scanner.nextInt();
		
		    if (peso > 5){ //Primer condición si el paquete supera los 5kg
		      System.out.println("El paquete no puede ser admitido por cuestiones de logistica y seguridad."); 
		    } else if (peso < 1) { //Si el peso del paquete es decimal no lo admitirá
		      System.out.println("El peso del paquete debe ser un entero positivo.");
		    } else {
		      switch (zona) { //A continuación se hace el cálculo del costo del paquete 
		      case 1:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a América del Norte sale por " +(peso*24) + " euros.");
		        break;
		      case 2:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a América Central sale por " +(peso*20) + " euros.");
		        break;
		      case 3:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a América del Sur sale por " +(peso*21) + " euros.");
		        break;
		      case 4:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a Europa sale por " +(peso*10) + " euros.");
		        break;
		      case 5:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a Asia sale por " +(peso*18) + " euros.");
		        break;
		      default:
		        System.out.println("ERROR: zona elegida incorrecta.");
		        break;
		      }
		    }
	}

}
