package com;

public class Almacenamiento {
	
	private String marca;
	private int capacidad;
	private String tipo;
	private double tamañoFisico;
	
	//constructores
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(String marca, int capacidad, String tipo, double tamañoFisico) {
		
		this.marca = marca;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.tamañoFisico = tamañoFisico;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamañoFisico() {
		return tamañoFisico;
	}

	public void setTamañoFisico(double tamañoFisico) {
		this.tamañoFisico = tamañoFisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", capacidad=" + capacidad + ", tipo=" + tipo + ", tamañoFisico="
				+ tamañoFisico + "]";
	}

	
	
}
