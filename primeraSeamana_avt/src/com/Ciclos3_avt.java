package com;

import java.util.Scanner;

public class Ciclos3_avt {

	public static void main(String[] args) {
		String palabras="";
		String comprobacion="";
		Scanner Entrada = new Scanner(System.in);
		System.out.println("ingrese la palabra");
		palabras=Entrada.nextLine();
		for(int i=1;i < palabras.length();i++) {
			comprobacion=palabras.charAt(i)+comprobacion;
		}
		if(palabras.equals(comprobacion)) {
			System.out.println("si es un palindromo");
		}else {
			System.out.println("no es un palindromo");
		}

	}

}
