package com;

public class Frutas {
	private String textura;
	private String color;
	private double precio;
	private String sabor;
	
	public Frutas() {
		
	}

	public Frutas(String textura, String color, double precio, String sabor) {
		
		this.textura = textura;
		this.color = color;
		this.precio = precio;
		this.sabor = sabor;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "Frutas [textura=" + textura + ", color=" + color + ", precio=" + precio + ", sabor=" + sabor + "]";
	}
	
	

}
