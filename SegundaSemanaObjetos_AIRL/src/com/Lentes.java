package com;

public class Lentes {
	private String marca;
	private String color;
	private double graduacion;
	private double precio;
	private String tipo_micas;
	
	public Lentes() {
		
	}

	public Lentes(String marca, String color, double graduacion, double precio, String tipo_micas) {
		this.marca = marca;
		this.color = color;
		this.graduacion = graduacion;
		this.precio = precio;
		this.tipo_micas = tipo_micas;
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

	public double getGraduacion() {
		return graduacion;
	}

	public void setGraduacion(double graduacion) {
		this.graduacion = graduacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo_micas() {
		return tipo_micas;
	}

	public void setTipo_micas(String tipo_micas) {
		this.tipo_micas = tipo_micas;
	}

	@Override
	public String toString() {
		return "Lentes [marca=" + marca + ", color=" + color + ", graduacion=" + graduacion + ", precio=" + precio
				+ ", tipo_micas=" + tipo_micas + "]";
	}
	
	

}
