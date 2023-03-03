package com;

import java.util.Date;

public class Pantalla {
	
	//Atributos
	private Date fechaHora;
	private String producto;
	private int precio;
	private int cambio;
	
	
	public Pantalla() {
		
	}


	public Pantalla(Date fechaHora, String producto, int precio, int cambio) {
		this.fechaHora = fechaHora;
		this.producto = producto;
		this.precio = precio;
		this.cambio = cambio;
	}


	public Date getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getCambio() {
		return cambio;
	}


	public void setCambio(int cambio) {
		this.cambio = cambio;
	}


	@Override
	public String toString() {
		return "Pantalla [fechaHora=" + fechaHora + ", producto=" + producto + ", precio=" + precio + ", cambio="
				+ cambio + "]";
	}
	
	
	

}
