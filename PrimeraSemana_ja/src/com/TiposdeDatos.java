package com; //la primera linea nos indica el nombre del paquete del que pertenece la clase

public class TiposdeDatos { //Nombre de la clase y su llave de apertura

	public static void main(String[] args) { //Metodo main y su llave de apertura
	//el metodo de main permite ejecutar sentencias o programas
		
	//con las dos diagonales podemos realizar comentarios de una linea	
		
	/*	comentarios multiples lineas
	 * 	con una diagonal y un *
	 */
		
	//Para ir guardando los cambios en la clase, ocupa el comando ctrl+s
		
	/*TIPOS DE DATOS PRIMITIVOS
	 * NUMERICOS ENTEROS
	 */
		
	//hacer una declaracion de variables pero no iniciadas. las creamos pero no le asignamos un valor	
		byte b;
		
	//Variables con valor o Inicializadas	
		
		byte by = -128; //Va desde el valor-128 a 127 y emplea 1 byte de 128
		short sh = -32768; //Va desde el valor -32768 a 32767 y emplea 2 byte de 128
		int i = -2147403648; //Va desde el valor -2147403648 a 2147403647 y emplea 4 byte
		long l = 21447403649l; //eMPLEA EL DOBLE DE MEMORIA DE LOS IN (8BYTES
							//DESPUES DE rango de los "int" utilizamos el sufijo l minuscula
		
	//la variable comodin o mas utilizada son tipo int
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMERICOS EN PUNTO O COMO FLOTANTE
		 * (SON LOS QUEACEPTAN DECIMALES)
		 */
		
		float f = 300.345f; //numericos un sufigo "f" y utiliza 4 bytes
		double d = 8787878787.8787878787879; //emplea 8 bytes de memoria
		
		//la variable comodin mas utilizada es la de tipo double
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOLEANOS
		 * CARACTER
		 */
		boolean boo = true; //facilitan el trabajo en evaluar expresiones o condiciones
							//Solo admiten valores verdaderos {ture o falso {false
		
		char caracter = 'a';//Solo admiten un caracter.Emplea una memoria de 2 bytes
							//Se le asigna un valor abriendo comilla simple
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * TAMBIEN SE LES CONOCE COMO TIPO OBJETO O CLASES
		 */
		
		//Cadena de texto string
		
		String cadena = "esto es una cadena de texto"; //
		
		String nombre;
		
		nombre = "Jurgen Aaron";
		
		//La cadena de texto admite caracteres, enunciados, numeros, letras, simbolos, etc.
		
		/*Tipos de datos no primitivos
		 * tipo ENVOLTORIOS O WRAPPER
		 */
		
		Integer x = 900;
		Byte b1 = 123;
		Short s1 = 3000;
		Long l2 = 8989898989898l;
		Double d2 = 3.1416;
		Boolean bu = true;
		Character c = 'c';
		
		//LES BRINDA PROPIEDADES A LOS TIPOS DE DATOS PRIMITIVOS, ENVOLVIENDOLOS
		//mediante metodos para otorgarles otros comportamientos o caracteristicas
		
		
		//Salida de un valor o mostrarlos en consola
		//Para escribir el comando de un System.out.print mas raqpido
		//escribe syso y le das ctrl+espacio
		
		System.out.println("Hola mundo"); //
		
		System.out.println(nombre);
		System.out.println(cadena);
		
		System.out.println(x);
		System.out.println(x.doubleValue());
		
		System.out.println(d2.intValue());
		
		
		
		
	} //cierre de main
	
	
} //cierre de la clase
