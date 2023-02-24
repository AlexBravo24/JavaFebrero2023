package com;

public class RAM {

	private String marca;
	private double frecuencia;
	private int capacidad;
	private String generacion;
	
	//Constructores
	
	public RAM() {
		
	}

	public RAM(String marca, double frecuencia, int capacidad, String generacion) {
		this.marca = marca;
		this.frecuencia = frecuencia;
		this.capacidad = capacidad;
		this.generacion = generacion;
	
	}

	
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", frecuencia=" + frecuencia + ", capacidad=" + capacidad + ", generacion="
				+ generacion + "]";
	}
	
}
