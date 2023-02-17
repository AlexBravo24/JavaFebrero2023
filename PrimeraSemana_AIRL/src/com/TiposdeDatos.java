package com; //la primera linea nos indica el nombre del paquete al que pertenece la clase

public class TiposdeDatos {//nombre de la clase y su llave de apertura
	
	public static void main(String[] args) {//metodo main y su llave de apertura
		//el metodo main nos permite ejecutar sentencias o programas
		//comentarios de una sola linea
		
		/*
		 * Comentarios de multiples lineas
		 */
		
		//para ir guardando cambios en la clase, Ctrl + s
		
		/*
		 * Tipos de datos Primitivos
		 * Numeros Enteros
		 */
		//Declarar variable pero no inicilizarla, no le asignamos valor
		byte b;// b es el nombre de la variable 
		
		//variables con valor o inicializarlas
		byte by = -128;//va desde el valor -128, 127,  1 byte de almacenamiento
		short sh = -32768;//va desde el valor -32768, 32767, 2 bytes de memoria
		int in = -2147483648;//va desde el valor -2147483648, 2147483647, 4 bytes de memoria
		long l = 21474836489l;// 8 bytes de memoria o 64 bits, despues de abarcar el rango de int se utiliza l para inicializar la variable
		
		/*Tipos de datos Primitivos
		 * Numeros Decimales
		 * coma o punto flotante
		 */
		
		float f = 300.345f;//ocupa un sufijo f, 4 bytes de memoria
		double d = 154811231.18948941;//8 bytes de memoria
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * Booleanos / Caracter
		 */
		
		boolean boo = true; //facilita el trabajo al evaluar coondiciones, solo adminten valores True / False
		char c = 'a';//solo adminten un caracter, 2 bytes de memoria, se asigna el valor con ' '
		
		/*TIPO DE DATOS NO PRIMITIVOS
		 * datos estructurados, se les conoce como tipo objeto o clases
		 */
		
		//Cadena de texto String
		String cadena = "VKDSBbdjdhfu";
		//
		String nombre;
		nombre = "Alma Itzel Ramirez Lopez";
		//la cadena de texto admite caracteres, numeros, letras, simbolos
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 *Tipo envoltorio o wrapper u objeto, son clases que hacen alucion a un objeto
		 *Les brinda propiedades a los datos primitivos "convitiendolos" en otro tipo
		 */
		
		Integer x = 9000;
		Byte byt = 123;
		Short sht = 37;
		Long lg = 519871321l;
		Double dl = 3.14164;
		Boolean bl= false;
		Character ca = 'a';
		
		
		
		//SALIDA DE DATOS (Consola)
		
		System.out.println("Hola Mundo");
		System.out.println(nombre);
		System.out.println(c);
		System.out.println(x.doubleValue());
		System.out.println(dl.doubleValue());
		
		//syso Ctrl + Espacio
		
	}//cierre main

}//cierre de la clase
