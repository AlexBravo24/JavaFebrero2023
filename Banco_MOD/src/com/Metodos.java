package com;

public interface Metodos {
	
	//Lista de metodos a implementar o repositorio de metodos
	
	//Antes de realizar operacion debemos identificar cuenta
	public Cuenta buscarCuenta(String nombreCliente);
	
	public Ticket depositar(String nombreCliiente, double monto);
	
	public Ticket retirar(String nombreCliiente, double monto);
	
	public Ticket transferir(String cliienteOrigen, String cliienteDestino, double monto);
}
