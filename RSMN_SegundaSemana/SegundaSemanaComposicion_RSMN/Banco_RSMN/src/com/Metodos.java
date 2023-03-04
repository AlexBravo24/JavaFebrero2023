package com;

public interface Metodos {

	
	// lista de metodos a implemntar
	// o repositorio de metodos
	
	// antes de realizar operaciones en una cuenta
	//tenemos que indicar la cuenta sobre la que
	// se va a operar
	
	public Cuenta buscarCuenta(String nombreCliente);// identificar mi cuenta
	// con la llave o id (nombre del cliente)
	
	//para realizar las operaciones de deposito, transferencia o retiro
	// quiero que me devuelva el registro de la operacion en un ticket
	public Ticket depositar(String nombreCliente, double monto);
	
	//identificar la persona o cuenta a depositar y el monto
	public Ticket retirar(String nombreCliente, double monto);
	
	//para realizar una transferencia a una cuenta
	//identificamos una cuenta de origen y una cuenta de destino
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto);
}
