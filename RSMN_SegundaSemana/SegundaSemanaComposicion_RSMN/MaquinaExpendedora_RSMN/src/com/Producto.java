package com;

import java.util.Date;

public class Producto {
	
	private int folioProducto;
	private Date fechaHora;
	private String chocolates;
	private String papas;
	private String chicles;
	private int precio;
	
	
	public Producto() {
		
	}


	public Producto(int folioProducto, Date fechaHora, String chocolates, String papas, String chicles, int precio) {

		this.folioProducto = folioProducto;
		this.fechaHora = fechaHora;
		this.chocolates = chocolates;
		this.papas = papas;
		this.chicles = chicles;
		this.precio = precio;
	}


	public int getFolioProducto() {
		return folioProducto;
	}


	public void setFolioProducto(int folioProducto) {
		this.folioProducto = folioProducto;
	}


	public Date getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}


	public String getChocolates() {
		return chocolates;
	}


	public void setChocolates(String chocolates) {
		this.chocolates = chocolates;
	}


	public String getPapas() {
		return papas;
	}


	public void setPapas(String papas) {
		this.papas = papas;
	}


	public String getChicles() {
		return chicles;
	}


	public void setChicles(String chicles) {
		this.chicles = chicles;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [folioProducto=" + folioProducto + ", fechaHora=" + fechaHora + ", chocolates=" + chocolates
				+ ", papas=" + papas + ", chicles=" + chicles + ", precio=" + precio + "]";
	}

	
}
