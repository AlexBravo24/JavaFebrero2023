package com;

import java.util.Scanner;

////La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
////clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
//es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
//entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
//es de tama�o 2.
//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
//tama�o 2.
//Precio inicial se recibe desde teclado
public class Ejercicio6_CHC {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		    int kilos; //en ella almacenamos el n�mero de kilos entregados por el productor.
		    double precioInicial; //en ella recibiremos el precio introducido por el usuario.
		    String tipo;
		    int tamano; //s�lo debe permitir valores 1 y 2, si no es as�, mostrar� un error.

		    
		    System.out.print("Introduce los Kg. de uva entregada: "); //Se pide al usuario que ingrese los Kg de uva 
		    kilos = entrada.nextInt();
		    System.out.print("Precio por Kg. inicial: "); //Se pide que ingrese el precio por Kg
		    precioInicial = entrada.nextDouble();
		    System.out.print("Tipo de Uva \"A\" � \"B\": "); //Que tipo de uva es
		    tipo = entrada.next(); entrada.nextLine();
		    System.out.print("Tama�o de Uva\"1\" � \"2\": "); // Que tama�o de uva es  
		    tamano = entrada.nextInt();
		// Realizamos C�lculos y mostramos en pantalla
		    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
		        (tamano == 1 || tamano == 2))) { //�nicamente introducir tama�o 1 o 2, en caso de que introduzca valor diferente, marcar� mensaje
		      System.out.println("Tipo o tama�o incorrecto, vuelva a introducir los valores.");
		    } else {
		      if (tipo.toUpperCase().equals("A") && tamano == 1) { //Si es tipo A y tama�o 1 el productor recibir�
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.toUpperCase().equals("A") && tamano == 2) { //Si es tipo A y tama�o 2, el productor recibir�
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamano == 1) { //Si es tipo B y tama�o 1
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamano == 2) { //Si es tipo B y tama�o 2
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }
		  }
		}
