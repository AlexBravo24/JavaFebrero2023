package com;

public interface IMetodos {
	
	//Lista de metodos a implementar 
	//o repositorio de metodos
   
	//IDENTIFICAR PRODUCTO SOBRE EL QUE SE DEBE OPERAR
	public Producto BuscarProducto (String nombreProducto);
	//Identifico con la llave o id (Nombre del cliente)
    //Para realizar una operacin (deposito, transf,o retiro)
	//Necesito un ticket
	// Descontar Producto
	public Ticket DescontarProducto(String nombreProducto,double pago);

}
