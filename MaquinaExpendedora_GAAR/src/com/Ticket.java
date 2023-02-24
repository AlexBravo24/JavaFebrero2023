package com;

import java.util.Date;

public class Ticket {
 
	 private int folio;
	 private Date fechaHora;
	 private String numProduct;
     private String nombreProducto;
	 private double costo;
	 private double cambio;
	 
	 public Ticket() {}

	public Ticket(int folio, Date fechaHora, String numProduct, String nombreProducto, double costo, double cambio) {
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.numProduct = numProduct;
		this.nombreProducto = nombreProducto;
		this.costo = costo;
		this.cambio = cambio;
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

	public String getNumProduct() {
		return numProduct;
	}

	public void setNumProduct(String numProduct) {
		this.numProduct = numProduct;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", numProduct=" + numProduct
				+ ", nombreProducto=" + nombreProducto + ", costo=" + costo + ", cambio=" + cambio + "]";
	}
      
	
  
	  
	
	 
	
	
}
