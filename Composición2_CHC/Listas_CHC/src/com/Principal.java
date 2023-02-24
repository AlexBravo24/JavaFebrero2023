package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		/*LISTAS: Son un tipo de colección que hereda de la 
		 * interface collection, son una estructura de datos que
		 * respeta el orden en el cual fueron agregados los
		 * elementos, también permiten registros repetidos.
		 * 
		 */
		//Declarar una lista
		List<String> Nombres;
		
		Nombres= new ArrayList <>();
		//Agregamos datos a una lista 
		Nombres.add("Saúl");
		Nombres.add("Carolina");
		Nombres.add("Diego");
		Nombres.add("Iri");
		//Para imprimir en pantalla en forma de lista se realiza un ciclo For
		
		for (String nombre: Nombres) {
		 System.out.println(nombre);	
		}
		
		
		
		//Se eliminan datos de la lista con remove
		//Puede ser un dato especifico 
	    Nombres.remove("Iri");
	    for (String nombrex: Nombres) {
			 System.out.println(nombrex);	
			}
	    
	   
		
		
		
	}

}
