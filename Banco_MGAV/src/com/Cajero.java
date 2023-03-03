package com;

import java.util.Date;
import java.util.HashMap;

import com.sun.management.VMOption.Origin;

// cajero va a ser la calse que va permitir implementar 
// las acciones o la logica
public class Cajero implements Metodos {
	
	private String sucursal;
	
	//hasmap me ermite simular una queña base d edates
	//en la cual voy a tener mis registros de cuentas identificados por una llave
	//que va ser el nombre del cliente (String) y el valor sera un objeto Cuenta
	
	private HashMap <String, Cuenta> cuentas;

	private int folio=0;

	public Cajero() {
		
	}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	//implementado acciones
	
	

	@Override
	public Cuenta buscarCuenta(String nombreCliente) {
		Cuenta cuenta = null; //instanciado un objeto cuenta
		
		//identificar la cuenta con la cual vamos a realizar operaciones
		// buscamos dentro de conjunto llaves el hashmap
		
		for(String i:this.cuentas.keySet()) {
			//integramos sobre cada llabe del objeto cuenta
			
			//una vez que corrimos las cuentas si una de ellas es igual al nombre 
			//del que queremos buscar
			if(i.contentEquals(nombreCliente)) {
				
				cuenta= this.cuentas.get(i);
				//entonces nuestro objeto cuenta= null, toma el valor de la cuenta localizada.
				
				break;  //rompo ciclo de busqueda
				
				
			}
		}
		
		return cuenta;
		//si localiza una cuenta en pantalla me mostrara el valor
		//de la cuenta
		
		
		
	}

	@Override
	public Ticket depositar(String nombreCliente, double monto) {
		//instanciamos un ticket vacio
		Ticket ticket = null;
		 //un cajero antes de realizar una operacion debe realizar ciertas validaciones
	     //si la busqueda de la cuenta se realizo entonces necesitamos acceder a esa cuenta
		if(this.buscarCuenta(nombreCliente)!=null) {
		//si encontramos una cuenta
		//instaciomaos un objateo cuenta al cual pasarle ese valor
		Cuenta cuenta= this.buscarCuenta(nombreCliente);
		//realizamos otras validaciones si ya identificamos la cuenta al
		//sobre la cual se va realizar el deposito
		if (monto>cuenta.getMax()) {
			System.out.println("El monto exede el maximo permitido de la cuenta");
			//si el monto a depositar es mayor que el maximos de la cuenta
			return ticket;
			// si el saldo mas el monto exede el limite permitido en la cuenta
		} else if  (cuenta.getSaldo()+ monto>cuenta.getMax()) {
			System.out.println("El monto exede el maximo permitido de la cuenta");
			return ticket;
			
			
		}else {//si el deposito puede realizarce
			cuenta.setSaldo(cuenta.getSaldo() + monto);
		//smado el saldo existente mas el moto depositado
			//entonces actializamos los valores del ticket que se va a recibir
			ticket =new Ticket(folio++,new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,2);
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
		
		if(this.buscarCuenta(nombreCliente)!=null) {
			//si encontramos una cuenta
			//instaciomaos un objateo cuenta al cual pasarle ese valor
			Cuenta cuenta= this.buscarCuenta(nombreCliente);
		//se erealiza validacion
			//validamos un maximo de retiro  permitido al cajro
			if(monto>8000) {

				System.out.println("El monto Exde el maximo permitido para cajeros");
				return ticket;
				//validaos si el saldo de la cuenta es menor al monto de retiro
				
			}else if (cuenta.getSaldo()<monto) {

				System.out.println("Saldo insuficiente para el retiro");
				return ticket;
				
				//validar si el saldo del retiro dejaria debajo de minimo a la cuenta
				
			}else if (cuenta.getSaldo()-monto<cuenta.getMin()) {
				

				System.out.println("El retiro dejaria por debajo del minimo la cuenta");
				return ticket;
				
				//si el retiro puede realizarce
			}else {
				cuenta.setSaldo(cuenta.getSaldo()- monto);
				ticket= new Ticket(folio++,new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(), this.sucursal,2);
				return ticket;
				
			}		
			} else {
				
				System.out.println("No hay una cuenta asociada a ese cliente");
				return ticket;
				
		
		
		}
		
	}

	@Override
	public Ticket transferir(String clienteOrigen, String clienteDEstino, double monto) {
		Ticket ticket = null;
		if(this.buscarCuenta(clienteOrigen)!=null && this.buscarCuenta(clienteDEstino)!=null) {

			Cuenta origen= this.buscarCuenta(clienteOrigen);
		    Cuenta destino= this.buscarCuenta(clienteDEstino);
			//realizamos las validaciones
		    // si l cuenta origen no cuenta con el onto a tranferir
		    if(origen.getSaldo()<monto) {
		    System.out.println("No hay fondos suficientes para relizar la transferencia");
		    return ticket;
		    
			// si el monto a tranferir deja debajo del minimo a la cuenta origen	
		}  else if(origen.getSaldo()-monto<origen.getSaldo()) {
			System.out.println("La transferenia dejaria en con menos del minimo  la cuenta.");
		    return ticket;
		}else {
		}
		    
			origen.setSaldo(origen.getSaldo()- monto);
			ticket= new Ticket(folio++,new Date(),origen.getNumcuenta(),origen.getSaldo(), this.sucursal,2);
			return ticket;
			
		} else {
			
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
	
		}
	}
		}
