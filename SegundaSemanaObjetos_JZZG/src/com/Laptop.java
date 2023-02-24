package com;

public class Laptop {

	private String modelo;
	private String tipo;
	private String año;
	private String color;
	
	public Laptop() {}
	public Laptop(String modelo, String tipo, String año, String color) {
		
		this.modelo = modelo;
		this.tipo = tipo;
		this.año = año;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Laptop [modelo=" + modelo + ", tipo=" + tipo + ", año=" + año + ", color=" + color + "]";
	}
	
	
}
