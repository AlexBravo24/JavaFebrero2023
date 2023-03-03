package com;

public interface Metodos {

    //Lista de métodos de implementar 
	// o repositorio de métodos 
	
	//Antes de poder realizar operaciones en una cuenta
	//tenemos que identificar la cuenta sobre la que 
	//se va a operar
	
	public Cuenta buscarCuenta(String nombreCliente);
	// Identifico mi cuenta con la llave o id (nombre del cliente)
	
	
	//Para realizar las operaciones de deposito, transferencia o retiro 
	//quiero que me devuelva el registro de la operación en un ticket 
	
	public Ticket depositar (String nombreCliente, double monto); 
	
	//Identifico la persona o cuenta a depositar y retirar el monto 
	public Ticket retirar (String nombreCliente, double monto);
	
	
	//Para realizar una transferencia a una cuenta
	//Identificamos una cuenta de origen y una cuenta de destino 
	
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto);
	
	
	
	
	
	
	
	
	
	
}
