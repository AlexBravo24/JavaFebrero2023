package com;

public class StringCiclos {

	public static void main(String[] args) {
		// M�TODOS DE LA CLASE STRING
		
//		String cadena= "Hoy es 15 de febrero de 2023";
//		//.length() (Nos devuelve el tama�o o longitud de la cadena en valor num�rico)
//		//Incluye los espacios que son detectados como caracteres
//		System.out.println(cadena.length());
//      
//		
//		//.charAt (Nos devuelve el caracter que se encuentre en el �ndice especificado)
//		//System.out.println(cadena.charAt(cadena.length()-1)); en caso de que no sepamos la posici�n
//		System.out.println(cadena.charAt(9));
//		
//		//.substring (int index)- Nos devuelve una subcadena a partir del �ndice indicado  
//		System.out.println(cadena.substring(8,25));
//		
//		//.LoLowerCase convertir la cadena de texto en minusc�las
//		System.out.println(cadena.toLowerCase());
//		
//		//toUpperCase (Convertir la cadena de texto en may�sculas)
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals (Object ob) (Comparar Strings y devolver un valor true o false
//		System.out.println(cadena.equals("Hoy es 15 de mayo de 2023"));
//		
//		//.equalsIgnoreCase (Compara los Strings ignorando si tienen mayusculas o minusculas
//		System.out.println(cadena.equalsIgnoreCase("HOY ES 15 DE FEBRERO DE 2023"));
//		
		
		  //CICLOS O TAMBI�N LLAMADOS BUCLES
		//Estructuras que nos van a permitir repetir o ejecutar varias sentencias o procesos.
		
		
		//while (Mientras se cumpla una condici�n se va a ejecutar una acci�n)
		//Generalmente utilizamos resultados num�ricos o variables num�ricas para tenerlas como
		//referencia o control
		
//		int x= 1; //Declaro una variable 
//		
//		while (x<5) {//Mientras x tenga un valor menor a 5
//			//que ejecute los iguiente
//			System.out.println("Hola mundo");
//			x++;
//			
//		}
		
		
		//DO-WHILE (Nos aseguramos de que si la condici�n no se cumple, el programa se ejecute
		//por lo menos 1 vez
		
//		int y = 5;
//		
//		do {//Ejecutar lo siguiente se cumpla o no una condici�n
//			System.out.println("Hola mundo");
//			y--; //Si necesito un control, lo indico, si no podemos omitirlo
//		} while (y>1); 
		
		//FOR (Para)
		
		for (int i= 1; i<5; i++) {//declaro mi variable de control,doy una condici�n y un incremento para el control
			//Para que me ejecutes lo siguiente
			System.out.println("Hola mundo " + i);
			
		}
		
		
				
	}//Cierre del main

}//Cierre de la clase 
