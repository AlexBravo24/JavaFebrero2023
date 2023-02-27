/*5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
 * Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.*/
package com;

public class Array5_MGAV {

	public static void main(String[] args) {
		
		String productos[] = {"Libreta", "Lapicero", "Marcador", "Sacapuntas", "Goma"};
		double precios[] = {22.5, 5, 28, 5, 15};
		
		for(int i=0; i<productos.length; i++) {
			System.out.println(productos[i]+"  $"+precios[i]);
		}

	}

}
