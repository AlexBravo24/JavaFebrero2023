package com;

public interface Metodos {
	
	//lista de métodos a implementar o repositorio de métodos
	
	//antes de poder realiazar operaciones en una cuentatenemos que identificar
	//la cuenta sobre la que se va a operar
	
	public Cuenta buscarCuenta(String nombreCliente);//Identifico mi cuenta 
	//con la llave o id (nombre del cliente)
	
	
	//para realizar operaciones de deposito, transferencia o retiro
	//quiero que me devuelva el registro de la operacion  en un ticket
	public Ticket depositar(String nombreCliente, double monto);//Identifico la persona o cuenta y el monto
	
	public Ticket retirar(String nombreCliente, double monto);
	
	//Para realizar una transferencia a una cuenta
	//Idenfiticamos una cuenta origen y una cuenta destino
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto);
	

}
