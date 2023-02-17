package com;

public class Array {

	public static void main(String[] args) {
		// ARREGLOS
		
		/* Los arrays son una estructura de datos 
		 * almacenanun tipo de datos en comun
		 * una vez declarado su tamaño o longitud
		 * este no puede cambiar o crecer
		 * 
		 */
		
		char[] nombre = new char[4]; //Un array de caracteres con su tamaño declarado
		
		//Asignando valores o datos a cada posicion del array
		
		nombre[0]= 'A'; //Dentro de corchetes indicamos la posicion a asignar valor
		nombre[1]= 'l';
		nombre[2]= 'e';
		nombre[3]= 'x';
		
//		for(int i=0;i<4;i++) {
//			System.out.print(nombre[i]);
//		}
		
		// Otra manera de declarar e iniciar un array
		
//		char[] nombre2 = {'A','l','e','x'};
//		for(int i=0;i<nombre2.length;i++) {
//			System.out.print(nombre2[i]);
//		}
		
		
		int[] numeros = {2,4,6,8,10};
		String[] nombres = {"aaron","juan","pedro","eduardo"};
		
		//imprimir el array con for each
		
		for(int i:numeros) { // para cada elemento de "numeros" i toma su valor
			System.out.println(i); // se imprime i, la cual tiene el valor de cada elemento del array
			
		}
		
		
		
		
		

	}

}
