package com;

public class Producto {
	private String nombre;
	private String marca;
	private double precio;
	private int existencia;
	
	
	public Producto() {}
	public Producto(String nombre, String marca, double precio, int existencia) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.existencia = existencia;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", existencia=" + existencia
				+ "]";
	}
	
	
	
	
}
