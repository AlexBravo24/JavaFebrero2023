package com; // Nombre del paquete
/*permite hacer
 * comentarios 
 * de multiples lineas
 */
public class TiposDeDatos {
	
	//El metodo main permite ejecutar sentencias o programas
	public static void main(String[] args) {
		//Tipos de datos - Numeros enteros
		//Declaracion de variables, pero no inicializadas
		
		byte b;
		
		//Variables con valor o inicializadas
		byte by = -128;
		short sh = 32767;
		int i = -2147483648;
		long l = 2147483649L;
		
		//Tipos de datos - Numericos decimales
		
		float f = 300.345F;//Se requiere un subfijo f al final del numero
		double d = 878787878.8787878;
		
		//Tipos de datos - Booleanos y char
		
		boolean boo = true;
		
		char caracter = 'd';//admite un caracter de utf-16
		
		//Tipos de datos no primitivod o estructurados (objetos)
		
		//Cadena de texto String
		String cadena = "Esto es una cadena de texto";
		String nombre;
		nombre = "Martin Ortiz Dionicio";
		System.out.println(nombre);
		
		//Tipo envoltorio - Wrapper
		Integer x = 9000;
		Byte b1 = 123;
		Short s1 = 3000;
		Long l2 = 89454464646556L;
		Double d1 = 3.1416;
		Boolean bu = true;
		Character c = 'c';
		
		System.out.println("Hola mundo " + nombre);
		System.out.println(x.doubleValue());
		System.out.println(d1.intValue());
	}
	
}
