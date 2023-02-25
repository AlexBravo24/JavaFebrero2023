package com;

public interface IMetodos {
	
	//Lista de metodos a implementar 
	//o repositorio de metodos
   
	//IDENTIFICAR CUENTA SOBRE LA QUE SE DEBE OPERAR
	
	
	public Cuenta BuscarCuenta (String nombreCliente);
	//Identifico con la llave o id (Nombre del cliente)
    //Para realizar una operacin (deposito, transf,o retiro)
	//Necesito un ticket
	public Ticket Depositar(String nombreCliente, double monto);
    //identifico la persona o monto 
	public Ticket Retirar(String nomdreCliente, double monto);
	//Transferencias (cuenta origen, cuenta destino,monto)
	public Ticket Transferencia(String clienteOrigen, String clienteDestino, double monto);



	
	
	
	
	
	
	
}
