package com; // la primera linea nos indica el nombre de la clase

public class Tiposdedatos { // nombre de la clase y sin llave de apertura

	public static void main(String [ ] arg) {
		
		//el metodo main permite ejecutar sentencias
		
		//comentarios de una sola linea
		
		/* comentarios de
		 * multiples
		 * lineas
		 */
		
		/*Tipos de datos Numericos enteros
		 * 
		 */
		//declaracion de variable pero no iniciadas, las creamos pero no le asignamos un valor
		byte b;
		
		//Variables con valor o inicializadas
		byte by= 127; //almacena del -128 al 127
		short ab = -32168; //va desde -32168 a 32167 y emplea 2 bytes
		int i = -2147483648; //va desde 21474684 hasta 21474683 y emplea 4 bytes
		long l = 21474836488l; //emplea el doble de memoria, emplea 8 bytes o 64 bits
								//una vez que alcance el rango de los int se termina el valor con l para poder trabajar con ella
		//la variable mas usada es la int
		
		/*Tipos de datos numericos flotantes
		 * los que aceptan decimales
		 */
		
		float f = 388.9f; //soporta 32 bits y hay que terminar el  numero con f
		double d = 635653.265686; //contiene 8 bytes
		
		//la variable mas usada es double
		
		/*Tipos de datos
		 * booleanos
		 */
		
		boolean boo = true; //facilita al trabajar con expresiones o condiciones
							//solo permite trabajar con valores verdaderos o falsos
		char caracter = 'a' ; //solo se emplean letras y usa 2 bytes
		
		/*Tipos de Datos estructurados 
		 * Tipo objeto o clases
		 */
		
		// Cadena de texto String
		
		String cadena = "This is a string";
		
		String nombre = "Juan Carlos";
		
		//la cadena de texto admite caracteres, enunciados, numeros, letras y simbolos
		
		/*Tipos de datos no primitivos u objeto
		 * Tipo envoltorio o wrapper
		 */
		
		Integer x = 9000;
		Byte bi = 123;
		Short sh = 3000;
		Long l2 = 8989898989l;
		Double dl = 3.1416;
		Boolean bu = true;
		Character c = 'c';
		
		//Salida de datos o mostrarlos en consola
		
		System.out.println("Hello World");
		System.out.println(nombre);
		System.out.println(cadena);
		System.out.println(x);
		System.out.println(x.doubleValue());
		System.out.println(dl.intValue());
		
		//los de tipo envoltorio brinda propiedades a los tipos de datos primitivos
		//envolviendolos mediante metodos para otorgarles otros comportamientos o caracteristicas
		//syso + ctl + espacio
		
	}//cierre del main
	
	
}//cierre de la clase
