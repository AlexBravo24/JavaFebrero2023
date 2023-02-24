package com;

public interface Imetodos {
	
	// lista de metodos a implementar 
	// repositorio de metodos 
	
	// antes de poder realix¿zar operacione en una cuenta 
	//tenmos que ienificar la cuenta sobre la que se va operar
	
	public Cuenta buscaCuenta(String nombreCliente );//identifica mi cuenta 
	//con la llave o id (nombre del cliente )
	//para realizar las operaciones deposito, transferencia, o retiros 
	//quiero que se me devuelva un tiket por cada operacion 
	
	public Ticket depositar(String nombreCliente, double monto);
	
	//identifica la persona o cuenta a depositar y el monto 
	public Ticket retirar(String nombreCliente, double monto);
	
	// para realiar una transferencia a ina cuenta 
    // identificamos una cuenta de origen y un num de cuenta de destino
	
	public Ticket transferir(String clienteOrigen, String ClienteDestino, double monto);

}
