package com;

public class Casa {
	private double superficie;
	private int habitaciones;
	private String color;
	private double precio;
	
	private Ubicacion direccion;
	private Persona due�o;
	
	
	public Casa() {
		
	}
	public Casa(double superficie, int habitaciones, String color, double precio, Ubicacion direccion, Persona due�o) {
		
		this.superficie = superficie;
		this.habitaciones = habitaciones;
		this.color = color;
		this.precio = precio;
		this.direccion = direccion;
		this.due�o = due�o;
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
	public Persona getDue�o() {
		return due�o;
	}
	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}
	
	
	@Override
	public String toString() {
		return "Casa [superficie=" + superficie + ", habitaciones=" + habitaciones + ", color=" + color + ", precio="
				+ precio + ", \ndireccion=" + direccion + ", \ndue�o=" + due�o + "]";
	}
	
	
}
