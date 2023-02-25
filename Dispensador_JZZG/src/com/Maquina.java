package com;

import java.util.HashMap;

//Maquinita sera la parate de la logica y acciones 
public class Maquina implements Metodos {

	private String surcursal;
	//HashMap permitira simular una pequeña base de datos la cual voy a tener mis registros de mis productos 
	//lo identificamos por una llave que va as ser nombrede producto y el valor sera un objeto maquina 
	private HashMap<String, Productos> mproductos;
	
	private int folio=0;
	public Maquina() {}

	public Maquina(String surcursal, HashMap<String, Productos> mproductos) {
		
		this.surcursal = surcursal;
		this.mproductos = mproductos;
		
	}


	@Override
	public Productos buscarproducto(String nombreproducto) {
	   
		Productos producto = null; //instanciamos 
		// identificaremos el producto para retirirarlo 
		//buscamos dentro del conjunto de llaves de HashMap
		
		for(String i: this.mproductos.keySet()) {
			
		if(i.contentEquals(nombreproducto)) {
			producto = this.mproductos.get(i);// entonces nuestro objeto cuenta = null, toma el valor del producto localizado
		    break;//rompe el ciclo de busqueda
		    
		   }	
		}
		
		return producto;// si localiza el producto, encontrara los atributos del producto
	}

	@Override
	public Ticket depositar(String nombreproducto, double monto) {
		//instanciamos un ticket vacio
		Ticket ticket=null;
		
		if(this. buscarproducto(nombreproducto)!=null) {
			
		Productos producto = this.buscarproducto(nombreproducto);
		
		if(monto>producto.getMax()) {
			
			System.out.println("el monto excede el costo del producto");
			return ticket;
		}else if (producto.getCosto()+monto>producto.getMax()) {
			
			System.out.println("el monto excede el saldo maximo del producto");
			return ticket;
	
		}else {
			
			producto.setCosto(producto.getCosto()+monto); //devolvemos el valor del costo dl producto
		
			ticket= new Ticket(folio++,producto.getNombredulce(),producto.getCosto());
			return ticket;  
		}
			
	  }else {
		  System.out.println("No existe el producto que quiere ");
		  return ticket;
	  }
		
	}

	@Override
	public Ticket retirar(String nombreproducto, double costo) {
		Ticket ticket = null;
		
		if(this. buscarproducto(nombreproducto)!=null) {
			
			Productos producto = this.buscarproducto(nombreproducto);
		   //realizar validaciones 
			if(costo>800) {
				
				System.out.println("el monto excede el saldo maximo del producto");
				return ticket;
				
			}else if (producto.getCosto()<costo) {
				
				System.out.println("el saldo es insuficiente para el retiro");
				return ticket;
		}else if (producto.getCosto()-costo<producto.getMin()) {
			
			System.out.println("el retiro dejaria por debajo del minimo a la cuenta");
			return ticket;
		  }else {
				
				producto.setCosto(producto.getCosto()-costo);
				ticket = new Ticket(folio++,producto.getNombredulce(),producto.getCosto());
		         return ticket;
		  }
			
		}else {
			System.out.println("No existe el producto que quiere ");
			  return ticket;
		}
	

	}

	@Override
	public String toString() {
		return "Maquina [surcursal=" + surcursal + ", mproductos=" + mproductos + ", folio=" + folio + "]";
	}
	
	
	
	
	//implementamos las acciones 
	
}
