package com;// la primera linea nos indica el nombre del paquete 

public class TiposdeDatos {// nombre de la clase y su llave que abre
	
	public static void main(String[] args) { // metodo main y su llave de abrir
	
		
		// el metodo main nos permite ejecutar sentencias o programas
		// con las 2 diagonales relizamos comnetarios
		
		/*
		 * comentarios con multiples lineas*/
		
		//para guaradr cambios en la clses es ctrl+s
		
		/*
		 * tipos de datos primitivos 
		 * numeros enteros*/
		
		// declaracion de variables pero no iniciadas. las creamos pero no les asignamos un valor
		
		byte b;
		
		// variables con valor o inicializadas
		byte by = -128;// va desde el valor -128 a 127 y emplea 1 bite de almacenamiento
		short sh = -32767; //va desde -32768 a 32767 y emplea 2 bytes
		int i= -2147483648; // va desde -2147483648 hasta 2147483647 y emplea 4 bites de memoria
		long l = -2147483649l;// emplea el doble de memoria  de los int (8 bites)
		// despues de abarcar el rango de los "int" utilizamos el sufijo "l"
		
		//la variable comodin o mas utilizada es la del tipo "int"
		
		/*
		 * tipos de datos primitivos 
		 * numericos en punto o coma flotante
		 * (son los que aceptan desimales)*/
		
		float f= 300.345f; // nos solicita un sufijo "f" y utilizan 4 bites 
		double d = 878787878.878787879789; // emplea 8 bytes de memoria
		
		// la variable comodin mas utilizada es la de tipo double
		
		/*
		 * tipos de datos primitivos 
		 * boleanos 
		 * caracter*/
		
		boolean boo = false; // facilitan el trabajo al evaluar expresiones o condiciones
		// solo admiten valores verdaderos o falso true/false
		
		char caracter ='a'; // solo admiten un caracter y emplean una memoria de 2 bites
		// se le asigna su valor abriendo y cerrando comilla simple
		
		
		/*
		 * tipos de datos no primitivos 
		 * tipos de datos estructurados
		 * tambien se les conce como tipo o clases*/
		
		// cadena de texto string
		
		String cadena = " esto es una cadena de texto";
		String nombre;
		nombre = "jorge";
				
				//la cadena de texto admite caracteres, enunciados, numeros, letras, simbolos, etc
				
		/*
		 * tipos de datos no primitivos (u objeto)
		 * numeros enteros*/
		
		Integer x = 9000;
		Byte bl =123;
		Short sl =3000;
		Long l2 = 8988988989988l;
		Double dl =3.1416;
		Boolean bu= true;
		Character c='c';
		
		// les brinda propiedades a los tpos de datos primitivos, envolviendolos 
		// mediante metos para ortogarles otros comportamientos o caracteres
				
		// salida de dato o mostar en consola
		
		System.out.print("hola mundo");
		
		System.out.println(nombre);
		
		System.out.println(cadena);
		
		
	}//ciere del main

}//cierre de la clase
