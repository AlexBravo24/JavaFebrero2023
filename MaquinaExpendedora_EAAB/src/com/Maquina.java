package com;

import java.util.Date;
import java.util.HashMap;

public class Maquina implements Metodos{

	
	
	
	
	// CONSTRUCTORES
	
	HashMap<String,Producto> productos = new HashMap<String,Producto>();
	
	
	public Maquina() {
		
	}
	

	public Maquina(HashMap<String, Producto> productos) {
		this.productos = productos;
	}





	//SELECCIONAR Y BUSCAR PRODUCTO A PARTIR DE CODIGO
	@Override
	public Producto SelecProducto(String codigo) {
		// TODO Auto-generated method stub
		
		Producto prod = null;
		
		prod = productos.get(codigo);
		
		
		
		return prod;
	}
	
	
	
	
	
	// COBRAR Y DESPACHAR PRODUCTO UNA VEZ SELECCIONADO

	@Override
	public Pantalla cobrar(String codigo, int dinero) {
		
		Pantalla pant = null;
		int cant, cambio;
		
		if(this.SelecProducto(codigo)!= null) {
			
			Producto prod = this.SelecProducto(codigo);
			System.out.println("\nIngresado: $"+dinero+"\nSeleccionado: "+codigo);
			
			//validaciones al producto
			
			if(prod.getCantidad()>0 && dinero >= prod.getPrecio()) {
				
				cant = prod.getCantidad();
				System.out.println("\nDespachando... ");
				prod.setCantidad(cant-1);
				cambio = dinero -prod.getPrecio();
				pant = new Pantalla(new Date(),prod.getProducto(),prod.getPrecio(),cambio);
				cambio=0;
				return pant;
				
			}else if( prod.getCantidad()<=0 && dinero>=prod.getPrecio()) {
				
				System.out.println("\nProducto sin existencia");
				//devolver dinero
				return pant;
				
			}else if(prod.getCantidad()>0 && dinero<prod.getPrecio()) {
				
				System.out.println("\nDinero insuficiente");
				return pant;
				
			}else {
				System.out.println("Producto sin existencia, no alcanza dinero ingresado");
				return pant;
			}
			
			
			
		}else {
			
			System.out.println("Producto no encontrado...");
			return pant;
			
		}
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	

}
