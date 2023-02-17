package com;

import java.util.Scanner;

//EJERCICIO 3
//Realiza un programa para determinar si un String es palíndromo.

public class Ciclos3_CHC {

	public static void main(String[] args) {
	Scanner entrada= new Scanner (System.in);
	String palabra;
	char [] palindromo; //Se define como char ya que es una cadena de caracteres
	int izq, der;
	System.out.println("Ingresa la palabra"); //Se pide al usuario ingresar la palabra 
	palabra = entrada.nextLine();
	palabra=palabra.toLowerCase();//De esta manera aunque se pongan mayusculas lo va a detectar 
	palabra=palabra.replace(" ",""); //Para quitar los espacios en blanco.
	palindromo= palabra.toCharArray(); //Separa letra por letra
	
    izq = 0;
	der= palindromo.length-1; //Nos indica el tamaño de la palabra se agrega -1 porque la númeración empieza en 0
			
	while (izq<der) { //Realiza la comparación
		if(palindromo[izq]== palindromo[der]) {
			der --;
			izq++;
		} else {
			System.out.println("La palabra no es un palíndromo");
		break;
		}
	}
			
	
	if (izq==der) {
		System.out.println("La palabra es palíndromo");
	}
	}
}

