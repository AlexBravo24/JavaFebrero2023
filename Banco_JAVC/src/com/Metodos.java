package com;

public interface Metodos {
	
	//Lista de métodos de implementar
	//o repositorio de metodos
	
	//Antes de poder realizar operaciones en una cuenta
	//tenemos que identificar la cuenta sobre la que
	//se va a operar
	
	public Cuenta buscarCuenta(String nombreCliente); //Identifico mi cuenta
	//con la llave o id (nombre del cliente)
	
	public Ticket depositar (String nombreCliente, double monto);
	//Identificamos la persona p cuenta a depositar o retirar y el monto
	public Ticket retirar (String nombreCliente, double monto);
	
	//Para realizar una transferencia a una cuenta
	//Identificamos una cuenta de origen y una cuenta de destino
	public Ticket transferir (String clienteOrigen, String clienteDestino, double monto);
	

}
