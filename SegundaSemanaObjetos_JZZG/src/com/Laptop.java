package com;

public class Laptop {

	private String modelo;
	private String tipo;
	private String a�o;
	private String color;
	
	public Laptop() {}
	public Laptop(String modelo, String tipo, String a�o, String color) {
		
		this.modelo = modelo;
		this.tipo = tipo;
		this.a�o = a�o;
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

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Laptop [modelo=" + modelo + ", tipo=" + tipo + ", a�o=" + a�o + ", color=" + color + "]";
	}
	
	
}
