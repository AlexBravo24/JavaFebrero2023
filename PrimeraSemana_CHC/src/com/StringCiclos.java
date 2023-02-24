package com;

public class StringCiclos {

	public static void main(String[] args) {
		// MÉTODOS DE LA CLASE STRING
		
//		String cadena= "Hoy es 15 de febrero de 2023";
//		//.length() (Nos devuelve el tamaño o longitud de la cadena en valor numérico)
//		//Incluye los espacios que son detectados como caracteres
//		System.out.println(cadena.length());
//      
//		
//		//.charAt (Nos devuelve el caracter que se encuentre en el índice especificado)
//		//System.out.println(cadena.charAt(cadena.length()-1)); en caso de que no sepamos la posición
//		System.out.println(cadena.charAt(9));
//		
//		//.substring (int index)- Nos devuelve una subcadena a partir del índice indicado  
//		System.out.println(cadena.substring(8,25));
//		
//		//.LoLowerCase convertir la cadena de texto en minuscúlas
//		System.out.println(cadena.toLowerCase());
//		
//		//toUpperCase (Convertir la cadena de texto en mayúsculas)
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals (Object ob) (Comparar Strings y devolver un valor true o false
//		System.out.println(cadena.equals("Hoy es 15 de mayo de 2023"));
//		
//		//.equalsIgnoreCase (Compara los Strings ignorando si tienen mayusculas o minusculas
//		System.out.println(cadena.equalsIgnoreCase("HOY ES 15 DE FEBRERO DE 2023"));
//		
		
		  //CICLOS O TAMBIÉN LLAMADOS BUCLES
		//Estructuras que nos van a permitir repetir o ejecutar varias sentencias o procesos.
		
		
		//while (Mientras se cumpla una condición se va a ejecutar una acción)
		//Generalmente utilizamos resultados numéricos o variables numéricas para tenerlas como
		//referencia o control
		
//		int x= 1; //Declaro una variable 
//		
//		while (x<5) {//Mientras x tenga un valor menor a 5
//			//que ejecute los iguiente
//			System.out.println("Hola mundo");
//			x++;
//			
//		}
		
		
		//DO-WHILE (Nos aseguramos de que si la condición no se cumple, el programa se ejecute
		//por lo menos 1 vez
		
//		int y = 5;
//		
//		do {//Ejecutar lo siguiente se cumpla o no una condición
//			System.out.println("Hola mundo");
//			y--; //Si necesito un control, lo indico, si no podemos omitirlo
//		} while (y>1); 
		
		//FOR (Para)
		
		for (int i= 1; i<5; i++) {//declaro mi variable de control,doy una condición y un incremento para el control
			//Para que me ejecutes lo siguiente
			System.out.println("Hola mundo " + i);
			
		}
		
		
				
	}//Cierre del main

}//Cierre de la clase 
