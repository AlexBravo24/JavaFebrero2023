package com;

import java.util.Date;
import java.util.HashMap;

//cajero va a ser la clase que va a permitir implementar las acciones o la logica

public class Cajero implements Metodos{
	
	//atributos
	private String sucursal;
	private int folio=0;
	
	//HashMap me va a permitir simular una pequeña base de datos
	// en la cual voy a tener a mis registros de cuentas identificados por una llave
	// que va  a ser el nombre del cliente (string) y el valor sera un objeto cuenta
	private HashMap<String, Cuenta> cuentas;
	
	
	
	
	// CONSTRUSCTORES //
	
	public Cajero() {
		
	}


	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

// IMPLEMENTACION DE METODOS //
	
	
	// BUSCAR CUENTA //
	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		// 
		Cuenta cuenta = null; //variable local de tipo objeto Cuenta
		
		//identificar la cuenta sobre la cual vamos a realizar operaciones
		//buscamos dentro del conjunto de llaves del hashmap
		
		cuenta = cuentas.get(nombreCliente);
		
//		for(String i : this.cuentas.keySet()) { //recorremos las llaves del hashmap
//			if(i.contentEquals(nombreCliente)) { //evaluamos si es igual al nombre del cliente
//				cuenta = this.cuentas.get(i);	//al encontrarlo guardamos el valor en cuenta
//				break; //al encontrarlo rompemos el ciclo
//			}
//		}
		
		return cuenta;
		
	}


	// DEPOSITAR A CUENTA //
	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		// instanciamos un ticket vacio
		Ticket tic = null; // variable local tipo objeto ticket vacia
		
		//si la busqueda de la cuenta se realizo entonces necesitamos acceder a esa cuenta
		
		if(this.buscarCuenta(nombreCliente)!= null) {
			//instanciamos objeto cuenta al cual pasamos el valor
			
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			
			//realizamos validaciones anidadas, si ya identificamos la cuenta
			//sobre la cual se va a realizar el deposito
			if(monto > cuenta.getSaldoMax()) {//si el monto a depositar es mayor al limite maximo
				
				System.out.println("El monto excede el saldo maximo permitido en la cuenta");
				return tic;
				
			}else if(monto+cuenta.getSaldo() > cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo maximo permitido en la cuenta");
				return tic;
			}else { //si pasa las validaciones procedemos al deposito
				
				cuenta.setSaldo(monto+cuenta.getSaldo()); //actualizamos el saldo
				//actualizamos los valores del ticket que se va a enviar
				tic = new Ticket(folio++,new Date(),cuenta.getNumCuenta(),cuenta.getSaldo(),this.sucursal,1);
				return tic;
			}
		
		
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return tic;
			
		}
	
		
	}//fin de depositar


	
	// RETIRAR DE CUENTA //
	@Override
	public Ticket retirar(String nombreCliente, double monto) {
		// instanciamos un ticket vacio
				Ticket tic = null; // variable local tipo objeto ticket vacia
				
				//si la busqueda de la cuenta se realizo entonces necesitamos acceder a esa cuenta
				
				if(this.buscarCuenta(nombreCliente)!= null) {
					//instanciamos objeto cuenta al cual pasamos el valor
					
					Cuenta cuenta = this.buscarCuenta(nombreCliente);
					
					//realizamos validaciones anidadas, si ya identificamos la cuenta
					//sobre la cual se va a realizar el deposito
					if(monto > 9000) {//si el monto a retirar es mayor al limite maximo
						
						System.out.println("El monto excede el saldo maximo permitido en la cuenta");
						return tic;
						
					}else if(cuenta.getSaldo() < monto) { //validacion de saldo suficiente
						
						System.out.println("No cuenta con saldo suficiente");
						return tic;
						
					}else if(cuenta.getSaldo()-monto < cuenta.getSaldoMin()) {
						
						System.out.println("El retiro dejaria por debajo del saldo minimo requerido");
						return tic;
					
					
					}else { //si pasa las validaciones procedemos al retiro
						
						cuenta.setSaldo(cuenta.getSaldo() - monto); //actualizamos el saldo
						//actualizamos los valores del ticket que se va a enviar
						tic = new Ticket(folio++,new Date(),cuenta.getNumCuenta(),cuenta.getSaldo(),this.sucursal,1);
						return tic;
					}
				
				
				}else {
					System.out.println("No hay una cuenta asociada a ese cliente");
					return tic;
					
				}
		
	}//fin de retirar


	
	
	// TRANSFERIR ENTRE CUENTAS //
	@Override
	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {
		// TODO Auto-generated method stub
		Ticket tic = null;
		
		//validamos si existen los clientes origen y destino
		if(this.buscarCuenta(clienteOrigen)!= null && this.buscarCuenta(clienteDestino)!= null) {
			
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			
			if(origen.getSaldo()< monto) {
				
				System.out.println("Saldo insuficiente");
				return tic;
				
			}else if(destino.getSaldo()+monto > destino.getSaldoMax()) {
				
				System.out.println("El destinatario excederia el monto maximo permitido de saldo");
				return tic;
				
			}else if(monto> destino.getSaldoMax()) {
				
				System.out.println("El monto excede el limite maximo permitido en la cuenta destino");
				return tic;
				
			
			}else if(origen.getSaldo()-monto < origen.getSaldoMin()) {
				
				System.out.println("El saldo quedaria debajo del saldo minimo requerido");
				return tic;
				
			}else {
				
				destino.setSaldo(destino.getSaldo()+monto);
				origen.setSaldo(origen.getSaldo()-monto);
				tic = new Ticket(folio++,new Date(),origen.getNumCuenta(),origen.getSaldo(),this.sucursal,1);
				return tic;
			}
			
			
			
		}else if(this.buscarCuenta(clienteDestino)== null && this.buscarCuenta(clienteOrigen)!= null) {
			
			System.out.println("No se encontro cuenta asociada al destinatario");
			return tic;
		}else {
			
			System.out.println("No se encontro cuenta asociada al cliente origen");
			return tic;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
