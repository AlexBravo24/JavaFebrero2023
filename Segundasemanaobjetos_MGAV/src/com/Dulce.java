package com;

public class Dulce {
	
	private String nombre;
	private int cantidad;
	private double peso;
	private String color;
	
	
	public Dulce() {
	}
	
	
	
	
	public Dulce(String nombre, int cantidad, double peso, String color) {
	
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.peso = peso;
		this.color = color;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getCantidad() {
		return cantidad;
	}




	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	@Override
	public String toString() {
		return "Dulce [nombre=" + nombre + ", cantidad=" + cantidad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	
	

}
