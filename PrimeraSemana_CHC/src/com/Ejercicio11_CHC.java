package com;

import java.util.Scanner;

//EJERCICIO 11
//Una compa??a de transporte internacional tiene servicio en algunos pa?ses de Am?rica del Norte, Am?rica 
//Central, Am?rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

//ZONA    UBICACI?N            COSTO/KILOGRAMO
//1        Am?rica del Norte      24.00 euros
//2        Am?rica Central        20.00 euros
//3        Am?rica del Sur        21.00 euros
//4        Europa                10.00 euros
//5        Asia                  18.00 euros

//Parte de su pol?tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
//cuestiones de log?stica y seguridad.
//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
//de la entrega

public class Ejercicio11_CHC {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    int peso;
		    int zona;
		    System.out.println("Las zonas de env?o son:");
		    System.out.println("1.- Am?rica del Norte");
		    System.out.println("2.- Am?rica Central");
		    System.out.println("3.- Am?rica del Sur");
		    System.out.println("4.- Europa");
		    System.out.println("5.- Asia");
		    System.out.println("Introduzca el n?mero de destino: ");
		    zona = scanner.nextInt();
		    System.out.println("Introduzca el peso del paquete en Kg: ");
		    peso = scanner.nextInt();
		
		    if (peso > 5){ //Primer condici?n si el paquete supera los 5kg
		      System.out.println("El paquete no puede ser admitido por cuestiones de logistica y seguridad."); 
		    } else if (peso < 1) { //Si el peso del paquete es decimal no lo admitir?
		      System.out.println("El peso del paquete debe ser un entero positivo.");
		    } else {
		      switch (zona) { //A continuaci?n se hace el c?lculo del costo del paquete 
		      case 1:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a Am?rica del Norte sale por " +(peso*24) + " euros.");
		        break;
		      case 2:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a Am?rica Central sale por " +(peso*20) + " euros.");
		        break;
		      case 3:
		        System.out.println("El paquete de " + peso + " kilogramos enviado a Am?rica del Sur sale por " +(peso*21) + " euros.");
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
