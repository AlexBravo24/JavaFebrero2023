package com;

public class Stringciclos {

	public static void main(String[] args) {
		
		String cadena= "hoy es 15 de febrero 2023";
		//.length nos devuelve el tamaño o longitud de la cadena
		//incluye losespacios que son detectados como caracteres
		/*System.out.println(cadena.length());
		//.chartAt (nos devuelve el caracter que se encuentraen el indice especificado)
		System.out.println(cadena.charAt(0));
		
		//.substring (int index) nos devuelve una subcadena apartir del indice indicado
		System.out.println(cadena.substring(8));
		
		//.toLowerCase (convertir la cadena de texto en minuscula )
		System.out.println(cadena.toLowerCase());
		//.toUpperrCase (convertir el texto en mayusculas)
		System.out.println(cadena.toUpperCase());
		//.equals (object ob ) (comparar string y devolver un valor true y false
		System.out.println(cadena.equals("hoy es 15 de febrero"));
		//.equalsIgnoreCase ( compara los string ignorando si tienen mayusculas o minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 15 de febrero 2023"));
		
		//Ciclos o bubles 
		//Estructturas que nos van apermitir o ejecutara varias sentencias o procesos
		//while (mientras) se cumpla una condicion
		//generalmente tilizamos resultados nuemricos o variables numericas para tenerlas*/
		/*int x=1; 
		while (x<5) { //mientra xtenga un valor menor a 5
			//que ejecute lo siguiente
			System.out.println("hola mundo");
			x++;
		}*/
		//DO WHILE (nos aseguramos de que si la condicion no se cumple el programa se ejecute una sola ves
	/*	int y =5;
		do {//ejecutar lo siguiente se cumpla la condicion
			System.out.println("hola mundo");
		    y--;
		}while(y>6);*/
		 
		//for (para)
		for(int i =1;i<5;i++) {//
			System.out.println("hola mundo "+ i); 
		}
			
	}
}

