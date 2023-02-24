package com;

public class Casa {
	private double superficie;
	private int habitaciones;
	private String color;
	private double precio;
	
	private Ubicacion direccion;
	private Persona dueño;
	
	
	public Casa() {
		
	}
	public Casa(double superficie, int habitaciones, String color, double precio, Ubicacion direccion, Persona dueño) {
		
		this.superficie = superficie;
		this.habitaciones = habitaciones;
		this.color = color;
		this.precio = precio;
		this.direccion = direccion;
		this.dueño = dueño;
	}
	
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
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
	public Ubicacion getDireccion() {
		return direccion;
	}
	public void setDireccion(Ubicacion direccion) {
		this.direccion = direccion;
	}
	public Persona getDueño() {
		return dueño;
	}
	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}
	
	
	@Override
	public String toString() {
		return "Casa [superficie=" + superficie + ", habitaciones=" + habitaciones + ", color=" + color + ", precio="
				+ precio + ", \ndireccion=" + direccion + ", \ndueño=" + dueño + "]";
	}
	
	
}
