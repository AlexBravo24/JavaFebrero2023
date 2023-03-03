package com;

public class RAM {
	
	 private String marca;
	 private int capacidad;
	 private double frecuenia;
	 private String generacion;

	 public RAM() {
		
	}

	public RAM(String marca, int capacidad, double frecuenia, String generacion) {
		
		this.marca = marca;
		this.capacidad = capacidad;
		this.frecuenia = frecuenia;
		this.generacion = generacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getFrecuenia() {
		return frecuenia;
	}

	public void setFrecuenia(double frecuenia) {
		this.frecuenia = frecuenia;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", capacidad=" + capacidad + ", frecuenia=" + frecuenia + ", generacion="
				+ generacion + "]";
	}
	
	
	 

	 
}
