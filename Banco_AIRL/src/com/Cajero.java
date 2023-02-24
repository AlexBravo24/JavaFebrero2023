package com;

import java.util.Date;
import java.util.HashMap;

//Cajero va a ser la clase que va a permitirme  implementar las acciones o la logica
public class Cajero implements Metodos{
	
	private String sucursal;
	
	//HashMap me va a permitir simular una pequeña BD, en la cual voy a tener mis registros
	//identificados por una llave que va a ser el nombre del cliente (String) y el valor sera un objeto Cuenta 
	private HashMap<String, Cuenta> cuentas;
	int folio=0;
	
	public Cajero() {
		
	}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	
	
	//Implementando las acciones
	

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		
		Cuenta cuenta = null;//Instanciando un objeto cuenta
		
		//Identificar la cuenta sobre la cual vamos a realizar operaciones
		//Buscamos dentro del conjunto de llaves del HashMap
		
		cuenta = cuentas.get(nombreCliente);
		
//		for(String i:cuentas.keySet()) {//Iteramos sobre cada llave del objeto cuenta
//			if(i.contentEquals(nombreCliente)) {//una vez que recorrimos las cuentas, si una de ellas
//			//es igual al nombre del cliente que queremos buscar	
//				cuenta = this.cuentas.get(i);//Entonces nuestro objeto cuenta = null, toma el valor
//				//de la cuenta localizada
//				break;//Rompo el ciclo for
//			}
//		}
		
		return cuenta;//Si localiza una cuenta, en la pantalla me mostrara el vealor de la cuenta
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		
		//Instanciamos un ticket vacio
		Ticket ticket = null;
		//Si la busqueda de la cuenta se realizó, entonces necesitamos acceder a la cuenta
		if(this.buscarCuenta(nombreCliente)!=null) {//Si encontramos una cuenta
			//Instanciamos un objeto cuenta al cual pasarle ese valor
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			
			//Realizamos otras validaciones anidadas, si ya se identifico la cuenta sobre la cual
			//vamos a realizar el deposito
			if(monto > cuenta.getMax()) {//Si el monto es mayor al limite maximo de la cuenta
				System.out.println("El monto excede el saldo maximo permitido");
				return ticket;
			}else if(cuenta.getSaldo()+monto>cuenta.getMax()) {//si el saldo de la cuenta mas el monto, excde el limite maximo de la cuenta
				System.out.println("El monto con el saldo actual excede el saldo maximo permitido");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);//Actualizamos el saldo de la cuenta 
				//sumando el salario existente mas el monto del deposito
				//Entonces actualizamos los valores del ticket que se va a recibir
				ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
		
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) {
		
		Ticket ticket = null;
		if(this.buscarCuenta(nombreCliente)!=null) {//Si encontramos una cuenta
			//Instanciamos un objeto cuenta al cual pasarle ese valor
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			
			//Realizamos validaciones
			//Validamos un maximo de retiros permitidos
			if(monto>8000) {
				System.out.println("El monto excede el retiro maximo permitido");
				return ticket;
			}else if(cuenta.getSaldo()<monto) {//validamos si el saldo de la cuenta es menor al monto a retirar
				System.out.println("Saldo Insuficiente");
				return ticket;
			}else if(cuenta.getSaldo()-monto < cuenta.getMin()) {
				System.out.println("El retiro ocasiona que el saldo sea menor al minimo establecido");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumcuenta(), cuenta.getSaldo(), this.sucursal, 1);
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
		
		if(this.buscarCuenta(clienteOrigen) != null && this.buscarCuenta(clienteDestino) != null) {
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			
			//Realizamos validaciones
			if(origen.getSaldo()<monto) {//si la cuenta origen tiene un saldo menor al monto a transferir
				System.out.println("Fondos insuficientes");
				return ticket;
			}else if(origen.getSaldo()-monto<origen.getMin()) {//Si el monto a transferir deja por debajo del minimo a la cuenta origen
				System.out.println("El monto de la tranferencia dejaria por debajo del minimo a la cuenta");
				return ticket;
			}else if(monto>destino.getMax()) {//si el monto que vamos a transferir es mayor al saldo maximo permitido
				System.out.println("El monto de la transferencia excede el maximo permitido de la cuenta destino");
				return ticket;
			}else if(destino.getSaldo()+monto>destino.getMax()) {//si el saldo de la cuenta con el monto supera tambien el maximo permitido 
				System.out.println("El saldo de la cuenta destino excederia el maximo permitido");
				return ticket;
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), origen.getNumcuenta(), origen.getSaldo(), this.sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
	
	}
	
	
}
