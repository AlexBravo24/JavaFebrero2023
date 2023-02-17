package com;

public class Array {

	public static void main(String[] args) {
		/*son una estructura de datos 
		 * almacenan tipos de datos en comum y tienen un tamaño y una longitud
		 */
		char [] nombre = new char[4];//array de caracteres con su tamaño declarado
		//asignando datos o valoras a cada posicion del array
		nombre[0]='A';
		nombre[1]='1';
		nombre[2]='e';
		nombre[3]='x';
		System.out.println(nombre[3]);
		
		//otra manera de declarar un array
		char [] nombre2= {'A','1','e','x'};
		System.out.println(nombre2[0]);
		
		int [] numeros = {1,2,3,4,5};
		
		String []nombres = { "alfonso","eduardo","julio","gerardo"};
		
		for (int i=0; i<nombres.length;i++) {
			System.out.println(nombres[i]);
			
		}
		//array con el ciclo for each
		 for (int i:numeros) {
			 System.out.println(i);
			 
		 }

	}

}
