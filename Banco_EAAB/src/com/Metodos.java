package com;

public interface Metodos {
	
	
	//Lista de netodos a implementar o repositorio de metodos
	
	
	//Antes de poder relizar operaciones en la cuenta debemos identificar
	//la cuenta donde se va a operar
	
	public Cuenta buscarCuenta(String nombreCliente);
	//identifico mi cuenta con la llave (nombre del cliente)
	
	
	//para realizar las operaciones deposito, transferencia o retiro
	//requiero me devuelva el registro de la operacion en un ticket
	
	public Ticket depositar(String nombreCliente, double monto);
	//identifico la persona a depositar/retirar y el monto
	
	public Ticket retirar(String nombreCliente, double monto);
	
	//para realizar transferencia
	//identificamos cuenta origen y cuenta destino
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto);
	
	

}
