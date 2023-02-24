package com;

import java.util.Date;
import java.util.HashMap;

//Cajero va a ser la clase que va a permitir implementar
//las acciones o la logica
public class Maquina implements IMetodos {
	
	
	@SuppressWarnings("unused")
	private String maquina;
	//Hashmap me va a permitir similar una pequeña base de datos
	//La cual tendra registros de cuentas identificados por una llave
	//que va a se el nombre del cliente (String) y el valor del objeto Cuenta
	private HashMap<String, Producto> productos;
	private int folio=1;
	
	public Maquina() {}
		
	//implementar las acciones
	

	public Maquina(String Maquina,HashMap<String, Producto> productos) {
		this.productos = productos;
		this.maquina = Maquina;
	}



	@Override
	public Producto BuscarProducto(String nombreProducto) {
		Producto prod = null; //instanciando un objeto cuenta
		// buscar dentro del hashMap la cuenta a identificar para la opercaion
		
		prod = productos.get(nombreProducto);
		if(prod!=null)
		{
		  return prod;
		}
		else
		{
		  System.out.print("Producto No Encontrado : ");
		  return null;
		}
		
	}

	@Override
	public Ticket DescontarProducto(String nombreProducto,double pago) {
		  //instanciamos un ticket vacio
        	Ticket ticket = null;
        	if(this.BuscarProducto(nombreProducto)!=null)
        	{
        	   Producto producto = this.BuscarProducto(nombreProducto);	  
        	   if(pago<producto.getCosto()) {
        		   System.out.println("MONTO INSUFICIENTE ");
                return null;
        	   }
        	   if(pago>producto.getCosto())
        	   {
                  double cambio = 0, total = 0;

                  cambio = (pago-producto.getCosto());
                  System.out.println("PRODUCTO COMPRADO ");
                    
                  total = producto.getExistencia();
                  producto.setExistencia(total-1);
        			//public Ticket(int folio, Date fechaHora, String numProduct, String nombreProducto, double costo, double cambio) {
        		  ticket = new Ticket (folio++, new Date(),producto.getNumproducto(),nombreProducto,producto.getCosto(),cambio);
 		        return ticket;
        	   }
        	   
        	   if(producto.getExistencia()==0)
        	   {
        		   System.out.println("Producto Agotado");
                   return null;
        	   }  
        	}
        	else
        	{
        	 System.out.print("PRODUCTO NO EXISTE");	
        	
        	}
        	 return null;
	}



	
}
