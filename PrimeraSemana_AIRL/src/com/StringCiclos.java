package com;

public class StringCiclos {

	public static void main(String[] args) {
		
//		//Metodo de  la clase String
//		String cadena = "Hoy es 15 de Febrero de 2023";
//		
//		//.length nos devuelve el tamaño o longitud de la cadena en valor númerico
//		//detecta espacios porque cuenta como caracter
//		System.out.println(cadena.length());
//
//		
//		//charAt nos devuelve el caracter que se encuentra en la posicion indicada
//		System.out.println(cadena.charAt(0));//imprime el caracter de la posicion 0
//		
//		System.out.println(cadena.charAt(cadena.length()-1));//imprime el ultimo valor sin colocar manualmente la posicion
//		
//		//.substring (int index) nos devuelve la cadena a partir del indice indicado puedes indicar dos parametros(inicio,fin)
//		System.out.println(cadena.substring(8));
//		System.out.println(cadena.substring(8 , 25));
//		
//		//.toLowerCase convierte la cadena de texto en minusculas
//		System.out.println(cadena.toLowerCase());
//		
//		//.toUpperCase convierte la cadena de texto en mayusculas
//		System.out.println(cadena.toUpperCase());
//		
//		//.equals (Objet ob) compara y devuelve un valor true / false
//		System.out.println(cadena.equals("Hoy es 15 de Enero 2023"));
//		
//		//.equalsIgnoreCase compara los strings ingorando si tiene mayusculas o minusculas (no es sensible)
//		System.out.println(cadena.equalsIgnoreCase("hoy es 15 de FEBRERO de 2023"));
		
		//CICLOS O BUCLES
		//estructuras que nos permiten repetir o ejecutar varias sentencias o procesos
		
		//while mientras se cumpla una condicion, generalmente se usan variables numericas como 
		//referencia o control
		
//		int x = 1;//declaro una variable y la inicializo en 1
//		while (x < 5) {//mientras x tenga un valor menor a 5
//			//ejecuta la siguiente instruccion
//			System.out.println("Hola While");
//			x++;//una vez que realice una ejecucion aumenta en 1 la variable x
//		}
		
		//do while permite asegurar de que si la condicion no se cumple, que el programa se ejecute
		//por lo menos una vez
		
//		int y = 5;
//		do {
//			System.out.println("Hola ejecutado 1 vez");
//			y--;
//		}while(y > 1);
		
		//for para
		for(int i=1; i<5; i++) {//declaro mi variable de control, doy una condicion, un incremento para el control
			//para que ejecutes lo siguiente
			System.out.println("Hola Mundo "+i);
		}
		
		
	}

}
