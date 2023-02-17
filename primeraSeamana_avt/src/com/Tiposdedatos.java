package com; //linea uno es nombre del paquete

public class Tiposdedatos { //nombre de la clase y su llave de apertura
	public static void main(String[] args) {
		//permite ejecutarnsentencias o programas
		
		/*tipos dedatos primitivos
		 * Numericos enteros
		 */
		
		//declaracion de variables pero no iniciadas
		byte b;
		//variables con valor e inicialaizadas 1 byte
		byte by= 127;//desde -128 a 127
		short sh=32767;//va desde -32768 a 32767 2bytes
		int i =2147453684; //va -2147453684 a 2147453684 4 bytes 
		long l=21474836491l; //emplea el doble de memoria 8 bytes
		//despues de abarcar el rango de los int se utiliza el sufbindise l
		/*Tipos de datos primitivos
		 * numericos en punto o coma flotante
		 * son los que aceptan decimales
		 * 
		 */
		float f =300.345f; //nos solicita un prefijo "f" se emplea 4 bytes
		double d= 878787878.8787878979789; // 8 bytes
		// la varible mas utilizada es la de tipo double
		
		/* tipos de datos primitivos 
		 * boleanos
		 * caracter
		 */
		boolean boo=false; //facilitan el trabajo al evaluar expresiones o conndiciones
		//solo admiten valores verdaderos(true) o falso (false)
		char c ='a'; //solo admiten un caracter se utiliza comilla simple 2 bytes
		
		//tipos de datos no primitivos 
		//tipos de datos estructurados o clases
		//cadena de texto String
		String cadena="Alfonso"; //esto es una cadena de teexto
		
		/*tipos de datos no primimitivos (u objeto)
		 * tipo envoltorio o wrapper
		 */
		Integer x=9000;
		Byte b1=123;
		Short s1=300;
		long l2=898898898898898l;
		Double d1=3.1416;
		Character c1='c';
		//brinda propiedades a los tipos de datos primitios
		
		//salida de datos o mostraslos en la consola
		System.out.println("hola mundo");
		System.out.println(cadena);
		System.out.println();
		
	}
} //cierre de la clase
