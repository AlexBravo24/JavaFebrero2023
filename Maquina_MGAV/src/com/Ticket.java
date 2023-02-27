package com;

import java.util.Date;

public class Ticket {
	
	private int folio;
	private Date fechaHora;
	private String nombreProduto;
	private double Precio;
	private String Expendio;
	
	public Ticket() {
		
	}

	public Ticket(int folio, Date fechaHora, String nombreProduto, double precio, String expendio) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nombreProduto = nombreProduto;
		Precio = precio;
		Expendio = expendio;
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

	public String getNombreProduto() {
		return nombreProduto;
	}

	public void setNombreProduto(String nombreProduto) {
		this.nombreProduto = nombreProduto;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public String getExpendio() {
		return Expendio;
	}

	public void setExpendio(String expendio) {
		Expendio = expendio;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", nombreProduto=" + nombreProduto + ", Precio="
				+ Precio + ", Expendio=" + Expendio + "]";
	}
	

}
