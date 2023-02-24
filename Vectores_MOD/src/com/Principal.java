package com;

import java.util.Vector;

public class Principal {
	public static void main(String[] args) {
		/*Vectores -
		 * Definicion:
		 * Un vector es similar a un array, la diferencia estriba en que un vector crece autom�ticamente cuando alcanza la dimensi�n inicial m�xima. 
		 * Adem�s, proporciona m�todos adicionales para a�adir, eliminar elementos, e insertar elementos entre otros dos existentes.
		 * */
		
		//Declaracion de un vector
		//Declarando tama�o inicial y cuanto mas puede crecer
		Vector vector1 = new Vector(20, 5);
		
		//Declarando el tama�o inicial solamente (si se rebasa el tama�o su capacidad se duplica)
		Vector<Integer> vector2 = new Vector<Integer>(10);
		
		//Sin algun tama�o definido definido
		Vector<Integer> vector3 = new Vector<Integer>();
		
		//size() obtiene el tama�o del vector
		System.out.println("vector1: " + vector1.size() 
						+ "\nvector2: " + vector2.size() 
						+ "\nvector3: " + vector3.size());
		
		//Agregar elementos a un vector
		for (int i = 26; i >=0; i--) {
			//mediante add(valor)
			vector1.add(i);
			vector2.add(i);
			vector3.add(i);
		}
		
		//mediante addElement()
		vector1.addElement(8);
		
		//este metodo inserta un elemento en el indice indicado y el que estaba ahi lo desplaza una posicion despues
		vector1.insertElementAt(9, 2);
		
		//impresion del vector
		System.out.println(vector1);
		System.out.println(vector2);
		System.out.println(vector3);
		
		System.out.println("vector1: " + vector1.size() 
		+ "\nvector2: " + vector2.size() 
		+ "\nvector3: " + vector3.size());
		
		//Eliminar un elemento del vector mediante el indice
		vector1.remove(5);
		vector2.remove(7);
		vector3.remove(2);
		
		System.out.println(vector1);
		System.out.println(vector2);
		System.out.println(vector3);
	
		System.out.println("vector1: " + vector1.size() 
		+ "\nvector2: " + vector2.size() 
		+ "\nvector3: " + vector3.size());
	}
}
