package com;

import java.util.ArrayList;
import java.util.List;

public class Set_iniciales {
	
	public static void main(String[]args) {
		
		
		//Las listas admiten ciertas operaciones como son insertar un nodo adicional,
		//borrar un nodo, etc. En funci�n de la forma de insertar nuevos elementos y acceder
		//a los existente tendremos distintos tipos de listas.
		
		List ejemploLista = new ArrayList();
		
		      ejemploLista.add("Zahid ");
		      ejemploLista.add("Yocelin");
		      ejemploLista.add("Jos�");
		      ejemploLista.add("Tomy");
		      ejemploLista.add("spider man");
		

         System.out.println(ejemploLista.subList(0, 2));
		
	}

	
}
