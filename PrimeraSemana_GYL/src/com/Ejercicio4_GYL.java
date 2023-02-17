package com;

import java.util.Scanner;
import java.util.function.Function;

public class Ejercicio4_GYL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		String texto;
		String texto2;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce texto: ");
		
		texto=entrada.nextLine();
		texto2=texto.toLowerCase();
		
		
		if (texto.equals(texto2)) {
		    System.out.println("Está formada por minusculas");
		  } else {
		    System.out.println("Tiene mayusculas");
		  }
}}
