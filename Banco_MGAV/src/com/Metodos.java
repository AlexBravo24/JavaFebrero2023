package com;

public interface Metodos {
	//lista de metodos de implementar
	//o repositorio de metodos
	//antes de poder realizar operaciones enuna cuenta 
	//se va a operar
	public Cuenta buscarCuenta(String nombreCliente);
	
	//identifico mi cuenta cn a llave o id (nombre del cliente)
	//para realizar operaciones de deposito transferencia o retiro
	//quiero que devuelva el registro de la opercacion ticket
	
	public Ticket depositar(String nombreCliente, double monto);
	
	 //identifico la persona o cuenta  a depositar o retirar y su monto
	
	public Ticket retirar(String nombreCliente, double monto);
	
	//para realizar una transferenicia a una cuenta
	//identificamos la cuenta de origen y la de destino
	
	public Ticket transferir(String clienteOrigen, String clienteDEstino, double monto);
	
	

}
