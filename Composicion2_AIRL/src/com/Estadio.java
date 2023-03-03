package com;

public class Estadio {
	private String nombre;
	private String ubicacion;
	private int capacidad;
	private String fecha_inag;
	
	public Estadio() {
		
	}

	public Estadio(String nombre, String ubicacion, int capacidad, String fecha_inag) {
		
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
		this.fecha_inag = fecha_inag;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getFecha_inag() {
		return fecha_inag;
	}

	public void setFecha_inag(String fecha_inag) {
		this.fecha_inag = fecha_inag;
	}

	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", ubicacion=" + ubicacion + ", capacidad=" + capacidad + ", fecha_inag="
				+ fecha_inag + "]";
	}
	
	

}
