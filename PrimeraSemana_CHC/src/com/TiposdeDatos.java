package com; // La primera línea nos indica el nombre del paquete al que pertenece la clase

public class TiposdeDatos { //Nombre de la clase y llave de apertura


	public static void main(String[] args) {// método main y su llave de apertura
		//El método main nos permite ejecutar sentencias o programas
		//Con las dos diagonales podemos realizar comentarios de una sola línea
		/* Comentarios de multiples lineas 
		 * con una diagonal y un *
		 */
		//para guardar los cambios en la clase, ocupar el comando Ctrl+S
		
		
		/* TIPOS DE DATOS PRIMITIVOS
		 * NUMÉRICOS ENTEROS 
		 */
		
		//Declaración de variables, pero no iniciadas, las creamos pero no les asignamos nada
		byte b;
		
		//Variables con valor o inicializadas 
		byte by = 127; // va desde el valor -128 a 127 y emplea 1byte de almacenamiento de memoria
		short sh = 32767; //Va desde -32768 a 32767 y emplea 2 bytes
		int i = -2147483648; //Va desde -2147483648 hasta 2147483648 y emplea 4 bytes de memoria
		long l = 2147483649l; //Emplea el doble de memoria de los int (8bytes)
		                     //Después de abarcar el rango de los "int" utilizamos el sufijo "l" 
		//La variable comodín o más utilizada es la del tipo "int"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NÚMERICOS EN PUNTO O COMA FLOTANTE 
		 * (Son los que aceptan decimales)
		 */
		
 		float f = 300.345f; //Nos solicita un sufijo "f" y utilizan 4 bytes
 		double d = 878787878.878787878787879; //Emplea 8 bytes de memoria
 		
 		//La variable comodín más utilizada es la de tipo double 
 		
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * BOOLEANOS
		 * CARACTER
		 */
 		
 		boolean boo = false; // Facilitan el trabajo al evaluar expresiones o condiciones
 		                     //Solo admiten valores verdadero(ture) o falso(false)
 		
 		char caracter = 'a'; //Solo admiten un caracter, emplean una memoria de 2 bytes
 		                    //Se le asigna su valor abriendo y cerrando comilla simple
 		
 		
 		
 		/* TIPOS DE DATOS NO PRIMITIVOS 
 		 * TIPOS DE DATOS ESTRUCTURADOS
 		 * También se les conoce como tipo objeto o clases
 		 
 		 */
 		//Cadena de Texto String
 		
 		String cadena = "Esto es una cadena de texto"; 
 		
 		String nombre; 
 		
 		nombre= "Carolina";
 		
        //La cadena de texto admite caracteres, enunciados, números, letras, símbolos, etc.
 		
 		/* TIPOS DE DATOS NO PRIMITIVOS (U OBJETO)
 		 * TIPO ENVOLTORIO O WRAPPER  
 		 */
 		
 		
 		Integer x = 9000;
 		Byte bl = 123;
 		Short sl = 3000;
 		Long l2 = 89898989898989l;
 		Double dl = 3.1416;
 		Boolean bu = true;
 		Character c= 'c';
 		//Les brinda propiedades a los tipos de datos primitivos, envonviendólos
 		//mediante métodos para otorgarles otros comportamientos o características
 		
 	
 		//Salida de datos o mostrarlos en consola
 		//Para escribir el comando de system.out.println más rápido
 		// Escriben syso y le dan ctrl+espacio
 		
 		System.out.println("Hola mundo");
 		
 		System.out.println(nombre);
 		System.out.println(cadena);
 		
 		System.out.println(x);
 		System.out.println(x.doubleValue());
 		
 		System.out.println(dl.intValue());
 		
 		
	} //cierre del main
	
	
	
} //cierre de la clase
