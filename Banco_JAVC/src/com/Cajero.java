package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {
	
	int folio = 0;
	private String sucursal;
	
	//HashMap - Me permitirá simular una pequeña base de datos
	//En la cual voy a tener a mis registros de cuentas, identificados por una llave
	//que va a ser el nombre del cliente (String) y el valor será un objeto cuenta
    private HashMap <String, Cuenta> cuentas;
    
    public Cajero () {}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta = null; //instanciamos un objeto cuenta
		
		for(String i:this.cuentas.keySet()) { //Iteramos sobre cada llave del objeto
			if(i.contentEquals (nombreCliente)) {
				cuenta = this.cuentas.get(i);
				break;
				
			}
		}
		
		return cuenta; //si localiza una cuenta me mostrará en pantalla el valor de la cuenta
		
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		Ticket ticket = null;
		
		//Si la busqueda de la cuenta se realizó entonces necesitamos acceder a esa cuenta
		if(this.buscarCuenta(nombreCliente)!=null) { //si encontramos una cuenta
			//instanciamos un objeto cuenta al cual pasarle ese valor
			Cuenta cuenta =this.buscarCuenta(nombreCliente);
			//Realizamos otras validaciones anidadas. si ya identificamos la cuneta
			//sobre la cual se realizara el deposito
		if(monto>cuenta.getMax()) {
		System.out.println ("El monto excede el saldo máximo permitido");
		return ticket;
		
		}else if (cuenta.getSaldo()+monto>cuenta.getMax()) {
		System.out.println("El monto excede el saldo maximo permitido");
		return ticket;
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			
			ticket = new Ticket(folio++,new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), this.sucursal,1);
			return ticket;
		}
		}else {
			System.out.println("No hay una cuenta asociada a ese cleinte");
			return ticket;
		}
	}//

	@Override
	public Ticket retirar(String nombreCliente, double monto) {
		Ticket ticket = null;
		if(this.buscarCuenta(nombreCliente)!=null) { //si encontramos una cuenta
			//instanciamos un objeto cuenta al cual pasarle ese valor
			Cuenta cuenta =this.buscarCuenta(nombreCliente);
			//Realizamos validaciones
			
			if (monto>8000) {
				System.out.println("El monto excede el máximo permitido para retiros");
				return ticket;
				//Validamos si el saldo que tiene la cuenta es menor al monto a retirar
			
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insufuciente para el retiro");
				return ticket;
				//Validamos si el retiro dejaría por debajo del minimo a la cuenta
				
		}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
			System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
			return ticket;
		}else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			ticket = new Ticket (folio++,new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), this.sucursal,1);
			return ticket;
			
		}
			
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		Ticket ticket = null;
		
		if (this.buscarCuenta(clienteOrigen)!=null && this.buscarCuenta(clienteDestino)!=null) {
		Cuenta origen = this.buscarCuenta (clienteOrigen);
		Cuenta destino = this.buscarCuenta (clienteDestino);
		
		if(origen.getSaldo()<monto) {
			System.out.println("No hay fondos suficientes para realizar transacción");
			return ticket;
			
		}else if (origen.getSaldo()-monto<origen.getMin()) {
			System.out.println("La transferencia dejaría por debajo del mínimo a la cuenta");
			return ticket;
			
		}else if (monto>destino.getMax()) {
			System.out.println("El monot excede el limite máximo permitido en la cuenta destino");{
			return ticket;
		}
		
	//Si el saldo de la cuenta el monto superan el limite máximo 
		//que no nos permita realizar la operación
	}else if (destino.getSaldo() +monto>destino.getMax()) {
		System.out.println("El saldo de la cuenta destino excede el limite permito");
			return ticket;
		}else {
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			ticket = new Ticket(folio++,new Date(), origen.getNumCuenta(), origen.getSaldo(), this.sucursal,1);
			return ticket;
		}
	}else {
		System.out.println("Alguno de los clientes no tiene una cueta asociada");
		return ticket;
	}
		
}
}
    //implementando acciones
	
	
	
    

