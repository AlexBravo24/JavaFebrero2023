package com;

import java.util.Scanner;

public class Ejercicio4_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String cadena;
//		char letra;
//		
//		System.out.println("Introduzca una letra: ");
//		letra = entrada.next().charAt(0);
//		
//		
//		if (Character.isUpperCase(letra)) {
//			System.out.println(letra +" es MAYUSCULA ");
//		}
//		
//		else {
//			System.out.println(letra +" es minuscula");
//		}

		System.out.println("Ingrese una cadena de texto: ");
		cadena = entrada.nextLine();
		entrada.close();
		
		if(cadena.equals(cadena.toUpperCase())) { //compara la cadena original y la cadena convertida en mayusculas
			System.out.println("lA CADENA ESTA EN MAYUSCULAS");
		}
		else if(cadena.equals(cadena.toLowerCase())){ //compara la cadena original y convertida en minusculas
			System.out.println("la cadena esta en minusculas");
		}
		else {
			System.out.println("la cadena combina MAYUSCULAS y minusculas");
		}
		
		
	}

}
