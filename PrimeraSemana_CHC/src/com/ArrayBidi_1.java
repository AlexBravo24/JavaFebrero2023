package com;

import java.util.Scanner;

//EJERCICIO 1

//Crea un programa que pida por pantalla cuatro países y a continuación tres 
//ciudades de cada uno de estos países. Los nombres de ciudades deben 
//almacenarse en un array multidimensional cuyo primer índice sea el 
//número asignado a cada país y el segundo índice el número asignado a 
//cada ciudad.
//Ejemplo de resultados que debe mostrar el programa:
//País: Argentina Ciudades: Buenos Aires Córdoba La Plata
//País: España Ciudades: Madrid Lugo Sevilla
//País: Francia Ciudades: Paris Niza Lyon
//País: Italia Ciudades: Roma Nápoles Sicilia

        public class ArrayBidi_1 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			String[][] paises = new String[4][4];
			
			for(int i = 0, j = 0; i < paises.length; i++) { 
				System.out.print("Introduzca un país: "); //Se pide al usuario introducir un país
				paises[i][j] = entrada.nextLine(); 
				for(j = 1; j < paises[i].length; j++) {
					System.out.print("Introduzca ciudad [" + j + "]: ");
					paises[i][j] = entrada.nextLine();
				}
				j = 0;
			}
			entrada.close();
			for(int i = 0, j = 0; i < paises.length; i++) {
				System.out.print("Las ciudades de " + paises[i][j] + " introducidas son: ");
				for(j = 1; j < paises[i].length; j++) {
					if(j == (paises[i].length-1)) {
						System.out.print(" y " + paises[i][j] + ".");
					} else if(j == (paises[i].length-2)){
						System.out.print( paises[i][j]);
					} else {
						System.out.print( paises[i][j] + ", ");
					}
				}
				j = 0;
				System.out.println();
			}
		}

	}
