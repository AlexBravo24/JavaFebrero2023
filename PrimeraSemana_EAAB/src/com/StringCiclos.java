package com;

public class StringCiclos {

	public static void main(String[] args) {
		
		// Métodos de la clase String
		
//		String cadena = "Hoy es 15 de febrero de 2023";
//		
//		//.length() -- nos devuelve el tamaño o longitud de la cadena en valor numerico
//		//Incluye los espacios que son detectados como caracteres
//		System.out.println(cadena.length());
//		
//		//.charAt(x) -- nos devuelve el caracter que se encuentre en el indice especificado
//		System.out.println(cadena.charAt(0));
//		System.out.println(cadena.charAt(cadena.length()-1));
//		
//		//.substring(x) -- nos devuelve una subcadena a partir del indice indicado
//		System.out.println(cadena.substring(7,23));
//		
//		//.toLowerCase -- convertir la cadena de texto en minusculas
//		System.out.println(cadena.toLowerCase());
//		
//		//.toUpperCase -- convierte la cadena de texto a mayusculas
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals -- comparar Strings y devolver valor true si es igual a declarada en argumento
//		// 			 y devuelve false si es diferente al argumento
//		System.out.println(cadena.equals("Hoy es 15 de enero de 2023"));
//		
//		//.equalsIgnoreCase() -- compara strings ignorando si tienen mayusculas o minusculas
//		System.out.println(cadena.equalsIgnoreCase("hoy es 15 de febrero de 2023"));
		
		//Ciclos o bucles
		// son estructuras que nos permiten repetir o ejecutar varias sentencias o procesos
		
		
		//while -- mientras se cumpla una condicion
		// Generalmente se usan variables numericos para tenerlos como referencia o control
		
//		int x = 1; // Declaro una variable y la inicio
//		
//		while(x<5) { //mientras x tenga un valor menor a 5 ejeutar lo siguiente
//			
//			System.out.println("hola mundo");
//			x++;
//		}
//		
		// do - while  -- nos asegura que si la condicion no se cumple, el programa se 
		// ejecute por lo menos una vez
		
//		int y = 5;
//		
//		do { // ejecutar lo siguiente se cumpla o no una condicion
//			System.out.println("hola mundo");
//			y--;
//			
//		}while(y>1); 
//		
		
		//for (para)
		
		for(int i = 1; i <= 5; i++) { //declaro variable de control, doy condicion e incremento
			//para que se ejecute lo siguiente
			
			System.out.println("hola mundo " +i);
			
		}
		
		
		
	}

}
