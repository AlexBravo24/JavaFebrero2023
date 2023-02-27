package com;

import java.util.Date;
import java.util.HashMap;


public class Caja implements Metodos {

	private HashMap<String, Productos> producto;
	 private int folio=0;
	public Caja(String string, HashMap<String, Productos> producto) {
		
	}

	public Caja(HashMap<String, Productos> producto, int folio) {
		super();
		this.producto = producto;
		this.folio = folio;
	}

	@Override
	public Productos buscarProductos(String nombrePro) {
		Productos productos=null;
		
		
		for(String i:this.producto.keySet()) {
			
		if(i.contentEquals(nombrePro)) {
			
			productos= this.producto.get(i);
			
			break;
		}
			
		}
		
		
		return productos;
	}

	@Override
	public Ticket compra(String nombrePro, double monto) {
		Ticket ticket = null;
		if(this.buscarProductos(nombrePro)!=null){
			Productos producto= this.buscarProductos(nombrePro);
			if(monto<producto.getPrecio()) {
				System.out.println("El monto no alcansa para el produto");
				return ticket;
			} else if  (producto.getPrecio()- monto<producto.getPrecio()) {
				System.out.println("Espera tu cambio, Muchas Gracias");
				return ticket;
				
				
			} else {
				
				producto.setPrecio(producto.getPrecio()-monto);
				
				
				ticket = new Ticket(folio++, new Date(),producto.getTipo(),producto.getPrecio(),"BIMBO");
				return ticket;
			}
			
		}else {
			
			System.out.println("No hay Producto lo SIENTO");
			return ticket;
		}	
		
		
		
		
	}

}
