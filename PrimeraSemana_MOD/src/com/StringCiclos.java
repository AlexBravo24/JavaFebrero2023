package com;

public class StringCiclos {

	public static void main(String[] args) {
		
//		// Metodos de la clase String
//		
//		String cadena = "Hoy es 15 de febrero de 2023";
//		
//		// .length()--> Devuelve la longitud de la cadena en valor numerico
//		// cuenta espacios
//		
//		System.out.println(cadena.length());
//		
//		// .charAt (Nos devuelve un caracter que se encuentre en el indice especificado)
//		
//		System.out.println(cadena.charAt(cadena.length()-1));
//		
//		// substrig(int index) nos devuelve una cadena a partir del indice indicado
//		
//		System.out.println(cadena.substring(8));
//		System.out.println(cadena.substring(5, 25));
//		
//		// .toLowerCase() convierte una cadena de texto a minusculas
//		System.out.println(cadena.toLowerCase());
//		
//		// .toUpperCase() convierte una cadena de texto a mayusculas
//		System.out.println(cadena.toUpperCase());
//		
//		// .equals("texto a comparar") devuelve un valor booleano al momento de comparar un texto con otro
//		System.out.println( cadena.equals("texto a comparar"));
//		
//		// .equalsIgnoreCase() compara una cadena de texto con otra sin importar mayuscualas o minusculas
//		System.out.println(cadena.equalsIgnoreCase("hola mundo"));
		
		// ciclos o bucles
		
		//while - Mientras se cumpla una condicion se ejecutara una o varias acciones
//		int x =1;
//		while (x<5) {
//			System.out.println("Hola mundo");
//			x++;
//			
//		}
		
		//Do While - Si la condicion no se cumple por lo menos se ejecuta una vez
//		int y = 5;
//		do {
//			System.out.println("Hola mundo");
//			y--;
//		} while (y>1);
		
		//ciclo for
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola mundo " + i);
		}
	}

}
