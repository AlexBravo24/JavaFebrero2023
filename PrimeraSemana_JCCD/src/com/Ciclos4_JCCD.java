package com;

import java.util.Scanner;

public class Ciclos4_JCCD
{
	private static int Contar(String texto, char caracter) {
		int contador = 0;
		for (int i = 0; i < texto.length(); i++)
		{
			if (texto.charAt(i) == caracter) {
				contador++;
			}
		}

		return contador;
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto;
		
		char ch;

		System.out.println("Ingresa el texto o palabra");
		texto = entrada.nextLine();
		
		System.out.println("Introduce la letra a buscar: ");
		ch = entrada.next().charAt(0);

		if(ch <= 1) {
			System.out.println("La letra \" + ch + \" aparece \" + Contar(texto, ch) + \" veces");
		}else {
			System.out.println("No aparece la letra");
		}
	}
}