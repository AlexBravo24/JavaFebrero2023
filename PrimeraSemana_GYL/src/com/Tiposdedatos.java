package com; //la primera linea indica nombre de paquete al que pertenece la clase

public class Tiposdedatos { //Nombre de la clase y llave de apertura

	public static void main(String [] args) { //Metodo main y su llave de apertura
		//Metodo main nos permite ejecutar sentencias o programas
		
		/* Comentarios de multiples lineas
		 * con una diagonal y un *
		 */
		
		//Para guardar los cambios en la clase, ocupan el comando ctrl+s
		
		/*Tipos de Datos Primitivos
		 * Numeros Enteros
		 */
		
		//Declaracion de variables pero no iniciarlas, las creamos pero sin valor
			byte b;
		
		//Variables con valor o inicializadas
			byte by= 127; //Va desde el valor 128 a 127 y emplea 1 byte de memoria en almacen
			short sh= 32767; //va desde 32768 a 32767 y emplea 2 bytes
			int i= -2147483648; //va desde -2147483648 a 2147483647 y emplea 4 bytes
			long l= 2147483649l; //Emplea el doble de memoria de los int (8 bytes)
								//despues de abarcar el rango de los int utilizamos el sufijo "l"
			//la variable comodin o mas utilizada es la del tipo "int
			
			/*Datos Primitivos
			 * Numericos en punto o coma flotante
			 * (Son los que aceptan decimales)
			 */
			float f= 300.345f; //nos solicita un sufijo "f" y utilizan 4 bytes
			double d= 878787878.878787878979789; //emplea 8 bytes de memoria
			
			//La variable comodin mas utilizada es la de tipo double
			
			/*TIPOS DE DATOS PRIMITIVOS
			 * BOOLEANOS
			 * CARACTER
			 */
			boolean boo= false; //Facilitan el trabajo al evaluar expresiones o condiciones
								//Solo admiten valores verdadero (true) o falso (false)
			char caracter= 'a'; //solo admiten un caracter, emplean una memoria de 2 bytes
								//se le asigna su valor abriendo y cerrando comilla simple
			
			/*Tipos de datos no primitivos o
			 * Tipos de datos estructurados
			 * Tambien se les conoce como tipo objeto o clases
			 */
			
			//Cadena de Texto String
			String cadena= "Esto es una cadena de texto" ;
			String nombre;
			nombre= "Gabriela";
			
			//La cadena de texto admite caracteres, enunciados, numeros, letras, simbolo, etc.
			
			
			/*TIPOS DE DATOS NO PRIMITIVOS
			 * TIPO ENVOLTORIO O WRAPPER
			 */
			
			Integer x= 9000; 
			Byte b1= 123;
			Short s1= 3000;
			Long l2= 89889889898988l;
			Double d1=3.1416;
			Boolean bu= true;
			Character c='c';
			
			//Les brinda propiedades a los tipos de datos promitivos, envolviendolos
			//mediante metodos para otorgarles otros componentes o caracteristicas
			
	
			
			//Salida de datos o mostrarlos en consola
			//Para escribir el comando de System.out.println mas rapido
			//escriben syso y le dan ctrl+espacio
			
			System.out.println("Hola mundo");
			System.out.println(nombre);
			System.out.println(cadena);
			System.out.println(x);
			System.out.println(x.doubleValue());
			System.out.println(d1.intValue());
	}//Cierre del main
	
}//Cierre de la clase
