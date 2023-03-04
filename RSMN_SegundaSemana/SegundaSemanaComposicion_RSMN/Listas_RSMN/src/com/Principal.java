package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Las listas son un tipo de colección que hereda de la interface collection, 
		 * son una estructura de datos que respeta el orden en el cual fueron agregados los elementos,
		 *  también permiten registros repetidos.*/
		
		// Declaración el ArrayList
		ArrayList<String> nombreArrayList = new ArrayList<String>();

		// Añadimos 10 Elementos en el ArrayList
		for (int i=1; i<=5; i++){
			nombreArrayList.add("Elemento "+i); 
		}

		// Añadimos un nuevo elemento al ArrayList en la posición 2
		nombreArrayList.add(2, "Elemento 3");

		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
		Iterator<String> nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}

		System.out.println("n... Eliminamos el primer elemento del ArrayList ("+nombreArrayList.get(0)+")...");
		nombreArrayList.remove(0);

}
}
