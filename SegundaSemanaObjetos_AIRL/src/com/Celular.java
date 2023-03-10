package com;

public class Celular {
	private String marca;
	private String modelo;
	private String color;
	private String capacidad;
	private double precio;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, String color, String capacidad, double precio) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.capacidad = capacidad;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", capacidad=" + capacidad
				+ ", precio=" + precio + "]";
	}
	
	

}
