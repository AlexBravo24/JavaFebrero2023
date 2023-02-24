package com;

import java.text.Normalizer;
import java.util.Scanner;

public class Ciclos3_MOD {

	public static void main(String[] args) {
		// Ejercicio 3 - Realiza un programa para determinar si un String es palíndromo.
		
		String palabra, pInvertida="", palabraSinEspacios="", cadena2="", palabraR;
		char[] arrayPalabra;
		char[] pInvertida2;
		
		
		System.out.println("----------------------------------");
		System.out.println("|        Palíndromos ^._.^       |");
		System.out.println("----------------------------------\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el texto: ");
		palabra = entrada.nextLine();
		
		entrada.close();
		
		//Esta variable se creo con fines de estetica XD
		palabraR = palabra;
		
		// Normaliza y se basa en codigo ASCII para ver letras con acento como iguales
		palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD);
		palabra = palabra.replaceAll("[^\\p{ASCII}]", "");
		
		// Quitamos los espacios para una comparacion mas sencilla
		palabraSinEspacios = palabra.replace(" ", "");
		
		// Convertimos la palabra a un array de caracteres
		arrayPalabra = palabraSinEspacios.toCharArray();
		pInvertida2 = palabraR.toCharArray();
		
		// creamos la parabra invertida recorriendo el array inversamente CON ESPACIOS(Tambien se creo con fines de estetica XD)
		for (int i = pInvertida2.length - 1; i >=0; i--) {
			cadena2 = cadena2 + pInvertida2[i];
		}
		
		// creamos la parabra invertida recorriendo el array inversamente SIN ESPACIOS
		for (int i = arrayPalabra.length - 1; i >=0; i--) {
			pInvertida = pInvertida + arrayPalabra[i];
		}
		
		// Validamos si es un palindromo
		if (pInvertida.equalsIgnoreCase(palabraSinEspacios)) {
			System.out.println("\nSu texto es un palíndromo! \n:::  " + palabraR + " --> " + cadena2);
		}else {
			System.out.println("\nSu texto NO es un palíndromo! \n:::  " + palabraR + " --> " + cadena2);
		}
		
	}

}
