package com;

import java.util.Scanner;

//EJERCICIO 1

//Crea un programa que pida por pantalla cuatro pa�ses y a continuaci�n tres 
//ciudades de cada uno de estos pa�ses. Los nombres de ciudades deben 
//almacenarse en un array multidimensional cuyo primer �ndice sea el 
//n�mero asignado a cada pa�s y el segundo �ndice el n�mero asignado a 
//cada ciudad.
//Ejemplo de resultados que debe mostrar el programa:
//Pa�s: Argentina Ciudades: Buenos Aires C�rdoba La Plata
//Pa�s: Espa�a Ciudades: Madrid Lugo Sevilla
//Pa�s: Francia Ciudades: Paris Niza Lyon
//Pa�s: Italia Ciudades: Roma N�poles Sicilia

        public class ArrayBidi_1 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			String[][] paises = new String[4][4];
			
			for(int i = 0, j = 0; i < paises.length; i++) { 
				System.out.print("Introduzca un pa�s: "); //Se pide al usuario introducir un pa�s
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
