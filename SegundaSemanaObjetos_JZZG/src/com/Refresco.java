package com;

public class Refresco {
	
	private String marca;
	private String sabor;
	private String caducidad;
	private String color;
	
	public Refresco(){}
		
	public Refresco(String marca, String sabor, String caducidad, String color) {
		
		this.marca = marca;
		this.sabor = sabor;
		this.caducidad = caducidad;
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getCaducidad() {
		return caducidad;
	}


	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Refresco [marca=" + marca + ", sabor=" + sabor + ", caducidad=" + caducidad + ", color=" + color + "]";
	}
	
	

}
