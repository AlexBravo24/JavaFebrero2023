package com;

import java.util.Date;
import java.util.HashMap;

//Cajero va a ser la clase que va a permitirme implementar
	//las acciones o la lógica

public class Cajero implements Metodos {	
	
	private String sucursal;
	
	private int folio=0;
	//HashMap -  Me va a permitir simular una pequeña base de datos 
	//En la cual voy a tener a mis registros de cuentas, identificados por una llave
	//que va a ser el nombre del cliente (string) y el valor será un objeto Cuenta
	
	
	private HashMap<String, Cuenta> cuentas;
	
	public Cajero () {}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta= null; //Instanciando un objeto cuenta 
		
		//Identificar la cuenta sobre la cual vamos a realizar operaciones
		//buscamos dentro del conjunto de llaves del HashMap 
		
		for (String i:this.cuentas.keySet()) { //Iteramos sobre cada llave del objeto cuenta
			//Una vez qye recorrimos las cuentas, si una de ellas es igual al nombre del cliente
			//que queremos buscar
			if (i.contentEquals(nombreCliente)) { 
				cuenta=this.cuentas.get(i);
				// Entonces nuestro objeto cuenta=null
				//de la cuenta localizada
				break; //Rompo el ciclo de busqueda
				
			}
		}
		return cuenta; //Si localiza una cuenta, en pantalla mostrará el valor de la cuenta 
	}

	
	@Override
	public Ticket depositar(String nombreCliente, double monto) {

        //Instanciamos un ticket vacío 
		Ticket ticket = null;
		//Un cajero antes de realizar una operación, debe realizar ciertas validaciones
		//Si la busqueda de la cuenta se realizó entonces  necesitamos acceder a esa cuenta
		
		if (this.buscarCuenta(nombreCliente)!=null) { //Si encontramos una cuenta
			//Instanciamos un objeto cuenta al cual pasarle ese valor
			Cuenta cuenta= this.buscarCuenta(nombreCliente);
			//Realizamos otras validaciones anidadas. Si ya identificamos la cuenta
			//sobre la cual se va a realizar el deposito 
			//
			if (monto>cuenta.getMax()) {//Si el monto a depositar es mayor al limite máximo
				//de la cuenta entonces que nos de un mensaje en pantalla:
				System.out.println("El monto excede el saldo máximo permitido en la cuenta ");
             return ticket;
			}else if (cuenta.getSaldo() +monto> cuenta.getMax()) {
            	 //mas el monto que nos depositen excede el limite máximo permitido en la cuenta
            	 System.out.println("El monto excede el sando máximo permitido en la cuenta ");
             return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo() + monto); //Actualizamos el saldo de la cuenta
				//Sumando el saldo existente más el monto depositado 
				//Entonces actualizamos los valores del ticket que se va a recibir
				ticket = new Ticket (folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente ");
           return ticket;			
		}
 
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) {
		Ticket ticket = null;
		
		if(this.buscarCuenta(nombreCliente)!=null) { //Si encontramos una cuenta
			//Instanciamos un objeto cuenta al cual pasarle ese valor
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
		//Realizamos validaciones
			//Validamos un máximo de retiro que nos permita el cajero
		if (monto>8000) {
			System.out.println("El monto excede el máximo permitido para retiros");
			return ticket;
		//Validamos si el saldo que tiene la cuenta es menor al monto a retirar	
		}else if(cuenta.getSaldo()<monto) {
			System.out.println("Saldo insuficiente para el retiro");
			return ticket;
		//Validamos si el retiro dejaría por debajo del mínimo a la cuenta	
		}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
			System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
			return ticket;
			//Si el retiro puede realizarse
		}else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			ticket = new Ticket(folio++, new Date(),cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal,1);
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
		
		//Buscamos la cuenta tanto de origen como de destino
		if (this.buscarCuenta(clienteOrigen)!=null && this.buscarCuenta(clienteDestino)!=null) {
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			//Realizamos nuestras validaciones
		//Si la cuenta de origen tiene un saldo menor al monto a transferir
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return ticket;
		//Si el monto a transferir deja por debajo del mínimo a la cuenta origen		
			} else if (origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("La transferencia dejaría por debajo del mínimo a la cuenta");
				return ticket;
				//Si el monto que vamos a transferir es mayor al saldo máximo que puede tener la cuenta destino
				
			}else if (monto>destino.getMax()) {
				System.out.println("El monto excede el límite máximo permitido en la cuenta de destino");
				return ticket;
				//Si el saldo de la cuenta más el monto superan también el máximo permitido en la cuenta de destino
			} else if (destino.getSaldo() + monto>destino.getMax() ) {
				System.out.println("El saldo de la cuenta destino excedería el máximo permitido");
				return ticket;
			}else  {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(),origen.getNumcuenta(), origen.getSaldo(), this.sucursal,1);
				return ticket;
			}
		}else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
		return ticket;
		}
	}
	
}
