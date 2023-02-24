package com;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Array {

	public static void main(String[] args) {
		// Arreglos  - declarando arrays
		// Ejemplo 1
		 char [] nombre = new char[6];
		 
		 //Asignacion de valores por index
		 nombre[0]='A';
		 nombre[1]='l';
		 nombre[2]='e';
		 nombre[3]='x';
		 nombre[4]='i';
		 nombre[5]='s';
		 
		// System.out.println(nombre[5])	;
		 
		 //Ejemplo 2 - array con longitud y valores iniciales
		 
		 char[] nombre2 = {'M', 'a', 'r', 't', 'i', 'n'};
		 for (char c : nombre2) {
			System.out.print(c);
		}
		 
		 for (int i = 0; i < nombre2.length; i++) {
			System.out.println(nombre2[i]);
		}
		 
		 
		 int[] numeros = {1, 2, 3, 4, 5, 6};
		 
		 String[] nombres = {"Alex", "Martin", "Gerardo", "Eduardo"};
		 
		 boolean [] valor = {true, false, true, false};
		 
		
	}

}
