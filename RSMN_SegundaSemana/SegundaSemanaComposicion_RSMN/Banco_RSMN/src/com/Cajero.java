package com;

import java.util.Date;
import java.util.HashMap;

// cajero va a ser la clase que va a permitirme implementar
//las acciones o la logica
public class Cajero implements Metodos {
	
	private String sucursal;
	
	//hasmap me permite simular una pequeña base de datos
	// en la cual voy a tener mis registros de cuentas, identificar por una lave
	// que va a ser el nombre del cliente (string) y el valor sera un objeto cuenta
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
		// TODO Auto-generated method stub	
		Cuenta cuenta = null; // instanciando un objeto cuenta
		
		// identificar la cuenta sobre la cual vamos a realizar operaciones 
		//buscamos dentro del conjunto de llaves al hasmap
		
		for(String i:this.cuentas.keySet()) {// iteramos sobre cada llave del objetocuenta
			// una ves que recorrimos las cuentas , si una de ellas es igual al nombredel
			// que queremos buscar
			if (i.contentEquals(nombreCliente)) {
				cuenta = this.cuentas.get(i); // entonces nuestros objetos = null, toma el valor
				//de la cuenta localizada
				
				break; // rompo el ciclo de busqueda
			}
		}
		return cuenta;// si localiza una cuenta, en pantalla me moestrara el valor de la cuenta
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		// TODO Auto-generated method stub
		// instanciamos un ticket vacio
		
		Ticket ticket = null;
		// si la busqueda de la cuenta se ralizo entonces nececitamos acceder a esa cuenta
		if(this.buscarCuenta(nombreCliente)!=null) {// si encontramos una cuenta
			//instanciamos un objeto cuenta al cual pasara ese valor
			Cuenta cuenta =this.buscarCuenta(nombreCliente);
			
			// realizamos otras validaciones anidadas, si ya identificamos la cuenta
			//sobre la cual se va a realizar el desposito 
			
			if (monto>cuenta.getMax()) {// si el monto a depsitar es mayor al limite 
				System.out.println("el monto exece el saldo maximo permitido en la cuenta");
				return ticket;
			}else if (cuenta.getSaldo()+monto>cuenta.getMax()) {//saldo de la cuenta
				// mas el monto quenos depositen excede el limite maximo permitido
				System.out.println("el monto exece el saldo maximo permitido en la cuenta");
				return ticket;
			}else {// si el deposito puede realizarse 
				cuenta.setSaldo(cuenta.getSaldo()+monto);//actualizamos el saldo de la cuenta
				// sumando el saldo existente mas el monto de ticket
				ticket =new Ticket(folio++, new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
					
		}else {
			System.out.println("no hay una cuenta asociada");
			return ticket;
		}
		
		
		
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) {
		// TODO Auto-generated method stub
		// implementando las acciones
		Ticket ticket =null;
		
		if(this.buscarCuenta(nombreCliente)!=null) {// si encontramos una cuenta
			//instanciamos un objeto cuenta al cual pasara ese valor
			Cuenta cuenta =this.buscarCuenta(nombreCliente);
			//realizamos vcalidaciones
			//validamos un maximo de retiro que nos permita el cajero
			
			if(monto>8000) {
				System.out.println("el monto accede el maximo");
				return ticket;
				
				
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("saldo insuficiente");
				return ticket;
			}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("el retiro por debajodel minimo");
				return ticket;
			}else {
				//si el retiro puede realizarse
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket =new Ticket(folio++, new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
	}else {
		System.out.println("no hay una cuenta asociada");
		return ticket;
	}
	}

	@Override
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket = null;
		// buscamos la cuenta tanto de origen como de destino
		if(this.buscarCuenta(clienteOrigen)!=null && this.buscarCuenta(clienteDestino)!=null) {
		Cuenta origen = this.buscarCuenta(clienteOrigen);
		Cuenta destino = this.buscarCuenta(clienteDestino);
		
		//realizamos validacion
		// si la cuenta de origen tiene un saldo menor al monto a trasferir
		if(origen.getSaldo()<monto) {
			System.out.println("no hay saldo suficiente para realizar transfrencia");
			return ticket;
			
			// si el monto a trasferir deja por el monto del minimo
		}else if(origen.getSaldo()-monto<origen.getMin()) {
			System.out.println("la trasferencia dejaria por debajo del minimo");
			return ticket;
			
			// si el monto a trasferir es mayor es mayor al saldo maximo
		}else if (monto>destino.getMax()) {
			System.out.println("el monto accede e limite maximo permitido");
			return ticket;
			
			// si el saldo de la cuenta mas el monto superan tambien el maximo permitidoen la cuenta destino
		}else if (destino.getSaldo()+monto>destino.getMax()) {
			System.out.println("el saldo de la cuenta destino excederia el maximo permitido");
			return ticket;
		}else {
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			ticket =new Ticket(folio++, new Date(),origen.getNumcuenta(),origen.getSaldo(), this.sucursal,1);
			return ticket;
		}
		
		
		
	}else {
		System.out.println("alguno de los clientes no tiene una cuenta socia");
		return ticket;
	}
		
		
	}



	

}
