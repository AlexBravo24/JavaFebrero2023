package com;

import java.util.Scanner;

public class EjemploVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Hemos empleado variables de distinto tipo para el almacenamiento de datos (variables int, float, String)
		 *  En esta sección veremos otros tipos de variables que permiten almacenar un conjunto de datos en una única
		 *   variable.

		Un vector es una estructura de datos que permite almacenar un CONJUNTO de datos del MISMO tipo.
		Con un único nombre se define un vector y por medio de un subíndice hacemos referencia a cada elemento 
		del mismo (componente)*/
		
		final int TAMANO = 26;
	    char[] listaLetras = new char[TAMANO];
	    char letra = 'A';
	 
	    //Asignación de letras a cada elemento del vector
	    for(int i=0; i<TAMANO; i++) {
	        listaLetras[i] = letra;
	        letra++;
	    }
	 
	    //Mostrar en pantalla el vector
	    for(int i=0; i<TAMANO; i++) {
	        System.out.print(listaLetras[i]+" ");
	    }
	}

}
