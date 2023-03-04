package com;

import java.util.HashMap;

public class EjemploMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*En Java se usa HashMap para almacenar elementos en pares clave/valor y puedes acceder a estos elementos almacenados 
		 * en un HashMap utilizando la clave del elemento, que es única para cada elemento. */
		
		HashMap<Integer, String> ProductoInfo = new HashMap<Integer, String>();
		 
        ProductoInfo.put(1, "Zapatos de Cuero"); 
        ProductoInfo.put(2, "Casacas Cortaviento"); 
        ProductoInfo.put(3, "Zapatillas Running");
        
        /* Salida */
        System.out.println(ProductoInfo.get(2));
        // Casacas Cortaviento
          
        // Actualizar key 1
        ProductoInfo.replace(1, "Zandalias Moradas");
        
        /* Salida */
        System.out.println(ProductoInfo);
        // {1=Zandalias Moradas, 2=Casacas Cortaviento, 3=Zapatillas Running} 
        
     // Eliminar key 1
        ProductoInfo.remove(1);
        
        /* Salida */
        System.out.println(ProductoInfo);
        // 2=Casacas Cortaviento, 3=Zapatillas Running}
	}

}
