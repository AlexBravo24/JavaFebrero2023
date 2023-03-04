package com;

import dom.Producto;

public interface iProducto {

	public Producto buscarProducto(String posicion);
	
	public String tomarProducto(String posicion, int cantidad);
	
	public String agregarProducto(String posicion, int cantidad);
	
	public String moverProducto(String posicion, String posicionnueva);
	
}
