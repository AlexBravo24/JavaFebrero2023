package com; // nombre del paquete al que pertenece la clase

public class TiposdeDatos { // nombre de la clase y sus llaves de apertura
	
	public static void main(String [] args) { //metodo main y su apertura
	// el metodo main permite ejecutar sentencias o programas
		
		// comentarios de una sola linea
		
	/* Comentarios de multiples lineas
	 * 
	 * 
	 */
		// para guardar cambios "Ctrl + S" o "Cmd + S"
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS ENTEROS
		 */
		
		byte b; //-128 a 127  8 bits, variable solo declarada sin iniciar
		byte by= -128; // variable declarada e iniciada
		short sh= -32768; // -32768 a 32767 son 2 bytes
		int i; // son 4 bytes
		long l= 99999999999l; // son 8 bytes (64 bits) se le agrega sufijo l al pasar el rango de "int"
		// la mas utilizada es int
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO FLOTANTE
		 * (son los que aceptan decimales)
		 */
		float f=3.1416f; //ocupan 4 bytes (32 bits) se debe agregar sufijo f
		double d= 99999.36576652365; //ocupa 8 bytes
		
		// la mas utilizada es double
		
		/* BOOLEANOS Y CARACTERES
		 * 
		 */
		boolean bo= true; // solo acepta valores true o false, se usa para evaluar condiciones
		char caracter = '$'; //va entre comilla simple, solo admiten un caracter, 
							//utiliza 2 bytes (16 bits) y usa codigo UTF-16 de unicode
		
		/* DATOS NO PRIMITIVOS O 
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * Tambien se les conoce como TIPO OBJETO O CLASES
		 */
		
		//Cadena de texto o String
		
		String cadena= "hola mundo"; // es una clase propia de java con sus atributos y metodos,
									// equivale a un arreglo de caracteres (char)
		String nombre;
		nombre = "perro"; // se puede crear y despues inicializar
		
		
		//TIPO ENVOLTORIO O WRAPPER
		// SON CLASES CON ATRIBUTOS Y METODOS
		// SON LAS VARIABLES PRIMITIVAS PERO CON ATRIBUTOS Y METODOS YA DEFINIDOS QUE LE DAN CIERTA UTILIDAD
		// a la mayoria se les agrega la primera letra en MAYUSCULA y su color es azul
		// al utilizarlas podemos acceder a sus comportamientos o caracteristicas adicionales
		//insertando un punto y posteriormente se nos muestra las opciones a utilizar
		// 
		
		Integer x= 900000;
		Byte byt = 127;
		Short sho = 255;
		Long lo = 9999999999l;
		Boolean boo= true;
		Float flo = 3.1416f;
		Double dou = 978675.97866453;
		Character cara = 'A';
		
		//salida de datos o mostrarlos en consola
		System.out.println("Hola mundo");
		System.out.println(nombre);
		System.out.println(x.doubleValue()); // se genera una version en decimal del entero
		System.out.println(flo.intValue()); // se extrae solo el valor entero de la variable float
		
		
	} // Cierre de main
	
	
	
	
	
	
	

} //Cierre de la clase
