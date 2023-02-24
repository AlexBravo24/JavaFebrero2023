package com;

import java.lang.invoke.SwitchPoint;

public class EstructurasDeControl {

	public static void main(String[] args) {
		//Estructuras de decision - valores booleanos
		
		int x  = 11;
		
//		if ( x < 10 ) {
//			System.out.println("El valor es menor");
//		}else {
//			System.out.println("El valor es mayor");
//		}
		
		//Ejemplo con String
		
		String nombre = "Murcielago";
		
//		System.out.println(nombre.length());
		
//		if (nombre.length() >= 10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Al devolvernos el metodo length un valor numerico podemos realizar operaciones <>
		
//		System.out.println(nombre.length() + x);
		
		//Comentar una o varias lineas; seleccionamos el codigo y presionamos --> ctrl + 7
		
		//Condiciones con operadores logicos AND, OR, NOT, DIFERENTE DE, IGUALDAD. (&&, ||, !, ==) nombre.equalsIgnoreCase("murcielago")
		
		//AND - &&
		
//		if (nombre.length() < 20 && nombre.length() > 9 && nombre.equalsIgnoreCase("murcielago")) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//
//		}
//		
//		//OR - ||
//		
//		if (nombre.length() > 9 || nombre.equals("muercielago")) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//NOT - ! (Niega una condicion) cambia el valor de true a falso y viceversa
//		if (!(nombre.length() > 9)) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		//IGUALDAD - == (Realiza una comparacion de igualdad)
//		if (x == 20) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - !=
//		if (x != 10) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
//		int d = 6;
//		
//		if (d == 1) {
//			System.out.println("Lunes");
//		} else if(d == 2){
//			System.out.println("Martes");
//		}else if(d == 3) {
//			System.out.println("Miercoles");
//		}else if (d == 4) {
//			System.out.println("Jueves");
//		}else if (d == 5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		//Estructura de control switch-case
		
		int dia = 6;
		
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Desconocido");
		}
		
	}

}
