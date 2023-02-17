package com;

public class Array {

	public static void main(String[] args) {
		
		/*Los arrays son una estructura de datos
		 * almacenan un tipo de datos en comun
		 * y una vez declarado su tamaño o longitud
		 * este no puede crecer o cambiar
		 */
		
		char [] nombre = new char [6]; //Un array de caracters con su tamaño declarado
		
		//Asignando datos o valores a cada posicion del array
		
		nombre [0]='A'; //Dentro de los corchetes indicamos la posicion a la que asignemos un caracter
		nombre [1]='l';
		nombre [2]='e';
		nombre [3]='x';
		nombre [4]='i';
		nombre [5]='s';
		
		System.out.println(nombre[4]); //para darle salida en consola a una determinada posicion
		
		char[] nombre2 = {'A','l','e','x'}; // aqui tenemos un array declarado con longitud
											// y los valores que tiene cada posicion
		
		int [] numeros = {1,2,3,4,5}; // aqui tenemos un array con valores numericos enteros
		
		String [] nombres = {"Juan","Carlos","Cruz","Dominguez"}; //un array con valores string
		
		System.out.println(nombres[2]);
		
		//Imprimir en pantalla todos los valores de un array
		//Empleo un ciclo para iterar sobre cada posicion e imprimir cada elemento
		
//		for (int i=0; i<nombre2.length; i++) {
//			System.out.println(nombre2[i]);
//		}
		
		//imprimir en pantalla los valores del array con un ciclo for each
		
		for(int i:numeros) {
			System.out.println(i);
		}

	}

}
