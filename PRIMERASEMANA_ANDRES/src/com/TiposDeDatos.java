package com; //La primera linea nos indica el nombre del paquete al que pertenece la clase 

public class TiposDeDatos { //Nombre de clase y su llave de apertura

public static void main(String[] args) { //Metodo main y su llave de apaertura
	// El metodo main nos permite ejecutar sentencias o programas
	
	//Con las dos diagonales podemos realizar comentarios de una sola linea
	
	/*Comentarios de multiples lineas
	 * con una diagonal y un *
	 */
	
	/*TIPOD DE DATOSPRIMITIVOS
	 * MUNERICOS ENTEROS
	 */
	
	//Declaracion de variables pero no iniciarla.Las creamos pero no les asiganmos valor
	byte b;
	
	//Variables con valor o iniciadas
	byte by=-128; //Va desde le valor -128 a 127, 1 byte de almacenamiento
	short sh= -32768; //Va desde 32768 a 32767 y emplea 2 byte
	int i= -2147483648; //emplea 4 bytes de memoria, despues de abarcar el rango de los int entonces ponemos el sufijo L para que nos de
	long l= 2147483648l;
	 float f= 300.345f; //Nos solicita un sufijo f y utiliza 4 bytes
	 double d= 878787878.87878789789; //es la variable comodin más utilizada
	  
	 /*TIPOS DE DATOS PRIMITIVOS
	  * BOOLEANOS
	  * CARACTER
	  */
	
	 boolean boo= false; // solo adminiten true or false
			
	char character=	'a'; //solo admiten un caracter con comillas simples
	
	 
	 /*TIPOS DE DATOS NO PRIMITIVOS
	  * tipos de datos estrcututrados
	  */
	 
	//Cadena de texto STRING
	
	String cadena = "Esto es una cadena de texto";
	
	String nombre;
	
	nombre= "José Andrés";
	 
	 /*TIPOS DE DATOS NO PRIMITIVOS (U OBJETO)
	  * TIPO ENVOLTORIO O WRAPPER
	  */
	 
	Integer x = 9000;
	Byte bl = 123;
	Short sl = 3000;
	Double dl= 3.1416;
	Boolean bu= true;
	Character c = 'c';
	
	System.out.print ("Hola mundooo");
	
	
	
	 
}	// 	Cierre del main

	
	
}//Cierre de la clase

 