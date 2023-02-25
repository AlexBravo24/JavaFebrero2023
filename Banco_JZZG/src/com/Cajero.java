package com;


import java.util.Date;
import java.util.HashMap;
//se encargara en implementar la clase logica para que pueda trabajar las acciones
public class Cajero implements Imetodos{

	private String sucursal;
	private HashMap<String,Cuenta>cuentas;
	private int folio= 0;
	
	public Cajero() {}
	
	public Cajero(String sucursal, HashMap<String, Cuenta >cuentas ) {
		
		this.sucursal= sucursal;
		this.cuentas= cuentas;
	}


	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta = null; //Instanciando un objeto cuenta
		
		//Identificar la cuenta sobre la cual vamos a realizar operaciones
		//Buscamos dentro del conjunto de llaves el HashMap
		
//		cuenta = cuentas.get(nombreCliente);
		
		for(String i:this.cuentas.keySet()) { //Iteramos sobre cada llave del objeto cuenta
			//Una vez que recorrimos las cuentas, si una de ellas es igual al nombre del cliente
			//que queremos buscar
			if (i.contentEquals(nombreCliente)) {
				cuenta = this.cuentas.get(i); //Entonces nuestro objeto cuenta = null, toma el valor
				//de la cuenta localizada
				break; //Rompo el ciclo de busqueda
			}
		}
		
		return cuenta; //Si localiza una cuenta, en pantalla me mostrará el valor de la cuenta
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
	
		Ticket ticket=null;
		
		if (this.buscaCuenta(nombreCliente)!=null) {
	
			Cuenta cuenta= this.buscaCuenta(nombreCliente);
			
			if(monto>cuenta.getMax()) {
			
			System.out.println("si el monto ecxede el saldo maximo permitido en la cuenta");
			return ticket;
			}else if (cuenta.getSaldo()+monto>cuenta.getMax()) {
				
				System.out.println("el monto excede el saldo maximo permitido en la cuenta ");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket =new Ticket(folio++, new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,1);
			}
		}else {
			
			System.out.println("no hay una cuenta asociadacon el cliente");
			
			return ticket;
		}
	
		return ticket;
	}

	@Override
	public Ticket retirar(String nombreCliente, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket =null;
		
		if(this.buscaCuenta(nombreCliente)!=null) {
			Cuenta cuenta=this.buscaCuenta(nombreCliente);
			
			if(monto>8000) {
				
				System.out.println("el monto excede el maximo permitido para retirros");
				return ticket;
				
			}else if (cuenta.getSaldo()<monto) {
				
				System.out.println("el monto excede el maximo permitido para retirros");
				return ticket;
			}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
				
				System.out.println("el monto dejaria por debajo del minimo  a la cuenta ");
				return ticket;
				
			}else {
				
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket =new Ticket(folio++, new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,1);
				return ticket;
			}
		}else {
			
			System.out.println("no hay una cuentab asosiada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		Ticket ticket =null;
		
		if(this.buscaCuenta(clienteOrigen)!=null && this.buscaCuenta(clienteDestino)!=null) {
			Cuenta origen =this.buscaCuenta(clienteOrigen);
			Cuenta destino =this.buscaCuenta(clienteDestino);
			
			if(origen.getSaldo()<monto) {
				System.out.println("no hay fondos suficientes para realizar la transferencia");
				return ticket;
		}else if (origen.getSaldo()-monto<origen.getMin()) {
			
			System.out.println("la transferenecia dejaria por debajo del minimo a la a cuenta ");
			return ticket;
			//Si el monto que vamos a transferir es mayor al saldo maximo que puede tener la
		}else if(monto>destino.getMax()) {
			System.out.println("el monto excede el limimite permitido en la cuenta destino ");
			return ticket;
		}else if (destino.getSaldo()+monto>destino.getMax()) {
			
			System.out.println("el saldo de la cuenta destino excederia el maximo permitido ");
			return ticket;
		
		}else {
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			ticket =new Ticket(folio++, new Date(),origen.getNumcuenta(),origen.getSaldo(), this.sucursal,1);
			return ticket;
		}
		 
		}
			return ticket;
	}

	@Override
	public Cuenta buscaCuenta(String nombreCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}