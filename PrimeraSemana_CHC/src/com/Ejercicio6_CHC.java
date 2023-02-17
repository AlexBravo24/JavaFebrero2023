package com;

import java.util.Scanner;

////La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
////clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//es de tamaño 2.
//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//tamaño 2.
//Precio inicial se recibe desde teclado
public class Ejercicio6_CHC {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		    int kilos; //en ella almacenamos el número de kilos entregados por el productor.
		    double precioInicial; //en ella recibiremos el precio introducido por el usuario.
		    String tipo;
		    int tamano; //sólo debe permitir valores 1 y 2, si no es así, mostrará un error.

		    
		    System.out.print("Introduce los Kg. de uva entregada: "); //Se pide al usuario que ingrese los Kg de uva 
		    kilos = entrada.nextInt();
		    System.out.print("Precio por Kg. inicial: "); //Se pide que ingrese el precio por Kg
		    precioInicial = entrada.nextDouble();
		    System.out.print("Tipo de Uva \"A\" ó \"B\": "); //Que tipo de uva es
		    tipo = entrada.next(); entrada.nextLine();
		    System.out.print("Tamaño de Uva\"1\" ó \"2\": "); // Que tamaño de uva es  
		    tamano = entrada.nextInt();
		// Realizamos Cálculos y mostramos en pantalla
		    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
		        (tamano == 1 || tamano == 2))) { //Únicamente introducir tamaño 1 o 2, en caso de que introduzca valor diferente, marcará mensaje
		      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
		    } else {
		      if (tipo.toUpperCase().equals("A") && tamano == 1) { //Si es tipo A y tamaño 1 el productor recibirá
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.toUpperCase().equals("A") && tamano == 2) { //Si es tipo A y tamaño 2, el productor recibirá
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamano == 1) { //Si es tipo B y tamaño 1
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamano == 2) { //Si es tipo B y tamaño 2
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }
		  }
		}
