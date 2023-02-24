package com;

import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
		// Vectores
		
		//Un vector es similar a un array, la diferencia estriba en que
		//un vector crece automáticamente cuando alcanza la dimensión inicial máxima.
		//Además, proporciona métodos adicionales para añadir, eliminar elementos, 
		//e insertar elementos entre otros dos existentes.
		
		
		//Crear un vector: 
		
		//1er constructor instanciamos y declaramos su dimension inicial y cuanto
		//crecerá si se rebasa dicha dimension
		
		Vector vec = new Vector(5,2); //dimension 5 elementos, si guardamos 6 crecera a 7
		
		//2do constructor solo con la dimension inicial, si se rebasa la inicial el vector se
		//duplica, TENER  CUIDADO CON VECTORES GRANDES PARA NO DESPERDICIAR MEMORIA
		
		Vector vec2 = new Vector(5); 
		
		//3er constructor, sin parametros por default se crea vector de 10 elementos
		//y si se rebasa se duplica
		
		Vector vec3 = new Vector();
		
		//añadir elementos al vector
		
		//addElement() se agrega elemento a continuacion del ultimo elemento
		
		vec.addElement("honda");
		vec.addElement("ford");
		vec.addElement("toyota");
		vec.addElement("kia");
		vec.addElement("mazda");
		
		System.out.println(vec);
		
		//insertElementAt(elemento, lugar) para agregar elemento en una ubicacion
		//especifica. SI TRATAMOS DE AGREGAR EN POSICION QUE NO EXISTE NOS DARA UNA EXCEPCION
		
		vec.insertElementAt("nissan", 5);
		System.out.println(vec);
		
		//size() para saber cuantos elementos guarda el vector
		System.out.println("num de elementos: "+vec.size());
		
		//capacity() para saber la dimension actual del vector
		System.out.println("capacidad: "+vec.capacity());
		
		//removeElement(valor) para borrar un elemento concreto por su valor
		vec.removeElement("kia");
		
		//removeElementAt(indice) para borrar un elemento en el indice dado
		vec.removeElementAt(1);
		
		//removeAllElements para borrar todos los elementos
		
		System.out.println(vec);
		
		//elementAt(indice) --> acceder a los elementos de un vector
		
		System.out.println(vec.elementAt(1));
		
		
		
		
		
		
		
		

	}

}
