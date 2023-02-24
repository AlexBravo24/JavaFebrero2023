package com;
//EJERCICIO 5
//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//respectivos precios. Muestra en consola la lista de productos y sus precios. 
//Por lo menos 5 productos o artículos

public class Array5 {

	public static void main(String[] args) {
  String productos[]  = {"Zapatillas","Tennis","Botas","Chanclas","Zapatos"};
  int precios [] = {500,1500,1000,200,2000};
  System.out.println("Lista de productos y sus precios: ");
  for(int i=0; i<productos.length;i++) {
	  System.out.println(productos[i]+" $"+ precios[i]);
  }
  
  

	}

}
