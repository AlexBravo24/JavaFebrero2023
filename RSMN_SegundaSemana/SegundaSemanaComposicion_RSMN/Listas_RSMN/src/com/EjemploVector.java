package com;

import java.util.Scanner;

public class EjemploVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Hemos empleado variables de distinto tipo para el almacenamiento de datos (variables int, float, String)
		 *  En esta secci�n veremos otros tipos de variables que permiten almacenar un conjunto de datos en una �nica
		 *   variable.

		Un vector es una estructura de datos que permite almacenar un CONJUNTO de datos del MISMO tipo.
		Con un �nico nombre se define un vector y por medio de un sub�ndice hacemos referencia a cada elemento 
		del mismo (componente)*/
		
		final int TAMANO = 26;
	    char[] listaLetras = new char[TAMANO];
	    char letra = 'A';
	 
	    //Asignaci�n de letras a cada elemento del vector
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
