package com;

import java.util.Date;

public class Ticket {
	
	private int folio;
	private Date fechaHora;
	private String producto;
	private double precio;
	private double cambio;
	private String marcaProd;
	private String ubicacion;
	
	public Ticket() {
		
	}


	public Ticket(int folio, Date fechaHora, String producto, double precio, double cambio, String marcaProd,
			String ubicacion) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.producto = producto;
		this.precio = precio;
		this.cambio = cambio;
		this.marcaProd = marcaProd;
		this.ubicacion = ubicacion;
	}


	public int getFolio() {
		return folio;
	}


	public void setFolio(int folio) {
		this.folio = folio;
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


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getCambio() {
		return cambio;
	}


	public void setCambio(double cambio) {
		this.cambio = cambio;
	}


	public String getMarcaProd() {
		return marcaProd;
	}


	public void setMarcaProd(String marcaProd) {
		this.marcaProd = marcaProd;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", producto=" + producto + ", precio=" + precio
				+ ", cambio=" + cambio + ", marcaProd=" + marcaProd + ", ubicacion=" + ubicacion + "]";
	}




	
	
	

}
