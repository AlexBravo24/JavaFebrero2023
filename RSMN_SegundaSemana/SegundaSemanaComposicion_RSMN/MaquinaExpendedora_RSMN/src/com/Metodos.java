package com;

public interface Metodos {
	
	public Producto buscarProducto(int folioProduto);
	
	public PrecioProducto pagarProducto(int pagarProducto, double monto);
	
	public PrecioProducto devolverCambio(int cambioProducto, double monto);

}
