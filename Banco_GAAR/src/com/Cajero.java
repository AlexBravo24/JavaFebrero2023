package com;

import java.util.Date;
import java.util.HashMap;

//Cajero va a ser la clase que va a permitir implementar
//las acciones o la logica
public class Cajero implements IMetodos {
	
	private String sucursal;
	
	//Hashmap me va a permitir similar una pequeña base de datos
	//La cual tendra registros de cuentas identificados por una llave
	//que va a se el nombre del cliente (String) y el valor del objeto Cuenta
	private HashMap<String, Cuenta> cuentas;
	
	private int folio=1;
	
	public Cajero() {}

	public Cajero(String sucursal, HashMap<String, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	
	//implementar las acciones
	
	@Override
	public Cuenta BuscarCuenta(String nombreCliente) {
	  
		Cuenta cuenta = null; //instanciando un objeto cuenta
		// buscar dentro del hashMap la cuenta a identificar para la opercaion
		
		cuenta = cuentas.get(nombreCliente);
		
//		for(String i:this.cuentas.keySet())
//		{
//			if (i.contentEquals(nombreCliente))
//			{
//				cuenta = this.cuentas.get(i);
//				break;
//			}
//		}
		
		if(cuenta!=null)
		{
		  return cuenta;
		}
		else
		{
		  System.out.print("CUENTA NO ENCONTRADA : ");
		}
			
	   return cuenta; //Si localiza una cuenta en pantalla me mostrara el valor de la cuenta
	}

	@Override
	public Ticket Depositar(String nombreCliente, double monto) {
	  //instanciamos un ticket vacio
		Ticket ticket = null;
		
//		si la busqueda de la cuenta se realizo entonces accedemos
		if(this.BuscarCuenta(nombreCliente)!=null)
		{
	   Cuenta cuenta = this.BuscarCuenta(nombreCliente);		
		//Realizamos validaciones anidadas
		  if(monto>cuenta.getMax()) 
		  {
			System.out.println("El monto Excede el Saldo Maximo Permitido en la cuenta"); 
             return ticket;
		  }
		  else if(cuenta.getSaldo()+monto > cuenta.getMax())
		  {
			System.out.println("El monto Excede el Saldo Maximo Permitido en la cuenta"); 
	         return ticket;  
		  }
		  else
		  {
			  //Actualizacion de saldo 
			 cuenta.setSaldo(cuenta.getSaldo()+monto);  
		       ticket = new Ticket (folio++, new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(),this.sucursal,1);
		        return ticket;
		  }
		}
		else
		{
			System.out.println("No EXISTE LA CUENTA");
			return ticket;
		}
		
	}

	@Override
	public Ticket Retirar(String nombreCliente, double monto) {
		Ticket ticket = null;
		
		if(this.BuscarCuenta(nombreCliente)!=null)
		{
			Cuenta cuenta = this.BuscarCuenta(nombreCliente);	
		  if(monto > 8000)
		  {
		    System.out.println("EL MONTO EXCEDE EL LIMITE POR DIA");	  
		     return ticket;
		  }
		    else if(cuenta.getSaldo()< monto)
		    {
		    	System.out.println("SALDO INSUFICIENTE");
		    	 return ticket;
		    }
		    else if(cuenta.getSaldo()-monto < cuenta.getMin())
		    {
		    	System.out.println("EL MONTO MINIMO EXCEDE LA OPERACION");
		    	 return ticket;
		    }
		    else
			{
			 //Actualizacion de saldo 
			cuenta.setSaldo(cuenta.getSaldo()-monto);  
			ticket = new Ticket (folio++, new Date(),cuenta.getNumcuenta(),cuenta.getSaldo(),this.sucursal,1);
			return ticket;
			}

		}
		else
		{
			System.out.println("No EXISTE LA CUENTA");
			return ticket;
		}
			
		
		
	}

	@Override
	public Ticket Transferencia(String clienteOrigen, String clienteDestino, double monto) {
		
		
		//instanciamos un ticket vacio
				Ticket ticket = null;
				
//				si la busqueda de la cuenta se realizo entonces accedemos
				if((this.BuscarCuenta(clienteOrigen)!=null) && (this.BuscarCuenta(clienteDestino)!=null))
				{
			   Cuenta origen = this.BuscarCuenta(clienteOrigen);
			   Cuenta destino = this.BuscarCuenta(clienteDestino);
			       //Realizamos validaciones
			   
			      //si la cuenta no tiene saldo para trnasferir 
			      if(origen.getSaldo()< monto)
			      {
			    	System.out.println("NO HAY SALDO SUFICIENTE PARA REALIZAR TRANSFERENCIA");
			        return ticket;
			      }
			      else if(origen.getSaldo()-monto < origen.getMin())
			      {
			    	System.out.println("La Transferencia no se puede realizar debido al minimo de la cuenta");
			    	return ticket;
			      }
			      else if(monto> destino.getMax())
			      {
			    	//Validamos el maximo de la cuenta destino
			    	  System.out.println("La Transferencia no se puede realizar debido al Maximo de la cuenta");
				    	return ticket;  
			      }
			      else if(destino.getSaldo()+monto > destino.getMax())
			      {
			    	  System.out.println("La Transferencia no se puede realizar debido al Maximo de la cuenta");
			    	   return null;
			      }
			      else
			      {
			    	  origen.setSaldo(origen.getSaldo()-monto);
			          destino.setSaldo(destino.getSaldo()+monto);
			          ticket = new Ticket (folio++, new Date(),origen.getNumcuenta(),origen.getSaldo(),this.sucursal,1);
					  return ticket; 
			      }

				}
				else
				{
					System.out.println("No EXISTE LA CUENTA");
					return ticket;
				}	
	   }
	
}
