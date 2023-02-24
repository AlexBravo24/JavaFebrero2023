package com;

public class Electrodomestico {
	private String tipo;
	private String marca;
	private String color;
	private double precio;
	
	public Electrodomestico() {
		
	}

	public Electrodomestico(String tipo, String marca, String color, double precio) {
		
		this.tipo = tipo;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	@Override
	public String toString() {
		return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}
	
	

}
