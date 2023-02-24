package com;

import java.util.Date;
import java.util.HashMap;

public class Maquina implements Metodos{
	private String ubicacion;
	
	private HashMap<Integer, Producto> productos;
	int folio=1;
	
	public Maquina() {
		
	}

	public Maquina(String ubicacion, HashMap<Integer, Producto> productos) {
	
		this.ubicacion = ubicacion;
		this.productos = productos;
	}

	@Override
	public Producto identicarProducto(int codigo) {
		Producto producto = null;
		producto = productos.get(codigo);
		return producto;
	}

	@Override
	public Ticket comprar(int codigo, double dinero) {
		Ticket ticket = null;
		if(this.identicarProducto(codigo)!=null) {	
			Producto producto = this.identicarProducto(codigo);
			if(dinero > producto.getPrecio()) {
				if( producto.getExistencia()>0) {
				producto.setSaldo(dinero-producto.getPrecio());
				producto.setExistencia(producto.getExistencia()-1);
				ticket = new Ticket(folio++, new Date(), producto.getProducto(), producto.getPrecio(), producto.getSaldo(), "Gamesa", this.ubicacion);
				return ticket;
				}else {
					System.out.println("No hay producto en existencia");
					return ticket;			
				}
			}else {
				System.out.println("El precio del producto es mayor al ingresado");
				return ticket;
			}
		}else {
			System.out.println("No existe ningun producto relacionado con ese codigo");
			return ticket;
		}

	
	}

	



}
