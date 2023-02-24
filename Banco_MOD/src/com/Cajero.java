package com;

import java.util.Date;
import java.util.HashMap;

//Clase que va implementar las acciones o la logica
public class Cajero implements Metodos {

	private String sucursal;

	// me va permitir simular una pequeña base de datos, donde tendre a mis
	// registros de cuentas identificados con una llave,
	// donde el valor sera mi objeto cuenta
	private HashMap<String, Cuenta> cuentas;
	private int folio = 0;

	public Cajero() {
	}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta = null;
		// identificar la cuenta sobre la cual vamos a realizar operaciones
		// uscamos dentro del conjunto de llaves del HashMap
		for (String i : this.cuentas.keySet()) {
			// Si la cuenta coincide con la busqueda
			if (i.contentEquals(nombreCliente)) {
				// si coincide asignamos el valor encontrado a cuenta
				cuenta = this.cuentas.get(i);
				break;
			}
		}

		// Asignacion directa
		// cuenta = cuentas.get(nombreCliente);

		return cuenta;// retorna el valor de la cuenta encontrada
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		// instanciamos un ticket vacio
		Ticket ticket = null;
		// Si la cuenta existe entonces-> accedemos a la cuenta
		if (this.buscarCuenta(nombreCliente) != null) {
			// Si la cuenta es diferente de null entonce instanciamos una cuenta con el
			// valor encontrado
			Cuenta cuenta = this.buscarCuenta(nombreCliente);

			// validamos la cuenta con la que se va realizar el deposito
			// Si el monto a depositar es mayor al limite maximo de la cuenta
			if (monto > cuenta.getMax()) {
				System.out.println("El monto excede el saldo maximo permitido en la cuenta:");
				return ticket;
			} else if (monto + cuenta.getSaldo() > cuenta.getMax()) {
				System.out.println("El monto excede el saldo maximo permitido en la cuenta:");
				return ticket;
			} else {// si el deposito puede realizarse --> se suma el deposito al saldo actual
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				// Actualizamos los datos del ticket generado
				ticket = new Ticket(++folio, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), this.sucursal, 1);
				return ticket;
			}
		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) {
		Ticket ticket = null;
		
		if (this.buscarCuenta(nombreCliente)!=null) {
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			
			//Validamos monto maximo de retiro
			if (monto>8000) {
				System.out.println("El monto excede el maximo permitido para retiro");
				return ticket;
				//validamos saldo
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para el retiro");
				return ticket;
				//validamos si el retiro nos deja con menos del minimo a la cantidad permitida
			}else if(cuenta.getSaldo()-monto < cuenta.getMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;
			//si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(++folio, new Date(), cuenta.getNumCuenta(), cuenta.getSaldo(), this.sucursal, 1);
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
		
		if(this.buscarCuenta(clienteOrigen)!=null && this.buscarCuenta(clienteDestino)!=null) {
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			
			//Validamos cada cuenta
			//si la cuenta de origen tiene un saldo menor al transferido
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return ticket;
			}else if(origen.getSaldo() - monto < origen.getMin()) {
				System.out.println("La transferencia deja por debajo del minimo a la cuenta");
				return ticket;
				//si el monro que vamos a transferir es mayor al saldo amximo de destino, que no permita realizar la transferencia
			}else if(monto>destino.getMax()) {
				System.out.println("El monto excede el limite maximo permitido en la cuenta de destino");
				return ticket;
			}else if(destino.getSaldo() + monto > destino.getMax()) {
				System.out.println("La transferencia supera el tome maximo de la cuenta destino");
				return ticket;
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(++folio, new Date(), origen.getNumCuenta(), origen.getSaldo(), this.sucursal, 1);
				return ticket;
			}
			
		}else {
			System.out.println("Alguno de los clientes no tiene una cuenta asociada");
			return ticket;
		}
		
	}

}
