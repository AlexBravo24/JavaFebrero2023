package com;

public class StringCiclos {

	public static void main(String[] args) {
		// Metodos de la clase String
		
//		String cadena = "Hoy Es El Dia 15 De Febrero Del 2023";
//		
//		//.length nos devuelve el tamaño o lengitud de la cadena en valor numerico
//		//Incluye los espacios como caracteres
//		
//		System.out.println(cadena.length());
//		
//		//.CharAt nos devuelve el caracter que se encuentra en el indice especificado
//		System.out.println(cadena.charAt(9));
//		
//		//.substring (int index) - Nos devuelve una subcadena 
//		System.out.println(cadena.substring(0,25));
//		
//		//.toLowerCase/.toUpperCase convertir cadena de texto en minusculas/Mayusculas
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals compara el string y devuelve un valor true o false
//		System.out.println(cadena.equals("Hoy es el dia 15 de febrero del 2023"));
//		
//		//.equalsIgnoreCase compara los strings ignorando si tienen mayusculas y minusculas
//		System.out.println(cadena.equalsIgnoreCase("Hoy es el dia 15 de febrero del 2023"));
		
		//Ciclos o tambien llamados Bucles
		//Estructuras que nos van a permitir repetir o ejecutar varias sentencias o procesos
		
		//while mientras se cumpla una condicion se va a ejecutar 
		//Generalmente utilizamos resultados numericos u variables numericas para tenerlo
		//como referencia o control
//		int x = 1; //declaro una variable
//		
//		while (x<5) { // mientras x siga siendo 1 ejecutara los siguiente
//			System.out.println("Hola mundo");
//			x++;
//			
//		}
		
		//Do while nos aseguramos de que si la condicion no cumple el progreso se ejecuta
		//por lo menos una vez
		
//		int y = 5;
//		
//		do { //ejecuta lo siguiente se cumpla o no una condicion
//			System.out.println("Hola mundo");
//			y--;
//		}while(y>1);
		
		//FOR
		
		for(int i = 1; i<5; i++) { //Declaro mi variable de control, doy una comdicion y un incremento
			//para que me ejecute lo siguiente
			System.out.println("Hola mundo " + i);
			
			
			
		}

	}

}
