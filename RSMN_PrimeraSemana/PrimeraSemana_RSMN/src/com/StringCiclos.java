package com;

public class StringCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// metodos de la clase String
		
//		String cadena = "hoy es 15 de febrero de 2023";
//		// metodo .length () nos debuelbe el tamaño de de la cadena en un valor numerico
//		// incluye los espacios que son detectados como caracteres
//		System.out.println(cadena.length());
//		
//		// metdodo .charAt nos devuelve el caracter que se encuentra en el indice especificado
//		
//		System.out.println(cadena.charAt(0));
//		
//		// substring (int index) nos debuelve una sub cadena apartir del indice indicado
//		System.out.println(cadena.substring(8,25));
//		
//		// metodo toLowereCase combierte la cadena de texto en minuscula
//		System.out.println(cadena.toLowerCase());
//		
//		// metodo toLowereCase combierte la cadena de texto en mayuscula
//		System.out.println(cadena.toUpperCase());
//		
//		//metodo .equals (object ob) comparar strings y devolver un valor true o false
//		System.out.println(cadena.equals("hoy es 15 de enero de 2023"));
//		
//		//metodo .equalsIgnorecase compara los string ignorando si tirene mayusculas o minisculas
//		System.out.println(cadena.equalsIgnoreCase("hoy es 15 de febrero de 2023"));
		
		// ciclos o bucles
		// son estructuras que nos van a permitir repetir ejecutar varias sentencias o procesos
		
		// while mientras se cumpla una condicion
		// generalmente utilizamos resultados numericos o variables numericas
		
//		int x=1;
//		while (x < 5);{ //mientras x tenga un valor menor a 5 ejecute lo siguiente
//			System.out.println("hola mundo");
//			x++;
//			
//		}
		
		// do-while nos permite que si la condicion no se cumple el programa se ejecute
		
//		int y=5;
//		do {
//			System.out.println("hola mundo al menos una vess");
//			y--;
//		}while (y > 6);{
////			System.out.println("hola mundo");
//		}
		
		
		// ciclo for (para)
		
		for (int i = 1; i<5; i++){
			System.out.println("hola mundo " + i);
		}
	}

}
