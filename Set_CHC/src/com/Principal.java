package com;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Principal {
	 public static void main(String[] args)
	    {
	//Definición de SET
	/*Está presente en el paquete 
	 *java.util y extiende la interfaz Collection
	 * Es una colección desordenada de objetos en la 
	 * que no se pueden almacenar valores duplicados
	 * Implementa el conjunto matemático y contiene los
	 * métodos heredados de la interfaz Collection y añade
	 * característica que restringe la inserción de los elementos
	 * duplicados.
	 */
	
	//Para declarar la Interface Set :
	
//	public interface Set extends Collection 
//	
	//Dado que Set es una interfaz, no se pueden crear objetos de la 
	//clase Set, siempre necesitamos una clase que extienda esta lista
	//para poder crear un objeto. 
	
	////Es posible restringir el tipo de objeto que 
	//puede ser almacenado en el Set. Este conjunto de tipo
	//seguro, se puede definir como:
	
	Set <String> hash_Set = new HashSet <String> ();
	
	//Añadimos elementos al Set
	hash_Set.add("BMTH");
	hash_Set.add("Linkin Park");
	hash_Set.add("MIW");
    hash_Set.add("Black Veil Vibes");
    hash_Set.add("Slipknot");
    
    //Imprimimos en Pantalla 
    for (String bandas: hash_Set) {
    System.out.println(bandas);
	    }
	

}
}
