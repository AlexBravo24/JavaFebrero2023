package com;

public interface Metodos {

	
	// nuestra lista de metodos/repositorio
	
	public Productos buscarproducto(String nombreproducto);//identificare mi productor - id 
	public Ticket depositar(String nombreproducto, double monto);// identifico el producto a comprar y el monto 
	public Ticket retirar(String nombreproducto, double monto); //identico el retiro del producto 
	
}
